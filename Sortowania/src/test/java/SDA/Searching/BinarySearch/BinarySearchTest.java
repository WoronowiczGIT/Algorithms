package SDA.Searching.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BinarySearchTest {
    private BinarySearch bs;
    @Before
    public void setup(){
        bs = new BinarySearch();
    }

    @Test
    public void binarySearch() {
        int length = 100;
        for (int value = 0; value < length; value++) {
            bs.generateSortedArray(100);
            Assert.assertTrue(Arrays.asList(bs.getArray()).contains(value));

            int expected = Arrays.binarySearch(bs.getArray(),value);
            int actual = bs.binarySearch(value);
            Assert.assertEquals(expected,actual);
        }
    }
    @Test
    public void argumentNotIncluded(){
        int value = 5;
        bs.generateSortedArray(value);
        int expected = -1;
        int actual = bs.binarySearch(value);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void linearSearch() {
        int value = 50;
        bs.generateSortedArray(100);
        Assert.assertTrue(Arrays.asList(bs.getArray()).contains(value));

        int expected = Arrays.binarySearch(bs.getArray(),value);
        int actual = bs.linearSearch(value);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void performanceTestBestCase(){

        bs.generateSortedArray(1234567);
        int value = 10;

        Instant binaryStart = Instant.now();
        for (int i = 0; i <1234567; i++) {
            bs.binarySearch(value);
        }
        Instant binaryFinish = Instant.now();

        Instant linearStart = Instant.now();
        for (int i = 0; i <1234567; i++) {
            bs.linearSearch(value);
        }
        Instant linearFinish = Instant.now();

        Duration binaryDuration = Duration.between(binaryStart,binaryFinish);
        Duration linearDuration = Duration.between(linearStart,linearFinish);

        Assert.assertTrue(linearDuration.getNano() < binaryDuration.getNano());

    }
    @Test
    public void performanceTestRegularCase(){
        int bigValue = 123456;
        bs.generateSortedArray(123456);
        int value = bigValue/2;

        Instant binaryStart = Instant.now();
        for (int i = 0; i <1234; i++) {
            bs.binarySearch(value);
        }
        Instant binaryFinish = Instant.now();

        Instant linearStart = Instant.now();
        for (int i = 0; i <1234; i++) {
            bs.linearSearch(value);
        }
        Instant linearFinish = Instant.now();

        Duration binaryDuration = Duration.between(binaryStart,binaryFinish);
        Duration linearDuration = Duration.between(linearStart,linearFinish);

        Assert.assertTrue(linearDuration.getNano() > binaryDuration.getNano());
    }
    @Test
    public void performanceTestWorstCase(){
        int bigValue = 123456;
        bs.generateSortedArray(123457);
        int value = bigValue;

        Instant binaryStart = Instant.now();
        for (int i = 0; i <1234; i++) {
            bs.binarySearch(value);
        }
        Instant binaryFinish = Instant.now();

        Instant linearStart = Instant.now();
        for (int i = 0; i <1234; i++) {
            bs.linearSearch(value);
        }
        Instant linearFinish = Instant.now();

        Duration binaryDuration = Duration.between(binaryStart,binaryFinish);
        Duration linearDuration = Duration.between(linearStart,linearFinish);

        Assert.assertTrue(linearDuration.getNano() > binaryDuration.getNano());
    }
}