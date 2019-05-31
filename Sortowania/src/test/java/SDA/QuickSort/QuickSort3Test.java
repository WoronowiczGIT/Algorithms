package SDA.QuickSort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class QuickSort3Test {
    QuickSort3 q3;

    @Before
    public void setUP() {
        q3 = new QuickSort3();
    }

    @Test
    public void divide() {
        int[] array = {5,4,3,1,2,3,7};
        int pivotIndex = 4;
        int pivotValue = array[pivotIndex];

        q3.divide(0,array.length-1,pivotIndex,array);

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == pivotValue){pivotIndex = i;}
        }
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] < pivotValue){Assert.assertTrue(i < pivotIndex);}
            if(array[i] > pivotValue){Assert.assertTrue(i > pivotIndex);}
        }

    }

    @Test
    public void chosePivot() {
        int[] array = {5, 4, 321, 1, 23, 5, -1, 0};

        IntStream.range(0, 100).forEach(i -> {
            int pivot = q3.chosePivot(0, array.length - 1);
            Assert.assertTrue(pivot < array.length && pivot >= 0);
        });
        int[] array2 = {0, 1};
        int pivot = q3.chosePivot(0, array2.length - 1);
        Assert.assertTrue(pivot == 0);

    }

    @Test
    public void swap() {
        int[] array = {0, 1, 2, 3};
        q3.swap(array, 0, array.length - 1);
        Assert.assertEquals(array[0], 3);
        Assert.assertEquals(array[array.length - 1], 0);

    }

    @Test
    public void sort() {
        int[] array = {1,6,2,5,3,4,7};
        int[] expected = {1,2,3,4,5,6,7};
        q3.sort(0,array.length-1,array);

        Assert.assertArrayEquals(expected,array);
    }

}