package SDA.Sorting.QuickSort;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class testQuicksort2 {
    QuickSort2 quickSort;

    @Before
    public void setUP() {
        this.quickSort = new QuickSort2();
    }

    @Test
    @Parameters(method = "getParameters")
    public void quickSortTest(int[] input) {
        quickSort.quickSort(input);
        assertThat(input).isSorted();
    }

    @Test
    @Parameters(method = "getParameters")
    public void dividerTest(int[] input){
        int pivotValue = input[quickSort.getPivotIndex(0,input.length-1)];
        int border = quickSort.divider(input,0,input.length-1);
        if(input.length>2) {
            for (int i = 0; i < border; i++) {
                assertThat(input[i]).isLessThanOrEqualTo(input[border]);
            }
            for (int i = input.length - 1; i > border; i--) {
                assertThat(input[i]).isGreaterThanOrEqualTo(input[border]);
            }
            assertThat(input[border]).isEqualTo(pivotValue);
        }
    }
    public Object[] getParameters() {
        return new Object[]{
                new int[]{0, 5, 1, 1},
                new int[]{-1, -2, -3, -10},
                new int[]{-100, 2, 8, -15},
                new int[]{1, 2, 3, 4, 5},
                new int[]{5, 4, 3, 2, 1},
                new int[]{-10, -5, -4, -1},
                new int[]{0, 0, 5, 0},
                new int[]{0, 0, 0, 0},
                new int[]{0},

        };
    }
}
