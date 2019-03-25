package SDA;

import java.util.*;

public class FitnessFuncion {
    static BoardMenager menager;
    private Integer destinations;
    private Integer sampleSize;

    FitnessFuncion(Integer boardSize, Integer destinations, Integer sampleSize) {
        this.destinations = destinations;
        this.sampleSize = sampleSize;
        this.menager = new BoardMenager(destinations,boardSize);
    }

    public Integer[][] processSurvivors(List<Integer[]> survivors) {
        Integer[][] nextGeneration = new Integer[sampleSize][];
        for (int i = 0; i < survivors.size(); i++) {
            nextGeneration[i] = survivors.get(i);
        }

        int babycounter = 0;
        for (int i = survivors.size(); i < nextGeneration.length; i++) {
            Integer[] baby = breedCompetitors(nextGeneration[babycounter], nextGeneration[babycounter + 1]);
            mutateBaby(baby);
            nextGeneration[i] = baby;
            babycounter++;
        }

        return nextGeneration;
    }

    private Integer[] breedCompetitors(Integer[] father, Integer[] mother) {
        Integer[] baby = new Integer[father.length];
        for (int i = 0; i < baby.length; i++) {
            if (i < baby.length / 2) {
                baby[i] = father[i];
            } else baby[i] = mother[i];
        }
        return baby;
    }

    private void mutateBaby(Integer[] baby) {
        Deque<Integer> possibleDestinations = new ArrayDeque<>();

        for (int i = 1; i <= baby.length; i++) {
            possibleDestinations.add(i);
        }

        while (!possibleDestinations.isEmpty()) {
            for (int i = 0; i < baby.length; i++) {
                if (possibleDestinations.contains(baby[i])) {
                    possibleDestinations.remove(baby[i]);
                } else {
                    baby[i] = possibleDestinations.poll();
                }
            }
        }
    }


    public List<Integer[]> getSurvivors(Integer[][] competitors, double fitness) {
        List<Integer[]> survivors = new ArrayList<>();
        double deadLine = getAvarageDistanceForSet(competitors);
        // we assure at least 5% of new random competitors in next generation
        if (fitness > 1) fitness = 0.9;
        // we want to generate half of next generation by breeding
        // so we save only better half of competitors
        Integer maxSurvivors = sampleSize / 2;
        // other way champion can miss the ark
        survivors.add(findBestPerformer(competitors));

        while (survivors.size() < maxSurvivors) {
            for (int i = 0; i<competitors.length; i++) {
                // in case every competitor is best competitor
                if (menager.getTotalDistance(competitors[i]) < deadLine && survivors.size() < maxSurvivors * fitness) {
                    survivors.add(competitors[i]);
                }
            }
            survivors.add(generateRandomCompetitor(destinations));
        }
        return survivors;
    }


    private Integer[] generateRandomCompetitor(Integer dest) {
        Random rng = new Random();
        Integer[] competitor = new Integer[dest];

        for (int i = 1; i <= dest; i++) {
            while (true) {
                int index = rng.nextInt(dest);
                if (competitor[index] == null) {
                    competitor[index] = i;
                    break;
                }
            }
        }
        return competitor;
    }

    public Integer[][] generateCompetitors() {
        Integer[][] competitors = new Integer[sampleSize][destinations];

        for (int i = 0; i < competitors.length; i++) {
            competitors[i] = generateRandomCompetitor(destinations);
        }
        return competitors;
    }

    public Integer[] findBestPerformer(Integer[][] competitors) {
        Map<Integer[], Double> dataSet = menager.getDistancesForGivenPathSet(competitors);
        Double bestPerformence = dataSet.get(competitors[0]);
        Integer[] bestPerformer = competitors[0];

        for (Integer[] competitor : dataSet.keySet()) {
            if (dataSet.get(competitor) < bestPerformence) {
                bestPerformence = dataSet.get(competitor);
                bestPerformer = competitor;
            }
        }
        return bestPerformer;
    }

    public Double getAvarageDistanceForSet(Integer[][] competitors) {
        Map<Integer[], Double> dataSet = menager.getDistancesForGivenPathSet(competitors);
        Double avarageDistance = 0.0;
        for (Integer[] competitor : dataSet.keySet()) {
            avarageDistance += menager.getTotalDistance(competitor);
        }
        avarageDistance = avarageDistance / dataSet.size();
        return avarageDistance;
    }





    public static void main(String[] args) {
        FitnessFuncion ff = new FitnessFuncion(25,3,15);

        Integer[][] competitors = ff.menager.getAllPossibleCombinations();
        System.out.println("fitness function\n");
        // find best performer
        for (Integer x : ff.findBestPerformer(ff.menager.getAllPossibleCombinations())) {
            System.out.print(x);
        }
        // show distances for every path in whole set
        Map<Integer[], Double> dataSet = ff.menager.getDistancesForGivenPathSet(competitors);
        for (Integer[] key : dataSet.keySet()) {
            System.out.println();

            for (Integer x : key) {
                System.out.print(x);
            }
            System.out.print(" " + dataSet.get(key));
        }
        // show avarage distance
        System.out.println("\n avarage distance " + ff.getAvarageDistanceForSet(competitors) + "\n");

        for (Integer x : ff.generateRandomCompetitor(5)) {
            System.out.print(x);
        }
        // kill the loosers
        for (Integer[] key : ff.getSurvivors(competitors,1)) {
            System.out.println();
            for (Integer x : key) {
                System.out.print(x);
            }
            System.out.println();
        }
        // make artificial baby
        Integer[] baby = ff.breedCompetitors(new Integer[]{1, 5, 3, 4, 2, 6}, new Integer[]{6, 2, 1, 4, 5, 3});
        // show baby
        for (Integer x : baby) {
            System.out.print(x);
        }
        // show mutatedBaby
        System.out.println();
        ff.mutateBaby(baby);
        for (Integer x : baby) {
            System.out.print(x);
        }

        // Generating next gen from survivors
        System.out.println("\n########################");
        List<Integer[]> testSurvivors = new ArrayList<>();
        testSurvivors.add(new Integer[]{1, 5, 3, 4, 2, 6});
        testSurvivors.add(new Integer[]{1, 3, 5, 4, 2, 6});
        testSurvivors.add(new Integer[]{6, 5, 3, 4, 2, 1});
        testSurvivors.add(new Integer[]{1, 5, 2, 4, 3, 6});

        Integer[][] nextGen = ff.processSurvivors(testSurvivors);

        for (Integer[] competitor : nextGen
        ) {
            System.out.println();
            for (Integer x : competitor
            ) {
                System.out.print(x);
            }
        }

    }
}
