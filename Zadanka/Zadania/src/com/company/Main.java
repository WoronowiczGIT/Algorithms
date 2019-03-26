package com.company;
import java.util.*; // <-- WAŻNE

public class Main {

    public static void main(String[] args) {
        // ZADANIA TRZEBA WKLEJAC OSOBNO, ZE WZGLEDU NA WIELOKROTNE UZYWANIE TYCH SAMYCH ZMIENNYCH.
        Scanner input = new Scanner(System.in); //<-!!!uniwersalne wejscie dla wszystkich zadan!!!
//
//        // *** ZADANIE 1 ***
//
//        System.out.println("*** Zmiana stopni C na F ***");
//        System.out.println("Podaj stopnie celcjusza: ");
//        double stopnieCelc = input.nextDouble();
//        double stopnieFahr = (stopnieCelc * 1.8) + 32;
//        System.out.println("Stopnie Fahrenheita: "+ stopnieFahr);
//
//        // *** ZADANIE 2 ***
//
//        System.out.println("*** Sortowanie liczb całkowitych ***");
//        System.out.println("Podaj 3 liczby całkowite: ");
//        int najwieksza = 0;
//        int najmniejsza = Integer.MAX_VALUE;
//
//        int liczba1 = input.nextInt();
//        int liczba2 = input.nextInt();
//        int liczba3 = input.nextInt();
//
//        int[] tab = {liczba1, liczba2, liczba3};
//
//        for (int i = 0; najwieksza < tab[i]; i++) {
//            najwieksza = tab[i];
//            if (i + 1 == tab.length) break;
//        }
//        for (int i = 0; najmniejsza > tab[i]; i++) {
//            najmniejsza = tab[i];
//            if (i + 1 == tab.length) break;
//        }
//
//        System.out.println("Najwieksza: "+najwieksza+"\nNajmniejsza: "+najmniejsza);
//
//        // *** ZADANIE 3 ***
//
//        System.out.println("*** Liczenie BMI ***");
//        System.out.println("Podaj swoj wzrost(cm): ");
//        double wzrost = input.nextDouble() / 100;
//        System.out.println("Podaj swoja wage(kg): ");
//        double waga = input.nextDouble();
//
//        double Bmi = waga / (wzrost * wzrost);
//        // Zaokraglenie wyniku do 2och miejsc
//        Bmi *= 100;
//        Bmi = Math.round(Bmi);
//        Bmi /= 100;
//
//        String komentarz = "bez komentarza";
//
//        if (Bmi < 18.5) {
//            komentarz = "masz niedowage.";
//        } else if (Bmi >= 18.5 && Bmi <= 24.9) {
//            komentarz = "twoja waga jest prawidlowa.";
//        } else if (Bmi > 24.9) {
//            komentarz = "masz nadwage.";
//        }
//        System.out.println("Twoje BMI to: " + Bmi + ", " + komentarz);
//
//        // *** ZADANIE 4 ***
//
//        System.out.println("*** Obliczanie podatku dochodowego ***");
//
//        System.out.println("Podaj swój roczny dochód w żlotówkach: ");
//        double dochod = input.nextDouble();
//        double podatek = 0;
//        double stawkaGraniczna = 85528;
//
//        if(dochod < stawkaGraniczna){
//            podatek = (dochod*0.18)-556.02;
//        }else{
//            podatek = 14839.02 + ((dochod - stawkaGraniczna)*0.32);
//        }
//
//        System.out.println("Musisz zapłacić "+podatek+"PLN podatku.");
//
//        // *** ZADANIE 5 ***
//
//        System.out.println("*** Obliczanie wysokości raty ***");
//
//        // Definiowanie wysokosci pozyczki i ilosci rat
//        System.out.println("Podaj kwotę porzyczki(100 - 10.000PLN): ");
//        double dlug = input.nextDouble();
//
//        System.out.println("Podaj liczbe rat(6 - 48): ");
//        int iloscRat = input.nextInt();
//
//        // Sprawdzenie czy kwota miesci sie w wyznaczonych ramach
//        if (dlug < 100 || dlug > 10000) {
//            System.out.println("niewłaściwa kwota, podaj nowa: ");
//            dlug = input.nextDouble();
//        }
//        if (iloscRat < 6 || iloscRat > 48) {
//            System.out.println("niewłaściwa ilosc rat, podaj nowa: ");
//            iloscRat = input.nextInt();
//        }
//        //Obliczanie raty
//        double rata = 0;
//        if (iloscRat >= 6 && iloscRat <= 12) {
//            rata = (dlug + (dlug * 0.025)) / iloscRat;
//        } else if (iloscRat >= 13 && iloscRat <= 24) {
//            rata = (dlug + (dlug * 0.05)) / iloscRat;
//        } else if (iloscRat >= 25 && iloscRat <= 48) {
//            rata = (dlug + (dlug * 0.1)) / iloscRat;
//        }
//        // wydruk wyniku
//        System.out.println("Twoja rata wynosi: " + rata);
//
//        // *** ZADANIE 6 ***
//
//        System.out.println("*** KALKULATOR ***");
//        // Informacje poczatkowe
//        System.out.print("w tym kalkulatorze zrealizujesz: " +
//                "\noperacje dodawania '+'" +
//                "\noperacje odejmowania '-'" +
//                "\noperacje mnożenia '*'" +
//                "\noperacje dzielenia '/'");
//        // Tu zaczyna się petla "do while" odpowiedzialna za powtarzalnosc
//        boolean run = true;
//        do {
//            // wczytywanie liczb
//            System.out.print("\nPodaj pierwsza liczbe: ");
//            double liczba1 = input.nextDouble();
//
//            System.out.print("\npodaj operator matematyczny: ");
//            char operator = input.next().charAt(0);
//            // Petla odpowiedzialna za sprawdzanie czy operator jest wlasciwy
//            while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//                System.out.println("zly operator, podaj wlasciwy: ");
//                operator = input.next().charAt(0);
//            }
//            System.out.print("\nPodaj druga liczbe: ");
//            double liczba2 = input.nextDouble();
//            double wynik = 0;
//            // Switch odpowiedzialny za obliczenia
//
//            switch (operator) {
//                case ('+'): {
//                    wynik = liczba1 + liczba2;
//                }
//                break;
//                case ('-'): {
//                    wynik = liczba1 - liczba2;
//                }
//                break;
//                case ('*'): {
//                    wynik = liczba1 * liczba2;
//                }
//                break;
//                case ('/'): {
//                    // Dzielenie przez 0
//                    while (liczba2 == 0) {
//                        System.out.println("nie mozna dzielic przez 0!, podaj nowa liczbe: ");
//                        liczba2 = input.nextDouble();
//                    }
//                    wynik = liczba1 / liczba2;
//                }
//                break;
//            }
//            System.out.println("wynik = " + wynik);
//
//            // Czy chcesz kontynuować?
//            System.out.println("Czy chcesz liczyc dalej? (T/N): ");
//            char dalej = input.next().charAt(0);
//            switch (dalej) {
//                case ('T'):
//                    continue;
//                case ('t'):
//                    continue;
//                case ('N'): {
//                    System.out.println("Do widzenia");
//                    run = false;
//                    break;
//                }
//                case ('n'): {
//                    System.out.println("Do widzenia");
//                    run = false;
//                    break;
//                }
//                // Sprawdzenie czy warunek spełnia kryteria T/N
//                default: {
//                    do {
//                        System.out.println("zla komenda, podaj wlasciwa: ");
//                        dalej = input.next().charAt(0);
//                    } while (dalej != 'T' && dalej != 't' && dalej != 'N' && dalej != 'n');
//                }
//                break;
//            }
//        } while (run == true);
//
////     // *** ZADANIE 7 ***
//
//        System.out.println("*** Wyswietlanie liczb nieparzystych, wiekszych od podanej ***");
//        System.out.println("podaj liczbe calkowita dodatnia: ");
//
//        int liczba = 0;
//        int oddNumber = 0;
//        liczba = input.nextInt();
//        // Sprawdzenie czy liczba jest dodatnia
//        while (liczba < 0) {
//            System.out.println("podaj liczbe dodatnia!: ");
//            liczba = input.nextInt();
//        }
//        // Drukowanie liczb nieparzystych
//        for (int i = 0; oddNumber < liczba; i++) {
//            if (oddNumber % 2 != 0) {
//                System.out.println(oddNumber);
//            }
//            oddNumber++;
//        }
//        // *** ZADANIE 8 ***

//        System.out.println("*** Sumowanie ciagu liczb z uzyciem 3 roznych petli ***");
//        int a = 0;
//        int b = 0;
//        // w tej petli podajemy zmienne i sprawdzamy czy spełniaja założenia poczatkowe zadania
//        do {
//            System.out.println("Podaj liczbe 'A'= ");
//            a = input.nextInt();
//            System.out.println("Podaj liczbe 'B'= ");
//            b = input.nextInt();
//            // warunek sprawdzajacy
//            if (a > b) {
//                System.out.println("'A' musi być mniejsze od 'B'");
//            }
//        } while (a > b);
//        // deklarujemy zmienne pomocnicze
//        int counter = a;
//        int wynik = 0;
//        //Rozwiazanie petla "while"
//        while (counter <= b) {
//            wynik += counter;
//            counter++;
//        }
//        System.out.print("'while'= " + wynik);
//        //Rozwiazanie petla "do while"
//        wynik = 0;
//        counter = a; //<- resetujemy wynik i licznik
//        do {
//            wynik += counter;
//            counter++;
//        } while (counter <= b);
//        System.out.print(" 'do while'= " + wynik);
//        //Rozwiazanie petla "for"
//        wynik = 0; //<- tutaj musimy resetowac tylko wynik
//        for (counter = a; counter <= b; counter++) {
//            wynik += counter;
//        }
//        System.out.print(" 'for'= " + wynik);
//
//        // *** ZADANIE 9 *** <-Do poprawy

//        System.out.println("*** Wyswietlanie wszystkich 2^x, dla ktorych 2^x <A ***");
//
//        System.out.println("Podaj 'A'= ");
//        int a = input.nextInt();
//        int spr;
//
//        for (int i = 1; i < a; i++) {
//            spr = i;
//            // Wyjatek dla 2^0
//            if (spr == 1) {
//                System.out.print(spr + " ");
//            }
//            while (spr % 2 == 0) {
//                spr /= 2;
//                if (spr == 1) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//
////      //   *** ZADANIE 10 ***

//        System.out.println("*** Sumowanie podanego szeregu liczb ***");
//        System.out.println("Podaj szereg liczb: ");
//        int a = 0;
//        int wynik = 0;
//        do {
//            a = input.nextInt();
//            wynik += a;
//        } while (a != 0);
//        System.out.println("suma= " + wynik);
//
//        // *** ZADANIE 11 ***

//        System.out.println("*** Operacje na szeregu zadanych liczb ***");
//        System.out.println("Podaj szereg liczb: ");
//        int a;
//        int biggestNr = Integer.MIN_VALUE;
//        int smallestNr = Integer.MAX_VALUE;
//        double sum;
//        do {
//            a = input.nextInt();
//            if (a == 0) {
//                break;
//            }
//
//            if (a < smallestNr) {
//                smallestNr = a;
//            }
//            if (a > biggestNr) {
//                biggestNr = a;
//            }
//        } while (true);
//
//        sum = (biggestNr + smallestNr) / 2;
//        System.out.println("Najwieksza liczba: " + biggestNr +
//                "\nNajmniejsza liczba: " + smallestNr +
//                "\nSrednia artymetyczna: " + sum +
//                "\nSuma: " + (biggestNr + smallestNr));
//
////         ***ZADANIE 12 ***

//        System.out.println("*** Gra w za duzo za mało ***");
//        // Generowanie losowej liczby 1:100
//        Random rndm = new Random();
//
//        int guess;
//        boolean run = true;
//
//        while (run = true) { //<- Petla resetujaca gre po ukonczeniu
//            //Kod gry
//            System.out.println("Zgadnij liczbe: ");
//            int rndmValue = rndm.nextInt(100);
//            do {
//                guess = input.nextInt();
//                if (guess > rndmValue) {
//                    System.out.println("To High!");
//                } else if (guess < rndmValue) {
//                    System.out.println("To Low!");
//                } else if (guess == rndmValue) {
//                    System.out.println("You won!");
//                    break;
//                }
//                //Restart
//            } while (true);
//            System.out.println("Play again?(T/N)");
//            char dalej = input.next().charAt(0);
//            switch (dalej) {
//                case ('T'):
//                    continue;
//                case ('t'):
//                    continue;
//                case ('N'): {
//                    System.out.println("Do widzenia");
//                    run = false;
//                    break;
//                }
//                case ('n'): {
//                    System.out.println("Do widzenia");
//                    run = false;
//                    break;
//                }
//            }
//        }
//
//        // *** ZADANIE 13 ***

//        System.out.println("*** Rysujemy prostokąt! ***");
//        // Podajemy dane
//        System.out.println("Podaj kordynaty lewego górnego rogu: ");
//        System.out.print("'X'=");
//        int xCordinate = input.nextInt();
//        System.out.print("'Y'=");
//        int yCordinate = input.nextInt();
//        System.out.println("Podaj dlugosc boków: ");
//        System.out.print("Bok 'A' = ");
//        int edgeA = input.nextInt();
//        System.out.print("Bok 'B' = ");
//        int edgeB = input.nextInt();
//        // Wykorzystanie instrukcji printf do pokazania wymiarow prostokata
//        System.out.printf("Twoj kwadrat: (%d.%d) o wymiarach: (%dx%d)\n"
//                ,xCordinate,yCordinate,edgeA,edgeB);
//        //Instrukcja odpowiedzialna za wysokosc prostokata wzgledem punktu (1.1)
//        for (int i = 1; i < yCordinate; i++) {
//            System.out.println();
//        }
//        //Instrukcja rysujaca prostokat
//        for (int i = yCordinate; i < yCordinate + edgeA; i++) {
//            for (int j = 1; j < xCordinate + edgeB; j++) {
//                if (j < xCordinate) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("X");
//                }
//            }
//            System.out.println();
//
//        }
//
//        // *** ZADANIE 14 ***
//
//        System.out.println("*** Rysujemy choinke! ***");
//
//        System.out.println("Podaj wysokość choinki: ");
//        int treeHight = input.nextInt();
//       // pierwszy for skacze po rzedeach
//        for (int rowNr = 1; rowNr <= treeHight; rowNr++) {
//            int blankSpot = treeHight - rowNr;
//
//        // drugi for wstawia spacje dla kazdego rzedu
//            for (int i = 0; i < blankSpot; i++) {
//                System.out.print(" ");
//            }
//            // trzeci for wstawia gwiazdki
//            for (int j = 1; j <= (rowNr * 2) - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // ***ZADANIE 15 ***
//
//        System.out.println("***Operacje na liczbach całkowitych ***");
//        System.out.print("Podaj liczbe całkowita:");
//
//        String number = input.nextLine();
//        String[] numberS = number.split("");
//
//        int wynik=0;
//        double oddAvarage=0;
//        double evenAvarage=0;
//        int counter1=0;
//        int counter2=0;
//
//        int[] tablicaCyfr = new int[number.length()];
//
//        for (int i = 0; i < number.length(); i++) {
//            tablicaCyfr[i] = Integer.parseInt(numberS[i]);
//        }
//        for (int i = 0; i < tablicaCyfr.length; i++) {
//            wynik += tablicaCyfr[i];
//            if (tablicaCyfr[i] % 2 == 0) {
//                evenAvarage += tablicaCyfr[i];
//                counter1++;
//            }
//            if (tablicaCyfr[i] % 2 != 0) {
//                oddAvarage += tablicaCyfr[i];
//                counter2++;
//            }
//        }
//        System.out.println("srednia parzystych: " + evenAvarage / counter1);
//        System.out.println("srednia nieparzystych: " + oddAvarage / counter2);
//        System.out.println("suma cyfr: " + wynik);
//        System.out.println("stosunek sredniej artymetycznej even/odd: " +
//                (evenAvarage / counter1) / (oddAvarage / counter2));
//
//        // ***ZADANIE 16 ***
//
//               System.out.println("*** Szukamy dzielników podanej liczby ***");
//        System.out.println("Podaj liczbe: ");
//        int liczba = input.nextInt();
//
//        for (int i = liczba; i <= liczba; i--) {
//            if (i == 0) {
//                break;
//            }
//            if (liczba % i == 0) {
//                System.out.print(liczba / i + " ");
//            }
//        }
//
//        // ***ZADANIE 17 ***

//        System.out.println("*** Szukamy liczb pierwszych ***");
//        System.out.println("Podaj liczbe: ");
//        int liczba = input.nextInt();
//
//        boolean check = true;
//
//        for (int i = 2; i < liczba; i++) {
//            if (liczba <= 1) {
//                break;
//            }
//            if (liczba % i == 0) {
//                check = false;
//            }
//        }
//        System.out.println("liczba " + liczba + " jest liczba pierwsza - " + check);
//
////        // *** ZADANIE 18 ***

//        System.out.println("*** Totolotek ***");
//
//        int[] tablica = new int[20];
//        int[] tablicaWynikow = new int[10];
//
//        Random rand = new Random();
//        //zapełnianie tablicy liczbami 1:10
//        for (int i = 0; i < tablica.length; i++) {
//            tablica[i] = rand.nextInt(10) + 1;
//        }
//        //  drukowanie z uzyciem foreach <- NIE DZIALA, DLACZEGO?
//        System.out.print("tab foreach: ");
//        for (int a : tablica) {
//            System.out.print(tablica[a] + " ");
//        }
//        // drukowanie z uzyciem while
//        System.out.print("\ntab while: ");
//        int h = 0;
//        while (tablica[h] < tablica.length) {
//            System.out.print(tablica[h] + " ");
//            h++;
//            if (h == 20) {
//                break;
//            }
//        }
//        //drukowanie z uzyciem for
//        System.out.print("\ntab for: ");
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.print(tablica[i] + " ");
//        }
//        //drukowanie z uzyciem sys.out
//        System.out.println("\ntab sys.out: " + tablica[0]+" " + tablica[1] +" "+ tablica[2]);
//
//        // petla przypisujaca tablicaWynikow[0]<- wszystkie 1, tablicaWynikow[1] <- wszystkie 2 etc...
//        for (int i = 0; i < tablica.length; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (tablica[i] == j) {
//                    tablicaWynikow[j - 1]++;
//                }
//            }
//        }
//        //drukowanie wynikow
//        for (int x = 0; x < 10; x++) {
//            System.out.print("liczba " + (x + 1) + " padła " + tablicaWynikow[x] + " razy\n");
//        }
//        //Sprawdzanie czy wszystkie liczby zostały policzone właściwie
//        int counter = 0;
//        for (int z=0;z<tablicaWynikow.length;z++){
//            counter+=tablicaWynikow[z];
//        }
//        if(counter==20){
//            System.out.println(true);
//        }
//        //*** ZADANIE 19 ***

//        System.out.println("*** wyznaczamy min i max macierzy ***");
//        // deklaracje
//        Random rnd = new Random();
//        int[][] matrix= new int[5][5];
//        // generowanie macierzy
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                matrix[i][j] = rnd.nextInt(11)-5;
//            }
//        }
//        System.out.println();
//        // drukowanie macierzy
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(matrix[i][j]>=0){
//                    System.out.print(" ");
//                }
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//        // deklarowanie tablic wyników
//                int[] max = {-6,-6,-6,-6,-6};
//                int[] min = {6,6,6,6,6};
//        // obliczanie min i max dla poszczegolnych kolumn
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5; j++) {
//                if(matrix[j][i]> max[i]){
//                    max[i] = matrix[j][i];
//                }
//                    if(matrix[j][i]< min[i]){
//                        min[i] = matrix[j][i];
//                    }
//            }
//            }
//            //drukowanie wyników
//            System.out.println();
//        for (int i = 0; i <max.length ; i++) {
//            System.out.print("dla kolumny "+(i+1)+" max= "+max[i]+" min= "+min[i]+"\n");
//        }
//
//        //  *** ZADANIE 20 ***

//        System.out.println("*** konwertujemy liczby na kod binarny ZM***");
//        System.out.println("Podaj liczbe: ");
//        int liczba = input.nextInt();
//        int[] memory = new int[32];
//        int negative = liczba;
//        int byteLength=0;
//        if (liczba < 0) {
//            liczba *= -1;
//        }
//        // Zamiana na binarny
//        for (int i = 0; i < memory.length; i++) {
//            if (liczba % 2 == 0) {
//                memory[i] = 0;
//            }
//            if (liczba % 2 == 1) {
//                memory[i] = 1;
//            }
//            // dzieki temu widzimy tylko liczbe a nie wszystkie 32bity pamieci
//            if(liczba>1 || liczba <0){
//                byteLength++;
//            }
//            liczba /= 2;
//        }
//        // drukuj wynik
//        // sprawdzenie znaku
//        if(negative<0){
//            System.out.print("1.");
//        }else System.out.print("0.");
//        //postać binarna
//        for (int i = byteLength; i >= 0; i--) {
//            System.out.print(memory[i]);
//        }
//
////
//        // ***ZADANIE 21 ***
        // W tym zadaniu wykorzystuje dla każdej liczby tylko tyle 'pamieci'
        // ile dana liczba wymaga. Co ma na celu zwiekszenia czytelnosci
//        System.out.println("*** konwertujemy liczby na kod binarny ZM/ZU1/ZU2 ***");
//        System.out.println("Podaj liczbe: ");
//        int liczba = input.nextInt();
//        int[] memory = new int[32];
//        int negative = liczba;
//        int byteLength = 0;
//        // w przypadku gdy liczba jest ujemna operacje na modulo staja sie problematyczne,
//        // dlatego lepiej ja odwrocic, a za pierwotny znak odpowiada 'negative'
//        if (liczba < 0) {
//            liczba *= -1;
//        }
//        // Zamiana na binarny
//        for (int i = 0; i < memory.length; i++) {
//            if (liczba % 2 == 0) {
//                memory[i] = 0;
//            }
//            if (liczba % 2 == 1) {
//                memory[i] = 1;
//            }
//            // dzieki temu widzimy tylko bity znaczace, a nie wszystkie 32bity pamieci
//            if (liczba > 1 || liczba < 0) {
//                byteLength++;
//            }
//            liczba /= 2;
//        }
//        // drukuj wynik dla ZM
//        // sprawdzenie znaku
//        System.out.println("ZM: ");
//        if (negative < 0) {
//            System.out.print("1.(0)");
//        } else System.out.print("0.");
//        //postać binarna
//        for (int i = byteLength; i >= 0; i--) {
//            System.out.print(memory[i]);
//        }
//        // Wynik dla ZU1
//        System.out.println();
//        System.out.println("ZU1:");
//        // Dla ujemnych
//        if (negative < 0) {
//            System.out.print("1.(1)");// <- Tylko dla efektu wizualnego
//            for (int i = 0; i <= byteLength; i++) {
//                if (memory[i] == 1) {
//                    memory[i] = 0;
//                } else {
//                    memory[i] = 1;
//                }
//            }
//            for (int i = byteLength; i >= 0; i--) {
//                System.out.print(memory[i]);
//            }
//        }// dla dodatnich
//        else {
//            System.out.print("0.");
//            for (int i = byteLength; i >= 0; i--) {
//                System.out.print(memory[i]);
//            }
//        }
//        // Wynik dla ZU2
//        System.out.println();
//        System.out.println("ZU2:");
//        // korzystamy z faktu, że memory jest już zanegowane
//        if (negative < 0) {
//            System.out.print("1.(1)");
//            for (int i = 0; i <= byteLength; i++) {
//                if (memory[i] == 0) {
//                    memory[i] = 1;
//                    break;
//                } else {
//                    memory[i] = 0;
//                }
//            }
//            for (int i = byteLength; i >= 0; i--) {
//                System.out.print(memory[i]);
//            }
//        } else {
//            System.out.print("0.");
//            for (int i = byteLength; i >= 0; i--) {
//                System.out.print(memory[i]);
//            }
//        }
//
//        // ***ZADANIE 22 ***
//
//        System.out.println("*** tabela  liczb wzglednie pierwszych ***");
//        System.out.println("Podaj wymiar:(>0): ");
//
//        int liczba = input.nextInt();
//        boolean[][] matrix = new boolean[liczba][liczba];
//        // iterowanie przez macierz
//        for (int i = 0; i < liczba; i++) {
//            for (int j = 0; j < liczba; j++) {
//                //warunek bycia wzglednie pierwszymi
//                for (int k = 2; k < liczba; k++) {
//                    if ((i + 1) % k == 0 && (j + 1) % k == 0) {
//                        matrix[i][j] = false;
//                        break;
//                    } else {
//                        matrix[i][j] = true;
//                    }
//                }
//            }
//        }
//        // wydruk wyników
//        System.out.print("\n   ");
//        for (int a = 0; a < liczba; a++) {
//            System.out.print((a + 1) + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < liczba; i++) {
//
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < liczba; j++) {
//                if (matrix[i][j] == true) {
//                    System.out.print(" +");
//                } else {
//                    System.out.print(" -");
//                }
//            }
//            System.out.println();
//        }

//


    }
}



