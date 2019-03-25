package SDA;

public class BubbleSort implements Cloneable{


    public Integer[] bubbleSortT(Integer[] input) {

            Integer[] resault = input.clone();
            Integer temp;

            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input.length - 1; j++) {
                    if (resault[j] > resault[j + 1]) {
                        temp = resault[j];
                        resault[j] = resault[j + 1];
                        resault[j + 1] = temp;
                    }
                }
            }
            return resault;
    }

}
