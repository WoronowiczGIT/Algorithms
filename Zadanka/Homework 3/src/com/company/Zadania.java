package com.company;
import java.sql.Array;
import java.util.*;

public class Zadania {
    private Scanner wejscie = new Scanner(System.in);

    // *** ZAD 1 - SPR CZY LICZBA JEST DODATNIA CZY UJEMNA***

    public void plusCzyMinus() {
        // input data
        System.out.println("podaj liczbe: ");
        double liczba = wejscie.nextDouble();
        //if loop that checks for positive
        if (liczba > 0) {
            System.out.println("number is positive");
            //if loop that checks for negative
        } else if (liczba < 0) {
            System.out.println("number is negative");
            //if loop that checks for zero
        } else {
            System.out.println("number is 0");
        }
    }

    // *** ZAD 2 - ROZWIAZYWANIE ROWNANIA KWADRATOWEGO

    public void rownaniaKwadratowe() {
        boolean dalej = false;
        do {

            // wczytanie parametrow
            System.out.println("Podaj parametry rownania kwadratowego (a,b,c)");
            System.out.print("podaj a: ");
            double a = wejscie.nextDouble();
            System.out.print("podaj b: ");
            double b = wejscie.nextDouble();
            System.out.print("podaj c: ");
            double c = wejscie.nextDouble();

            //reprezentacja graficzna wczytanej funkcji
            String znakB = " ";
            String znakC = " ";
            if (b > 0) {
                znakB = " +";
            }
            if (c > 0) {
                znakC = " +";
            }
            System.out.println("towje rownanie to: ");
            System.out.println(a + "*X^2" + znakB + b + "*X" + znakC + c);


            // wczytanie argumentu:
            System.out.println("Podaj X dla ktorego chcesz obliczyc wartosc: ");
            double x = wejscie.nextDouble();

            //Rozwiazanie rownania

            double y = (a * (x * x)) + (b * x) + (c * x);

            //wyswietlenie wyniku

            System.out.println("dla x = " + x + " y = " + y);

            // przerwanie programu
            System.out.println("kontynuować ? t/n");
            String odNowa = wejscie.next();
            if (odNowa.equalsIgnoreCase("t")) {
                dalej = true;
            } else System.out.println("Do widzenia");
        } while (dalej);
    }

    // *** ZADANIE 3 SZUKAJ MAXIMUM
    public void findMax() {
        boolean dalej = false;
        double[] szereg = new double[3];
        do {

            // wczytanie parametrow
            System.out.println("Podaj 3 parametry");
            System.out.print("podaj a: ");
            szereg[0] = wejscie.nextDouble();
            System.out.print("podaj b: ");
            szereg[1] = wejscie.nextDouble();
            System.out.print("podaj c: ");
            szereg[2] = wejscie.nextDouble();

            double najmniejsza = -1 * Double.MAX_VALUE;
            for (int i = 0; i < szereg.length; i++) {
                if (szereg[i] > najmniejsza) {
                    najmniejsza = szereg[i];
                }
            }
            //wynik
            System.out.println("najwieksza liczba to :" + najmniejsza);

            // przerwanie programu
            System.out.println("kontynuować ? t/n");
            String odNowa = wejscie.next();
            if (odNowa.equalsIgnoreCase("t")) {
                dalej = true;
            } else System.out.println("Do widzenia");
        } while (dalej);
    }

    // *** ZADANIE 4 - DZIEN TYGODNIA

    public void dayOfWeek() {
        boolean dalej = false;
        do {
            System.out.println("Podaj liczbe 1-7");
            char dzien = wejscie.next().charAt(0);

            switch (dzien) {
                case '1':
                    System.out.println("Poniedziałek");
                    break;
                case '2':
                    System.out.println("Wtorek");
                    break;
                case '3':
                    System.out.println("środa");
                    break;
                case '4':
                    System.out.println("Czwartek");
                    break;
                case '5':
                    System.out.println("Piatek");
                    break;
                case '6':
                    System.out.println("Sobota");
                    break;
                case '7':
                    System.out.println("Niedziela");
                    break;
                default:
                    System.out.println("twoj dzien jest inwalida");
                    break;
            }

            // przerwanie programu
            System.out.println("kontynuować ? t/n");
            String odNowa = wejscie.next();
            if (odNowa.equalsIgnoreCase("t")) {
                dalej = true;
            } else System.out.println("Do widzenia");
        } while (dalej);
    }

