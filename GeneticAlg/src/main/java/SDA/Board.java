package SDA;

import java.util.Random;

public class Board {
    private Integer[][] territoryGrid;
    Board (Integer size){
        this.territoryGrid = new Integer[size][size];
        initGridValues();
    }
    private void initGridValues(){
        for (int i = 0; i <territoryGrid.length ; i++) {
            for (int j = 0; j < territoryGrid.length; j++) {
                territoryGrid[i][j]=0;
            }
        }
    }

    public Integer[][] getTerritoryGrid(){
        return territoryGrid;
    }

    public void generateDestinations(int howManyDestinations){
        Random rng = new Random();
        for (int i = 1; i <= howManyDestinations ; i++) {
            while(true){
                int X = rng.nextInt(territoryGrid.length-1);
                int Y = rng.nextInt(territoryGrid.length-1);
                if(territoryGrid[Y][X] == 0){
                territoryGrid[Y][X] = i;
                    break;
                }
            }
        }
    }




}
