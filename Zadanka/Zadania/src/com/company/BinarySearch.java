package com.company;

import java.time.Duration;
import java.time.Instant;

public class BinarySearch {
    private int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }
    public void generateSortedArray(int length, int interval){
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i+interval;
        }
    }

    public int binarySearch(int value){
        Instant binaryStart = Instant.now();
        int index = -1;



        System.out.println(Duration.between(binaryStart,Instant.now()).getSeconds());
        return index;
    }
    public void binary(int value, int start, int finish){

    }

    public int linearSearch(int value){
        Instant linearStart = Instant.now();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
        }
        System.out.println(Duration.between(linearStart,Instant.now()).getSeconds());
        return index;
    }


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.generateSortedArray(999,3);
    }
}
