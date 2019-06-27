package SDA.Graphs.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {
    MyList list;
    @Before
    public void setup(){
        list = new MyList();
    }

    @Test
    public void addToList() {
        list.addToList(new Node(1));
        list.addToList(new Node(2));
        list.addToList(new Node(3));
        list.addToList(new Node(4));
        int actual;
        actual = list.getNextNode().getData();
        Assert.assertEquals(1,actual);
        actual = list.getNextNode().getData();
        Assert.assertEquals(2,actual);
        actual = list.getNextNode().getData();
        Assert.assertEquals(3,actual);
        actual = list.getNextNode().getData();
        Assert.assertEquals(4,actual);
    }
}