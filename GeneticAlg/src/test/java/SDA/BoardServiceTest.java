package SDA;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class BoardServiceTest {
    BoardService service;
    int destinations;

    @Before
    public void setService() {
        this.service = new BoardService(10, 4);
        this.destinations = 4;
    }

    @Test
    @Parameters(method = "generatePointPair")
    public void getPairPointDistance(Point A, Point B, double distance) {
        assertThat(service.PairPointDistance(A, B)).isEqualTo(distance);
    }

    @Test
    public void getPointTest() {
        int value = 5;
        int x = service.getPoint(value).getX();
        int y = service.getPoint(value).getY();
        assertThat(service.getValueFromGrid(x, y)).isEqualTo(5);
    }

    @Test
    public void getRelativeDistanceTest() {
        Double[][] values = service.getRelativeDistances();

        Double leftValue = values[values.length - 1][0];
        Double rightValue = values[0][values.length - 1];
        assertThat(leftValue).isEqualTo(rightValue);

        Double topValue = values[0][0];
        Double bottomValue = values[values.length - 1][values.length - 1];
        assertThat(topValue).isEqualTo(bottomValue);

    }

    @Test
    public void factorialTest() {
        assertThat(service.factorial(4)).isEqualTo(24)
        ;
    }

    @Test
    public void swapTest() {
        Integer[] array = {2, 3};
        service.swap(array, 0, 1);
        assertThat(array[0]).isEqualTo(3);
        assertThat(array[1]).isEqualTo(2);
    }

    @Test
    public void getAllPossibleCombinationsTest() {
        assertThat(service.getAllPossibleCombinations().length).isEqualTo(24);
        for (int i = 0; i < service.getAllPossibleCombinations().length; i++) {
            assertThat(service.getAllPossibleCombinations()[i]).containsExactlyInAnyOrder(1, 2, 3, 4);
        }

    }

    @Test
    @Parameters(method = "getDistanceParameters")
    public void getAllDistancesTest(Integer[] A,Integer[] B) {


    // sum of all distances between point = total distance
    // distance of mirrior paths must be equal
        double distanceA = service.getTotalDistance(A);
        double distanceB = service.getTotalDistance(B);
        assertThat(distanceA).isEqualTo(distanceB);
        assertThat(service.getAllDistances(new Integer[][]{A})).isEqualTo(service.getAllDistances(new Integer[][]{B}));
}
public Object[] getDistanceParameters(){
        return new Object[] {
                new Object[]{new Integer[]{1,2,3,4}, new Integer[]{4,3,2,1}},
                new Object[]{new Integer[]{4,1,3,2}, new Integer[]{2,3,1,4}},


        };
}
    public Object[] generatePointPair(){
        return new Object[]{
          new Object[]{new Point(0,0), new Point(1,1), Math.sqrt(2)},
          new Object[]{new Point(0,0), new Point(0,0), 0},
          new Object[]{new Point(2,2), new Point(0,0), Math.sqrt(8)},
          new Object[]{new Point(0,2), new Point(0,4), Math.sqrt(4)},
        };
    }
}