    // ***ZAD 5 - POROWNYWANIE LICZB ZMIENNOPRZECINKOWYCH

    public void doubleComparator() {
        boolean dalej = false;
        boolean rownosc = false;
        do {
            // wczytanie danych
            System.out.println("Podaj 2 liczby zmiennoprzecinkowe");
            System.out.print("pierwsza liczba: ");
            double liczba1 = wejscie.nextDouble();
            System.out.print("druga liczba: ");
            double liczba2 = wejscie.nextDouble();
            System.out.println("do którego miejsca po przecinku porównywać? ");
            int jakdługo = wejscie.nextInt();

            //Export do stringa
            String pierwsza = Double.toString(liczba1);
            String druga = Double.toString(liczba2);

            // wyrównywanie szeregow zerami - eliminuje blad przekroczenia zakresu
            if (pierwsza.length() < jakdługo + 2) {
                int diff = jakdługo + 2 - pierwsza.length();
                for (int j = 0; j < diff; j++) {
                    pierwsza += "0";
                }
                if (druga.length() < jakdługo + 2) {
                    int diff2 = jakdługo + 2 - druga.length();
                    for (int j = 0; j < diff2; j++) {
                        druga += "0";
                    }
                }
                //Obliczenia
                for (int i = 0; i < jakdługo + 2; i++) {
                    //petla porownojaca
                    if (pierwsza.charAt(i) == druga.charAt(i)) {
                        rownosc = true;
                    } else {
                        rownosc = false;
                        break;
                    }
                }
            }
            // wynik
            System.out.println("czy liczby sa rowne? - " + rownosc);

            // przerwanie programu
            System.out.println("kontynuować ? t/n");
            String odNowa = wejscie.next();
            if (odNowa.equalsIgnoreCase("t")) {
                dalej = true;
            } else System.out.println("Do widzenia");
        }
        while (dalej);

    }


    // ***ZADANIE 6  - SUMA I SREDNIA

    public void sumAvarage() {

            System.out.println("podaj ciag liczb (1 2 3 4... etc)");
            String liczby = wejscie.nextLine();
            System.out.println(liczby);
            //sprawdzanie formatu
            if (liczby.contains(",")) {
                System.out.println("numbers format invaild, try again");
                return;
            }
            //zamiana Stringa na tablice double
            String[] tabString = liczby.split(" ");
            double[] tabLiczb = new double[tabString.length];

            for (int i = 0; i < tabString.length; i++) {
                tabLiczb[i] = Double.valueOf(tabString[i]);
            }
            // liczenie sumy
            double suma = 0;
            for (double a : tabLiczb
            ) {
                suma += a;
            }
            //wynik
            System.out.println("suma wynosi: " + suma + "\nsrednia wynosi: " + suma / tabLiczb.length);

    }

    // ***ZADANIE 7 KWADRAT WSZYSTKICH LICZB <=N

    public void listOfcubes() {
        System.out.println("list of cubes");
        System.out.println("powiedz ile: ");
        int ile = wejscie.nextInt();

        for (int i = 1; i <= ile; i++) {
            System.out.println("number " + i + " cube is: " + (i * i * i));
        }

    }

    //*** ZADANIE 8 RYSOWANIE TROJKATA LICZB

    public void drawTriangle() {
        System.out.println("draw triangle");
        System.out.println("powiedz ile: ");
        int ile = wejscie.nextInt();

        for (int i = 1; i <= ile; i++) {
            int counter = 0;
            while (counter < i) {
                System.out.print(i);
                counter++;
            }
            System.out.println();
        }

    }

    //***ZADANIE 9 RYSOWANIE TROJKATAv2

