package com.company;

import java.util.Arrays;

public class CodeBreaker {
    private static int[] code;
    private static int[] attempt;


    public void setCode(int[] code) {
        this.code = code;
    }

    public static void tryToOpen(int[] newAttempt) {
        if(Arrays.equals(code, newAttempt)){
            System.out.println("solved! code was: ");
            presentArray(attempt);
            System.exit(0);
        }//else System.out.println(">locked<");
    }

    public void moveDial(int dialNumber) {
        int maxValue = 9;

        if (attempt[dialNumber] > maxValue) {
            attempt[dialNumber] = 0;
        } else
            attempt[dialNumber]++;
    }

    public static void presentArray(int[] array){
        for (int number:array) {
            System.out.print(number+" ");
        }
    }

    public void cracker(){
        attempt = new int[code.length];
        clearDial(0);

    }
    public void clearDial(int dialNumber){
        if(dialNumber == code.length) return;

        int maxRotations = 10;
        for (int rotation = 0; rotation < maxRotations ; rotation++) {
            moveDial(dialNumber);
          //  System.out.println("["+dialNumber+"] => "+ attempt[dialNumber]);
            tryToOpen(attempt);
            clearDial(dialNumber+1);
        }
    }

    public static void main(String[] args) {
        CodeBreaker cb = new CodeBreaker();
        cb.setCode(new int[]{1,2,3,3,2,3,4,7,8,9,0});

        cb.cracker();
    }
}
