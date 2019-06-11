package com.company;

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

        for (int i = mostOccurences; i > 0 ; i--) {

            for (int j = 0; j < result.length; j++) {
                if(result[j] >= i && result[j] != 0){
                    System.out.print("* ");

                }else if(result[j] != 0 ){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            if(result[i] != 0 ){
                System.out.print(i+" ");
            }
        }


    }

    public static void main(String[] args) {

        sortAndDisplay(new int[]{1,3,4,8,8,8,3,2});

    }
}
