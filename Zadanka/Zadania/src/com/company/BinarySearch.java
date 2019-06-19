package com.company;

import java.time.Duration;
import java.time.Instant;

public class BinarySearch {
    private int[] array;

    public void generateSortedArray(int length, int interval){
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i*interval;
        }
    }

    public void binarySearch(int value){
        Instant binaryStart = Instant.now();

        binary(value,0,array.length-1);

        System.out.println(Duration.between(binaryStart,Instant.now()).getNano());
    }

    public void binary(int value, int start, int finish){
        if(start >= finish){
            System.out.println("found "+value+" at: "+finish);
            return;
        }
        int pivot = finish - ((finish - start)/2);

        if(value > array[pivot]){
            binary(value,pivot+1,finish);
        }else if(value < array[pivot]){
            binary(value,start,pivot-1);
        }

    }


    public void linearSearch(int value){
        Instant linearStart = Instant.now();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
        }
        System.out.println(Duration.between(linearStart,Instant.now()).getNano()+" at "+ index);

    }


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.generateSortedArray(9999999,2);
        int value = 999999;
        bs.binarySearch(value);
        bs.linearSearch(value);

    }
}
