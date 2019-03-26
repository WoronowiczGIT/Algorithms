package com.company;
import java.util.*;

public class GameBoard {
    Scanner input = new Scanner(System.in);
    int[][] xCord;
    int[][] oCord;
    private char kolumns = 'A';
    private int rows = 1;
    int bSX;
    int bSY;
    int[][] board;

    GameBoard(int boardSizeX, int boardSizeY) {
        // <- wprowadzić ograniczenie do 9x9
        bSY = boardSizeY;
        bSX = boardSizeX;
        board = new int[bSY][bSX];

    }



        public void drawGameBoard(){
            System.out.print(" ");
            for (int i = 0; i < bSX; i++) {
                System.out.print(" "+(kolumns++)+" ");
            }
            for (int i = 0; i < bSY; i++) {
                System.out.print("\n"+rows++);
                for (int j = 0; j < bSX; j++) {
                    System.out.print("|_|");
                }
            }
            System.out.println();

        }

        public void drawBoard(){
            rows = 1;
            kolumns = 'A';
            System.out.print("\n ");
            for (int i = 0; i < bSX; i++) {
                System.out.print(" "+(kolumns++)+" ");
            }
            for (int[] row: board
                 ) {
                System.out.print("\n"+rows++);
                for (int koluma: row
                     ) {
                        if(koluma == 0){
                            System.out.print("|_|");
                        }else if(koluma == 1){
                            System.out.print("|X|");
                        }else   if(koluma == -1){
                            System.out.print("|O|");
                        }else System.out.print("|_|");

                }

            }
            System.out.println();
        }







}
