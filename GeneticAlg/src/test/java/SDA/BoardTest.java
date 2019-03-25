package SDA;


import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class BoardTest {
    Board board;
    Integer size = 5;
    @Before
    public void setUP(){
        this.board = new Board(size);
    }

    @Test
    public void constructorTest(){
        Integer boardLenght = board.getTerritoryGrid().length;
        Assert.assertEquals(boardLenght,size);
        for (Integer[] row: board.getTerritoryGrid()
             ) {
            Assert.assertArrayEquals(board.getTerritoryGrid()[0],row);
        }
    }
    @Test

    public void populatingGridTest(){
        board.generateDestinations(5);
        Set<Integer> controlSet = new HashSet<>();
        for (Integer[] row : board.getTerritoryGrid())
        { for (Integer x: row) {
            controlSet.add(x); }
        }
       assertThat(controlSet).containsExactlyInAnyOrder(0,1,2,3,4,5);
        assertThat(controlSet).hasSize(size+1);
    }


}
