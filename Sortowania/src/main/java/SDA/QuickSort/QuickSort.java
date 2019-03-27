package SDA.QuickSort;

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

    public void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    private void quickSort(int[] input, int low, int high) {
        if (low < high) {
            int divider = sort(input, low, high);
            quickSort(input, low, divider - 1);
            quickSort(input, divider + 1, high);
        }else return;
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








}
