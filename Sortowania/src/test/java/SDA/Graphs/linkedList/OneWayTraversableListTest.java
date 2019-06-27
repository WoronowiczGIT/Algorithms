package SDA.Graphs.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneWayTraversableListTest {
    MyList list = new MyList();
    OneWayTraversableList owtl = new OneWayTraversableList();
    @Before
    public void setup(){

    }

    @Test
    public void isLooped() {
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);

        list.addToList(nodeA);
        list.addToList(nodeB);
        list.addToList(nodeC);
        list.addToList(nodeA);

        Assert.assertTrue(owtl.isLooped(nodeA));
    }
}