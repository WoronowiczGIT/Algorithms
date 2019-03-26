package com.company;
import java.util.*;


public class OXgame_v2 {
    Scanner input = new Scanner(System.in);
    Random losuj = new Random();
    int[][] board = new int[3][3];
    char player;
    OXgame_v2(char player){
        this.player = player;
    }

    void gameboard() {
        for (int[] row : board
        ) {
            for (int kol : row
            ) {
                if (kol == 1) {
                    System.out.print("|X|");
                } else  if (kol == -1) {
                    System.out.print("|O|");
                } else{
                    System.out.print("|_|");
                }
            }
            System.out.println();
        }

    }
    void makeMove(){
        System.out.print("X: ");
        int xCord = input.nextInt()-1;
        System.out.print(" Y: ");
        int yCord = input.nextInt()-1;
        board[yCord][xCord] = 1;

    }
    void oponentMove(){
        boolean valid = false;
        int safe = 10;
        do {

            int xCord = losuj.nextInt(2);
            int yCord = losuj.nextInt(2);
           if(board[yCord][xCord]==0){
               valid = true;
               board[yCord][xCord]=-1;
               System.out.println("x"+xCord+"y"+yCord);
           } safe--;
        }while(valid ==false && safe>0);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0 && safe ==0) {
                        board[i][j] = -1;
                        safe = 10;
                        break;
                    }
                }
            }


    }

    void winCondition(){

    }

    void playGame(){
        do {
            gameboard();
            makeMove();
            oponentMove();
        }while (true);

    }

}
