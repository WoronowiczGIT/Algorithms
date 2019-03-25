package SDA;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BoardService {
    private Board board;
    private Integer[][] grid;
    private int points;

    BoardService(Integer boardSize, int howManyDestinations) {

        this.board = new Board(boardSize);
        this.board.generateDestinations(howManyDestinations);
        this.grid = board.getTerritoryGrid();
        this.points = howManyDestinations;
    }
    public int getPoints(){
        return points;
    }

    public Map<Integer[],Double> getDistancesForGivenPathSet(Integer[][] pathSet){
        Map<Integer[],Double> dataSet = new HashMap<>();
        for (Integer[] path: pathSet
             ) {
            dataSet.put(path,getTotalDistance(path));
        }
        return dataSet;
    }

    public  Double[] getAllDistances(Integer[][] distanceMatrix){
        int resaultSize = distanceMatrix.length;
        Double[] resault = new Double[resaultSize];

        for (int i = 0; i < resaultSize; i++) {
            resault[i] = getTotalDistance(distanceMatrix[i]);
        }
        return resault;
    }

    public Integer[][] getAllPossibleCombinations() {

        int resaultSize = factorial(points);
        Integer[][] resaults = new Integer[resaultSize][points];
        Integer[] path = new Integer[points];

        for (int i = 0; i < path.length; i++) {
            path[i] = i + 1;
        }
        int counter=0;
        while(counter<resaultSize) {
            for (int i = 0; i < points - 1; i++) {
                resaults[counter] = path.clone();
                swap(path, i, (i+1));
                counter++;
            }
        }
        return resaults;
    }

    public Double getTotalDistance(Integer[] path) {
        if (path.length != points) {
            return 0.0;
        }
        Double[][] matrix = getRelativeDistances();
        Double distance = 0.0;
        for (int i = 0; i < path.length - 1; i++) {
            if (path[i] > points || path[i] < 1) {
                return 0.0;
            }
            int x = path[i] - 1;
            int y = path[i + 1] - 1;
            distance += matrix[x][y];
        }
        return distance;
    }

    public Double[][] getRelativeDistances() {
        Double[][] resault = new Double[points][points];
        for (int i = 0; i < points; i++) {
            for (int j = 0; j < points; j++) {
                resault[i][j] = PairPointDistance(getPoint(i + 1), getPoint(j + 1));
            }
        }
        return resault;
    }

    public Double PairPointDistance(Point A, Point B) {
        Double distance;
        double xAxis = Math.pow((double) (A.getX() - B.getX()), 2);
        double yAxis = Math.pow((double) (A.getY() - B.getY()), 2);
        distance = Math.sqrt(xAxis + yAxis);
        return distance;
    }

    public Point getPoint(Integer value) {
        int size = grid.length;
        Point point;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == value) {
                    point = new Point(i, j);
                    return point;
                }
            }
        }
        return null;
    }

    // UTILITIES
    public void swap(Integer[] array,Integer A, Integer B) {
        Integer temp;
        temp = array[A];
        array[A] = array[B];
        array[B] = temp;
    }

    public Integer factorial(Integer value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }

    public void printDistanceGrid() {
        int i = 1;
        System.out.println();
        for (int j = 1; j <= getRelativeDistances().length; j++) {
            System.out.print("    " + j + " ");
        }
        for (Double[] row : getRelativeDistances()
        ) {
            System.out.print("\n" + i++ + "| ");
            for (Double x : row
            ) {
                if (x < 10) {
                    System.out.print(Math.rint(x) + "  |");
                } else System.out.print(Math.rint(x) + " |");
            }
        }
    }

    public void printTerritoryGrid() {
        for (Integer[] row : grid
        ) {
            System.out.println();
            for (Integer x : row
            ) {
                if (x == 0) {
                    System.out.print("_ ");
                } else System.out.print(x + " ");
            }
        }
    }

    public int getValueFromGrid(int x, int y) {
        return grid[y][x];
    }


}
