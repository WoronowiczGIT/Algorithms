package SDA.MergeSort;

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
    public void testMerge() {
        Integer[] given = {1, 3, 4, 2};
        Integer[] expected = {1, 2, 3, 4};
        Integer[] sorted = ms.sort(given);
        Assert.assertArrayEquals(sorted, expected);
    }
}
