package SDA.BubbleSorting;

import SDA.BubbleSorting.BubbleSort;

public class BubbleSortString implements BubbleSort<String> {


    @Override
    public String[] sortByBubbles(String[] tablica) {


            String temp;
            for(int i =0 ; i<tablica.length; i++)
                for (int j = 0; j < tablica.length-1; j++) {
                    if(tablica[j].compareTo(tablica[j+1])>0){
                        temp = tablica[j];
                        tablica[j]= tablica[j+1];
                        tablica[j+1]=temp;
                    }
                }
            return tablica;
        }
    }

