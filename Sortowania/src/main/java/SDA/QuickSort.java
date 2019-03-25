package SDA;

public class QuickSort {

    public void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    public int getPivotIndex(int low, int high) {
        if (high / 2 < low)
            return low;
        return high / 2;
    }

    public void quickSortT(int[] input) {
        quickSortT(input, 0, input.length - 1);
    }

    private void quickSortT(int[] input, int low, int high) {
        if (low < high + 1) {
            int divider = sort(input, low, high);
            quickSortT(input, low, divider - 1);
            quickSortT(input, divider + 1, high);
        }
    }

    public int sort(int[] input, int low, int high) {
        int divider = low;
        int pivotIndex = getPivotIndex(low, high);
        int pivot = input[pivotIndex];
        swap(input, pivotIndex, high);

        for (int i = low; i < high; i++) {
            if (input[i] < pivot) {
                swap(input, i, divider++);
            }
        }
        swap(input, divider, high);

        return divider;
    }
    //Note: make sure pivot index is always in correct range
    //Note2: if(low<high+1) condition in recursive quickSort method
    //makes sure we can process in a narrow scope
    // (eg. low=0, high =0, would be skipped otherwise)




    public void quickSortT2(int[] input) {
        quickSortT2(input, 0, input.length - 1);
    }
    //Note: we assume that for low>=high, this part of array is already sorted
    //ergo - no point doing any operations
    private void quickSortT2(int[] input, int low, int high) {
        if(low>=high){return;}
        int d = divider(input, low, high);
        quickSortT2(input, low, d - 1);
        quickSortT2(input, d + 1, high);
    }
    // Note: (low-1 and high) parameter values,
    // are consequence of incrementing pointers before checking,
    // we cant increment them outside the while loop,
    // because in case where left and right pointers, would call the same value,
    // the method would enter the infinite loop.

    // Also RP > 0 condition makes sure we wont get out of bond error for:
    // - inputs with only 1 digit
    // - values at the begining of an array
    public int divider(int[] input, int low, int high) {

        int leftPonter = low-1;
        int rightPointer = high;

        int pivotIndex = getPivotIndex(low, high);
        int p = input[pivotIndex];
        swap(input, pivotIndex,high);

        while (true) {
            while (input[++leftPonter] < p);
            while (rightPointer > 0 && input[--rightPointer] > p );

            if (leftPonter >= rightPointer) {
                break;
            } else {
                swap(input, leftPonter, rightPointer);
            }
        }
        swap(input, leftPonter, high);
        return leftPonter;
    }


}
