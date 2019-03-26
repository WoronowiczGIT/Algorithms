package SDA;

import java.lang.reflect.Array;
import java.util.*;

public class Algorytmy {
    Scanner wejscie = new Scanner(System.in);

    //###ZAD5
    // Znajdz najwieksza i najmniejsza w 10-elementowej tablicy

    public void sumaPar(int[] tab) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > min) {
                min = tab[i];
                indexMax = i;
            }
            if (tab[i] < max) {
                max = tab[i];
                indexMin = i;
            }
        }
        System.out.println( "minm: " + min +
                            " max: " + max +
                            " index min: " + indexMin +
                            " index max: " + indexMax);
    }

    //### ZAD6
    public void evenOdd() {
        System.out.println("podaj szereg liczb, 0 konczy wprowadzanie");
        ArrayList<Integer> lista = new ArrayList<>();
        boolean doThis = true;
        int number;
        while (doThis == true) {
            number = wejscie.nextInt();
            if (number != 0) lista.add(number);
            else doThis = false;
        }
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();

        for (Integer numb : lista
        ) {
            if (numb % 2 == 0) {
                even.add(numb);
            } else odd.add(numb);
        }
        System.out.println( "liczba elementow: " + lista.size() +
                            " liczba even " + even.size() +
                            " odd: " + odd.size());
        System.out.println( "elementy: " + lista +
                            " even: " + even +
                            " odd: " + odd);
    }

    //###Zad8 oddaj 1 polowe slowa
    public String returnHalf(String tekst) {
        int dlugi = tekst.length();
        String secondHalf = tekst.substring(tekst.length() / 2);
        tekst = tekst.replace(secondHalf, "");
        System.out.println("dlugosc: " + tekst.length() + " pierwotna: " + dlugi);

        return tekst;
    }
    //### Zad 9 Palindrom

    public boolean palindromeCheck(String tekst) {
        Deque<Character> litery = new LinkedList<>();
        tekst = tekst.toLowerCase();
        char[] letterArray = tekst.toCharArray();

        for (char x : letterArray) {
            litery.add(x);
        }

        while (true) {
            if (litery.isEmpty() || litery.size() == 1) return true;
            if (litery.peekFirst() == litery.peekLast()) {
                litery.pollFirst();
                litery.pollLast();
            } else return false;
        }

    }

    public void tekstAnalyzer(String tekst) {
        List<String> wordList = new LinkedList<>();
        String[] temp = tekst.split(" +");
        String shortest = temp[0];

        String longest = "", mostPopular = "", leastPopular = "";
        int currentCount = 0, maxCount = 0, minCount = temp.length;

        for (String word : temp
        ) {
            wordList.add(word);

            if (word.length() > longest.length()) {
                longest = word;
            }
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            for (String comparable : temp
            ) {
                if (word.equals(comparable)) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                mostPopular = word;
            }
            if (currentCount < minCount) {
                minCount = currentCount;
                leastPopular = word;
            }
            currentCount = 0;
        }

        System.out.println( "nadluzsze slowo: " + longest + " najkrotsze slowo: " + shortest +
                            "\nilosc slow: " + wordList.size() +
                            "\n najczescie uzywane: " + mostPopular + "wystepuje " + maxCount + " razy" +
                            "\n najzadziej uzywane: " + leastPopular + "wystepuje " + minCount + " razy");

        System.out.println(Collections.frequency(wordList, "ala"));
    }

    //### ZAD3 intermidiate Fibonnacie

    public int nthFibonacci(int ile) {
            if (ile == 0) return 0;
            if (ile == 1) return 1;
        return nthFibonacci(ile - 1) + nthFibonacci(ile - 2);
    }
    //### ZAD3B intermidiate Fibonnacie

    public List<Integer> nthFibonacciB(int ile) {
        List<Integer> wynik = new LinkedList<>();
        int pop = 1, nast = 0;
        for (int i = 0; i < ile; i++) {
            nast = nast + pop;
            wynik.add(pop + nast);
        }
        return wynik;
    }
}
