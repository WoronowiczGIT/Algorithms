package com.company;
import java.util.*;

public class OXgame {
    Scanner input = new Scanner(System.in);
    Random losuj = new Random();
    private char player;
    GameBoard plansza = new GameBoard(3,4);
    int xCord ;
    int yCord ;
    boolean kontynuowac;

        OXgame(){
          //  selectPlayer();

         //   plansza.drawGameBoard();
        }

        public void getWinCondition(){
            //check for win
            // check for tie

        }

        public void gamePlay(){
            int iterator = 5;
            do {
                selectPlayer();
                do {
                    // draw a board
plansza.drawBoard();
                    // get a move
                    // check if valid
                    makeMove();
                    // draw a board
                  //  plansza.drawBoard();
                    //check win condition

                    // get oponent move * generate random or script?
                    // check if valid * erase comments
                    // draw a board
                    //check win condition
                    iterator--;
                }while(iterator>0);
                //continue?
                czyKontynuowac();

            }while(kontynuowac ==true);

        }
public void makeMove(){
            getMove();
            if(getPlayer()=='X'){
            plansza.board[yCord-1][xCord-1] = 1;}else
            if(getPlayer()=='O'){
                plansza.board[yCord-1][xCord-1] = -1;}
}




    public boolean checkMove(int y, int x) {
        boolean valid = false;
        if (plansza.board[y-1][x-1] == 0) {
            valid = true;
        }
        return valid;
    }

        // pobierz ruch
    public void getMove() {

        boolean validX;
        boolean validY;

        do {
            System.out.println("Wybierz pole (np A1):");
            String field = input.nextLine();
            System.out.println(field);
           // char[] subField = field.toCharArray();
          // System.out.println(subField);
            char x = field.charAt(0);
            char y = field.charAt(1);

            System.out.println(x + " " + y);
            // pobiera wspolrzedna X uwzgledniajac utf-8
            if (x >= 65 && x <= 73) {
                this.xCord = x - 64;
                validX = true;
            } else if (x >= 97 && x <= 105) {
                this.xCord = x - 96;
                validX = true;
            } else {
                validX = false;
            }
            // pobiera wspolrzedna Y uwzgledniajac utf-8
            if (y >= 1 + '0' && y <= 9 + '0') {
                this.yCord = y - '0';
                validY = true;
            } else {
                validY = false;
            }
            // Sprawdza czy obie wspolrzedne sa poprawne

            if (validX == false || validY == false) {
                System.out.println("Zły format, spróbuj ponownie");
            }else if(checkMove(yCord,xCord) == false){
                System.out.println("to pole jest zajete");
                validX = false;
            }
        } while (validX == false || validY == false);

        System.out.println(xCord + " " + yCord);

    }


    //Select player
    public void selectPlayer(){
        System.out.println("Wybierz stronę X/O");
        do {
            player = input.next().charAt(0);
            if (player == 'X' || player == 'x') {
                this.player = 'X';
                break;
            } else if (player == 'O' || player == 'o') {
                this.player = 'O';
                break;
            } else System.out.println("wybierz X albo O");
        }while(true);
        System.out.println("Wybrales "+player);
    }

    public char getPlayer(){
        return player;
    }
    public void czyKontynuowac() {
        System.out.println("Kontynuować gre?");
        while (true) {
            char odpowiedz = input.next().charAt(0);
            if (odpowiedz == 'T' || odpowiedz == 't') {
                this.kontynuowac = true;
                break;
            } else if (odpowiedz == 'N' || odpowiedz == 'n') {
                this.kontynuowac = false;
                break;
            } else {
                System.out.println("Podaj 't' albo 'n'");
            }
        }
    }

}
