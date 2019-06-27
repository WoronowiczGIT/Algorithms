package SDA.Graphs.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneWayTraversableListTest {
    MyList list;
    OneWayTraversableList owtl;

    Node nodeA = new Node(1);
    Node nodeB = new Node(2);
    Node nodeC = new Node(3);
    @Before
    public void setup(){
        list = new MyList();
        owtl = new OneWayTraversableList();
    }
    @Test
    public void isLooped() {
        list.addToList(nodeA);
        list.addToList(nodeB);
        list.addToList(nodeC);
        list.addToList(nodeA);

        Assert.assertTrue(owtl.isLooped(nodeA));
    }

    @Test
    public void isNotLooped(){
        list.addToList(nodeA);
        list.addToList(nodeB);
        list.addToList(nodeC);

        Assert.assertFalse(owtl.isLooped(nodeA));
    }
}