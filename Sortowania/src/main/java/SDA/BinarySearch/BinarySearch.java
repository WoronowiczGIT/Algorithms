package com.company;

public class BinarySearch {
    private int[] array;

    public void generateSortedArray(int length, int interval){
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i*interval;
        }
    }

    public void binarySearch(int value){
        binary(value,0,array.length-1);
    }

    public int binary(int value, int start, int finish){
        if(start >= finish){
            System.out.println("found "+value+" at: "+finish);
            return start;
        }
        int pivot = finish - ((finish - start)/2);

        if(value > array[pivot]){
            binary(value,pivot+1,finish);
        }else if(value < array[pivot]){
            binary(value,start,pivot-1);
        }

        return -1;
    }


    public void linearSearch(int value){

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
        }


    }



}