    public void drawTrianglev2() {
        System.out.println("draw triangle version 2");
        System.out.println("powiedz ile: ");
        int ile = wejscie.nextInt();
        int liczba = 1;

        for (int i = 0; i < ile; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(" "+liczba);
                liczba++;
            }
            System.out.println();
        }
    }

    //***ZADANIE 10 RYSOWANIE TROJKATAv3

    public void drawTrianglev3() {
        System.out.println("draw triangle version 3");
        System.out.println("powiedz ile: ");
        int ile = wejscie.nextInt();

        for (int i = 0; i <= ile; i++) {
            boolean spacje = true;
            for (int j = 0; j < i; j++) {
                // ten while odpowiada za drukowanie pierwszego rzedu spacji
                while (spacje) {
                    // ten for wstawia odpowiednia liczbe spacji zalezna od numeru rzedu
                    for (int k = i; k < ile; k++) {
                        System.out.print(" ");
                    }
                    spacje = false;
                }
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }

    // *** ZADANIE 11 RYSOWANIE ROMBU
    public void drawRectangle() {
        System.out.println("draw rectangle");
        System.out.println("powiedz ile: ");
        int ile = wejscie.nextInt();

        for (int i = 0; i < ile; i++) {

            for (int j = 0; j < (ile - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = ile; i >= 0; i--) {

            for (int j = (ile - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*** Zadanie 12 -  TROJKAT PASCALA
    public void pascal() {
        System.out.println("trojkat pascala");
        System.out.println("ile poziomow?: ");
        int ile = wejscie.nextInt();
        //petla odpowiedzialna za dany rzad
        for (int i = 0; i < ile; i++) {
            // ten for wstawia odpowiednia liczbe spacji zalezna od numeru rzedu
            for (int k = i; k < ile; k++) {
                System.out.print("  ");
            }
            // petla odpowiedzialna za dane wyrazenie w rzedzie
            for (int j = 0; j <= i; j++) {
                //kosmetyka dla liczb 2cyfrowych
                if (nastepnyWyraz(i, j) >= 10) {
                    System.out.print(nastepnyWyraz(i, j) + " ");
                } else {
                    //drukowanie wartosci
                    System.out.print(" " + nastepnyWyraz(i, j) + " ");
                }
            }
            // przejscie do nowego rzedu
            System.out.println();
        }
    }

    public int silnia(int n) {

        int wynik = 1;
        // Bardzo wazny warunek dla n=0
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                wynik *= i;
            }
        }
        return wynik;
    }

    public int nastepnyWyraz(int rzad, int wyraz) {
        int wynik;
        wynik = silnia(rzad) / (silnia(wyraz) * silnia((rzad - wyraz)));
        return wynik;
    }

    //*** Zadanie 13 - usuwanie duplikatow z tablicy
    public void removeCopy(String[] szereg) {

        for (int i = 0; i < szereg.length; i++) {
            for (int j = i + 1; j < szereg.length; j++) {
                if (szereg[i].equals(szereg[j])) {
                    szereg[j] = "kopia";

                }

            }
        }
        // deklarujemy zmienna ktorej pozniej uzywamy do okreslenia wielkosci tablicy wynikowej
        // w przeciwnym razie zwracala by ona null na koncu
        // z drugiej strony nie musimy tych nulli pokazywac wiec jak kto woli :-)
        int iloscKopi = 0;
        // drukujemy tablice z zaznaczonymi polami do usuniecia
        // i liczymy ilosc kopi
        for (String element : szereg) {
            System.out.print(" " + element);
            if (element.equals("kopia")) {
                iloscKopi++;
            }
        }
        // deklarujemy tablice wynikow
        String[] wynik = new String[szereg.length - iloscKopi];
        // iterujemy po tablicy zawierajacej kopie
        // jezeli dane pole nie jest kopia, jego wartosc zostaje przypisane do tablicy wynikow
        int j = 0;
        for (int i = 0; i < szereg.length; i++) {
            if (!szereg[i].equals("kopia")) {
                wynik[j] = szereg[i];
                j++;
            }
        }
        // drukuje tablice wynikow
        System.out.println();
        for (
                String element : wynik) {
            System.out.print(" " + element);
        }
    }

    //***ZADANIE 14  roznica miedzy najmniejsza i najwieksza wartoscia w tablicy

    public void arrayDifference(int[] tablica){
    // zwracamy uwage, że max ma wartosc minimalna a min maksymalna dla danego typu danych
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < tablica.length; i++) {

            if(tablica[i] > max){
                max = tablica[i];
            }
            if(tablica[i] < min){
               min =  tablica[i];
            }
        }
        System.out.println("min "+min);
        System.out.println("max "+max);
        System.out.println("roznica: "+(max-min));

    }




}




