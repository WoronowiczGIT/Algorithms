package SDA;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class BubbleSortTest {

    BubbleSort bubbleSort;

    @Before
    public void setUp(){
        this.bubbleSort = new BubbleSort();
    }

    @Test
    @Parameters(method = "getSortingParams")
    public void bubbleSortTTest(Integer[] array){
        assertThat(bubbleSort.bubbleSortT(array))
                .doesNotContainNull()
                .contains(array);
        for (int i = 0; i < array.length-1; i++) {
            Assert.assertTrue(bubbleSort.bubbleSortT(array)[i]<= bubbleSort.bubbleSortT(array)[i+1]);
        }
    }
    @Test (expected = Exception.class)
    @Parameters(method = "getExceptionParams")
        public void bubbleSortTExcept(Integer[] array){
        bubbleSort.bubbleSortT(array);
    }

    public Object[] getExceptionParams(){
        return new Object[]{
                new Double[]{-1.0,-2.5,-3.6,-10.3},
                new String[]{"1","2","3"},
                new Character[]{'1','2','3'},
                new int[]{0,0,0,0},
        };
    }
    public Object[] getSortingParams(){
        return new Object[]{
                new Integer[]{0,5,1,1},
                new Integer[]{-1,-2,-3,-10},
                new Integer[]{-100,2,8,-15},
                new Integer[]{-1,-2,-3,-10},
                new Integer[]{0,0,0,0},
                new Integer[]{0},
        };
    }




}
