package SDA;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SelectionSortTest {
    SelectionSort selSort;

    @Before
    public void setUp(){
        this.selSort = new SelectionSort();
    }

    @Test
    @Parameters(method = "getSortingParams")
    public void selSortTTest(Integer[] input){
        assertThat(selSort.selSortT(input))
                .isSorted()
                .contains(input);
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
