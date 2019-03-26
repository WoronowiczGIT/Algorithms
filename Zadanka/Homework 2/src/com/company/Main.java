package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Pracownik typowyJanusz = new Pracownik(22,'f',"11223354321");
//        Pracownik tomek = new Pracownik(45,'F',"33333312345");
//        Pracownik[] brygadaJanuszy = new Pracownik[] {typowyJanusz,new Pracownik(34,'m',"oleoleoleol"),typowyJanusz,typowyJanusz};
//        Firma januszPOL = new Firma(brygadaJanuszy);
//        Firma januszDE = new Firma(brygadaJanuszy);
//        typowyJanusz.setAge(55);
//        januszPOL.mojPracownik[0].setSex('M');
//
//        System.out.println("januszPOL");
//        januszPOL.mojPracownik[1].getAll();
//        januszPOL.mojPracownik[2].getAll();
//        System.out.println(januszPOL.mojPracownik[0].getSex());
//
//        System.out.println("JanuszDE");
//        januszDE.mojPracownik[0].getAll();
//        typowyJanusz.setAge(60);
//        brygadaJanuszy[3] = tomek;
//
//        januszDE.mojPracownik[3].getAll();
//        januszPOL.mojPracownik[3].getAll();
//        januszDE.mojPracownik[1].getAll();
//        //obiekt utworzony w danej klasie przechowuje wartosci tylko dla tej klasy
//        januszPOL.dyrektor.setAge(25);
//        januszDE.dyrektor.setPesel("11111122222");
//        januszDE.dyrektor.getAll();
//        januszPOL.dyrektor.getAll();
//
//        Firma januszGr = new Firma(new Pracownik[]{tomek,tomek,tomek,tomek,tomek});
//        januszGr.mojPracownik[1].getAll();

//        Firma januszGB = new Firma();
//        System.out.println(januszGB.dyrektor.getSex());
//
//        januszGB.dyrektor.setSexV2('M');
//        System.out.println(januszGB.dyrektor.getSex());
//        System.out.println(januszGB.superJanusz.getSex());
//        System.out.println();
//        januszGB.superJanusz.setAgev2();
//        System.out.println(januszGB.superJanusz.getAge());


        OXgame gra1 = new OXgame();
        OXgame_v2 gra2 = new OXgame_v2('O');

        // gra1.makeMove();
//        gra1.plansza.drawGameBoard();
//        for (int[] rzad :gra1.plansza.board
//             ) {
//            System.out.println();
//            for (int b: rzad
//                 ) {
//                System.out.print(b);
//            }
//        }
       // gra1.plansza.drawBoard();
      // gra1.gamePlay();
       // gra2.gameboard();
        gra2.playGame();

    }
}
