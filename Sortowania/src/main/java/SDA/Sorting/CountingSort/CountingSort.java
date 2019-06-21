package SDA.Sorting.CountingSort;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountingSort {

    private int findMax(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public void showResault(int[] resault) {
        for (int x : resault
        ) {
            System.out.print(x + " ");
        }
    }

    private int[] getCountingArray(int[] input) {
        int max = findMax(input);
        int[] countingArray = new int[max + 1];

        for (int i = 0; i < input.length; i++) {
            countingArray[input[i]]++;
        }
        for (int i = 0; i < countingArray.length - 1; i++) {
            countingArray[i + 1] += countingArray[i];
        }
        return countingArray;
    }

    public int[] sorting(int[] input) {
        int[] countingArray = getCountingArray(input);
        int[] resault = new int[input.length];

        for (int i = 0; i < resault.length; i++) {
            countingArray[input[i]]--;
            resault[countingArray[input[i]]] = input[i];
        }
        return resault;
    }

//########################### COUNTING MAP
    public int[] CountingSortMap(int[] input) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        int iterator=0;
        for (int element: input
             ) {
            inputMap.put(iterator,element);
            iterator++;
        }
        System.out.println(inputMap);
        // creating counting Map
        int max = Collections.max(inputMap.values());
        Map<Integer,Integer> countingMap = new HashMap<>();

        // counting values
        for (Integer index: inputMap.keySet()) {
            if (!countingMap.containsKey(inputMap.get(index))) {
                countingMap.put(inputMap.get(index),1);
            } else {
                iterator = countingMap.get(inputMap.get(index));
                iterator++;
                countingMap.put(inputMap.get(index), iterator);
            }
        }
        System.out.println(countingMap);
        // Actuall counting
        int value =0;
        for (int i = 0; i <= max; i++) {
            if(countingMap.containsKey(i)){
                 value += countingMap.get(i);
                countingMap.put(i,value);
            }
        }
        System.out.println(countingMap);

        //parsing resault
        int[] resault = new int[inputMap.size()];
        for (Integer key: inputMap.keySet()
             ) {
            int index = (countingMap.get(inputMap.get(key)));
            index--;
            countingMap.put((inputMap.get(key)),index);
            resault[index] = inputMap.get(key);
        }
        return resault;
    }

}
