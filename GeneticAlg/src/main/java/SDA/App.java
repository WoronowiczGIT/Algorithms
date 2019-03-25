package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

    FitnessFuncion ff = new FitnessFuncion(100,10,100);
    ff.menager.generateRandomPoints();
    Double fitness = 0.5;
    Integer[][] firstGroup = ff.generateCompetitors();
    Integer[][] testGroup = firstGroup;
    int n = 1;

    while (n<=15){
        System.out.println("## NEW GEN "+n+"##");
        Integer[] best = ff.findBestPerformer(testGroup);
        printCompetitor(best);
        System.out.println("| Distance: "+ff.menager.getTotalDistance(best));
        System.out.println("avarage score: "+ff.getAvarageDistanceForSet(testGroup)+"\n");
        testGroup = ff.processSurvivors(ff.getSurvivors(testGroup,fitness));
        n++;
    }
        System.out.println("### Static ###");
    Integer[] bestPerformer2 = ff.findBestPerformer(ff.menager.getAllPossibleCombinations());
    printCompetitor(bestPerformer2);
        System.out.println("| Distance: "+ff.menager.getTotalDistance(bestPerformer2));


    }

  static public void printCompetitor(Integer[] competitor){
        System.out.print("Best performer: ");
        for (Integer x: competitor) {
            System.out.print(x+",");
        }
    }

}
