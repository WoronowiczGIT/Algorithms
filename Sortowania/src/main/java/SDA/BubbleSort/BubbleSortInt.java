package SDA.BubbleSorting;

import SDA.BubbleSorting.BubbleSort;

public class BubbleSortInt implements BubbleSort<Integer> {


    @Override
    public Integer[] sortByBubbles(Integer[] tablica) {
            int temp;
            for (int j = 0; j < tablica.length; j++) {
                for (int i = 0; i < tablica.length - 1; i++) {
                    if (tablica[i] > tablica[i + 1]) {
                        temp = tablica[i];
                        tablica[i] = tablica[i + 1];
                        tablica[i + 1] = temp;
                    }
                }
            }
            return tablica;
    }





}
