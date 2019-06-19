package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class PasswordBreaker {
    private char[] password;
    private char[] attempt;
    private Instant now = Instant.now();

    public boolean tryPassword(char[] attempt){
        return Arrays.equals(attempt,password);
    }
    public void displayResult(){
        System.out.println("solved! password: ");
        System.out.println(Arrays.toString(attempt));
        System.out.println("took: "+Duration.between(now,Instant.now()).getSeconds()+" seconds to solve.");
        System.exit(0);
    }

    public void setPassword(char[] pass){
        password = pass;
    }

    /** ASCII
     *  48 - 57, 0 - 9
     *  65 - 90, A - Z
     *  97 - 122, a - z
     *  33 - 126, specials
     */

    public void cracker(){
        cracker(1);
    }

    public void cracker(int length){
        attempt = new char[length];
        checkIndex(0);
        cracker(length+1);
    }

    public void checkIndex(int charAt){

        for (int i = 33; i < 127; i++) {
            attempt[charAt] = (char)i;

            if(tryPassword(attempt)){
                displayResult();}

            if(attempt.length > charAt+1){
                checkIndex(charAt+1);
            }
        }
    }

    public static void main(String[] args) {
        PasswordBreaker pb = new PasswordBreaker();

        pb.setPassword(new char[]{'G','a','G','A','5','s'});
        pb.cracker();
    }
}
