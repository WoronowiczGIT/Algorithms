package SDA;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BoardMenager {
    private Integer numberOfPoints, grid;
    private Map<Integer, Point> pointsMap;


    BoardMenager(Integer howManyPoints, Integer gridSize) {
        this.numberOfPoints = howManyPoints;
        this.grid = gridSize;
        this.pointsMap = new HashMap<>();

    }

    public void generateRandomPoints() {
        int value = numberOfPoints;
        do {
            int x = new Random().nextInt(grid);
            int y = new Random().nextInt(grid);
            Point point = new Point(y, x);
            if (!pointsMap.containsValue(point)) {
                pointsMap.put(value--, point);
            }
        } while (numberOfPoints > pointsMap.size());
    }

    public void printGrid() {
        boolean flag=false;
        int value=0;
        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {

                for (Integer key : pointsMap.keySet()) {
                    int x = pointsMap.get(key).getX();
                    int y = pointsMap.get(key).getY();
                    if (j == x && i == y) {
                        flag = true;
                        value=key;
                    }
                }
                if(flag){
                    System.out.print(value+" ");
                    flag=false;
                }else System.out.print("- ");
            }
            System.out.println();
        }

    }

    public void addPoint(Integer x, Integer y, Integer value){
        pointsMap.put(value, new Point(y,x));
    }

    public Double PairPointDistance(Point A, Point B) {
        Double distance;
        double xAxis = Math.pow((double) (A.getX() - B.getX()), 2);
        double yAxis = Math.pow((double) (A.getY() - B.getY()), 2);
        distance = Math.sqrt(xAxis + yAxis);
        return distance;
    }

    public Double getTotalDistance(Integer[] path) {
        if (path.length != numberOfPoints) {
            return 0.0;
        }
        Double distance = 0.0;
        for (int i = 0; i < path.length - 1; i++) {
            Point A = pointsMap.get(path[i]);
            Point B = pointsMap.get(path[i + 1]);
            distance += PairPointDistance(A, B);
        }
        return distance;
    }

    public Map<Integer[],Double> getDistancesForGivenPathSet(Integer[][] pathSet){
        Map<Integer[],Double> dataSet = new HashMap<>();
        for (Integer[] path: pathSet
        ) {
            dataSet.put(path,getTotalDistance(path));
        }
        return dataSet;
    }

    public Integer[][] getAllPossibleCombinations() {

        int resaultSize = factorial(numberOfPoints);
        Integer[][] resaults = new Integer[resaultSize][numberOfPoints];
        Integer[] path = new Integer[numberOfPoints];

        for (int i = 0; i < path.length; i++) {
            path[i] = i + 1;
        }
        int counter=0;
        while(counter<resaultSize) {
            for (int i = 0; i < numberOfPoints - 1; i++) {
                resaults[counter] = path.clone();
                swap(path, i, (i+1));
                counter++;
            }
        }
        return resaults;
    }

    public Integer[][] generateEveryOutcome(){
        Integer[][] resault = new Integer[factorial(numberOfPoints)][];
    }

    private void swap(Integer[] array,Integer A, Integer B) {
        Integer temp;
        temp = array[A];
        array[A] = array[B];
        array[B] = temp;
    }
    private Integer factorial(Integer value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        BoardMenager des = new BoardMenager(4, 5);

        des.generateRandomPoints();
//        for (Integer key : des.pointsMap.keySet()) {
//            System.out.print(des.pointsMap.get(key).getX());
//            System.out.print(" " + des.pointsMap.get(key).getY() + "\n");
//        }
        des.printGrid();
        des.addPoint(3,3,5);
        System.out.println();
        des.printGrid();
        Double dist = des.PairPointDistance(des.pointsMap.get(1),des.pointsMap.get(5));
        System.out.println(dist);

    }
}
