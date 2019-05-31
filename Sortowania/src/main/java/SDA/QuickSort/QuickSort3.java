package SDA.QuickSort;

import java.util.Random;


public class QuickSort3 {

    public void sort(int start, int end, int[] array) {
        if (start >= end) return;
        int pivot = chosePivot(start, end);

        divide(start,end,pivot,array);

        sort(start,pivot-1,array);
        sort(pivot+1,end,array);
    }
    public void divide(int start, int end, int pivot,int[] array){
        int border = start;
        swap(array,pivot,end);
        for (int i = start; i < end ; i++) {
            if(array[i] < array[end]){
                swap(array,i,border);
                border++;
            }
        }
        swap(array,border,end);
    }

    public int chosePivot(int start, int end) {
        return new Random()
                .nextInt((end - start)) + start;
    }

    public void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
