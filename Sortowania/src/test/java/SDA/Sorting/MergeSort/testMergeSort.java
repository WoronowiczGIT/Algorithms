package SDA.Sorting.MergeSort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testMergeSort {
    private MergeSort ms;

    @Before
    public void setUp() {
        this.ms = new MergeSort();
    }

    @Test
    public void testMergeSort() {
        Integer[] given = {1,9, 3, 4, 2};
        Integer[] expected = {1, 2, 3, 4,9};
        Integer[] sorted = ms.sort(given);
        Assert.assertArrayEquals(sorted, expected);
    }

    @Test
    public void testMerge(){
        Integer[] a = {1,2,3};
        Integer[] b = {5,6,7,9};

        Integer[] mergedArray = ms.merge(b,a);
        Assert.assertArrayEquals(mergedArray,new Integer[]{1,2,3,5,6,7,9});

    }

}
