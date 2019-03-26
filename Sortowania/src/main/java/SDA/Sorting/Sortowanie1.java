package com.company.Sorting;

import java.util.logging.Logger;

import java.util.LinkedList;
import java.util.List;


public class Sortowanie1 {
    // dobra praktywaka aby logger zawieral nazwe klasy ktora loguje
    // loggery nie przechowuja informacji same w sobie, sa odpowiednikiem sysouta z filtrem 'info'
    // i musza byc analogicznie umieszczane w kodzie
    protected static final Logger log = Logger.getLogger(Sortowanie1.class.getName());

    public static void main(String[] args) {

        log.info("poziom info");

        log.warning("poziom warning");
    }


    public int generateRandom(){

        return (int)(Math.random()*100);
    }
    public List<Integer> randomList(){

        List<Integer> lista = new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            lista.add(generateRandom());
            //logujemy wyswietlanie kazdej wygenerowanej liczby
            log.info("wygenerowana liczba = "+ lista.get(i));
        }
        return lista;
    }

    // tab to List
    public List<Integer> tabToList(Integer[] tab){
        List<Integer>  resault = new LinkedList<>();
        for (int a: tab
        ) {
            resault.add(a);
        }
        return resault;
    }
    public List<Integer>[] evenOdd(List<Integer> input) {

        List<Integer> even = new LinkedList<>();
        List<Integer> odd = new LinkedList<>();
        List<Integer>[] resault = new List[]{even,odd};

        while (even.size() <10 || odd.size() < 10) {
            int a = generateRandom();
            if (a % 2 == 0 && even.size() < 10) {
                even.add(a);
            }
            if (a % 2 != 0 && odd.size() < 10) {
                odd.add(a);
            }
        }
        return resault;
    }


    //
    //SUPER WAZNE - NIE WYKONUJEMY NA LISTACH OPERACJI Z UZYCIEM OPERATOROW !!! NIGDY !!!
    public List<Integer> sortByPicking(List<Integer> input) {
        List<Integer> lista = new LinkedList<>();
        lista.addAll(input);

        int min;
        int index = 0;
        for (int i = 0; i < input.size(); i++) {
            min = lista.get(i);
            for (int j = i; j < input.size(); j++) {
                if (lista.get(j) < min) {
                    min = lista.get(j);
                    index = j;
                }
            }
            lista.set(index, lista.get(i));
            lista.set(i, min);
        }
        return lista;
    }

    //sort




}
