package com.company;

import java.util.Random;

public class CodeKata {
    //Ex 1. Count numbers occurrence in an array, and display as Chart, assuming all natural numbers >=0

    public static void sortAndDisplay(int[] array){
        int max = 0;
        for (int number : array) {
            if (number > max){
                max = number;
            }
        }
        int[]result = new int[max+1];

        for (int number : array) {
            result[number]++;
        }

        int mostOccurences = 0;

        for (int number : result) {
            if(number>mostOccurences){
                mostOccurences=number;
            }
        }
        // display * in case given occurence > 0
        for (int i = mostOccurences; i > 0 ; i--) {

            for (int j = 0; j < result.length; j++) {
                if(result[j]==0) continue;

                if(result[j] >= i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // display numbers
        for (int i = 0; i < result.length; i++) {
            if(result[i] != 0 ){
                System.out.print(i+" ");
            }
        }
    }
    //Ex 2. remove all occurences of given value from array
    public static int[] valueRemover(int[] array, int value){
        int occurences = 0;
        for (int number: array) {
            if(number == value) occurences++;
        }
        int[] result = new int[array.length-occurences];

        int iterator = 0;
        for (int number : array
             ) {
            if(number!=value){
                result[iterator] = number;
                iterator++;
            }
        }
        return result;
}

    public static int[] generateRandomArray(int size){

        int[] result = new int[size];
        for (int i = 0; i <result.length ; i++) {
            result[i] = new Random().nextInt(10);
        }
        return result;
    }
    public static void presentArray(int[] array){
        for (int number:array) {
            System.out.print(number+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray(50);
        int[] result = valueRemover(array,5);
        presentArray(result);
        System.out.println("\n"+result.length);


    }
}
