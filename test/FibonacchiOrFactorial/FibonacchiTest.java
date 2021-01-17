package FibonacchiOrFactorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacchiTest {
    private Fibonacchi fibonacchi;

    private final static int TWO = 2;
    private final static int FIVE = 5;
    private final static int TEN = 10;

    @Before
    public void setUp() throws Exception {
        fibonacchi = new Fibonacchi();
    }

    @After
    public void tearDown() throws Exception {
        fibonacchi = null;
    }

    @Test
    public void testGetFibonacchiWhile_Two() {
        int[] expected = fibonacchi.getFibonacchiWhile(TWO);
        int[] actual = {0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiWhile_Five() {
        int[] expected = fibonacchi.getFibonacchiWhile(FIVE);
        int[] actual = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiWhile_Ten() {
        int[] expected = fibonacchi.getFibonacchiWhile(TEN);
        int[] actual = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiDoWhile_Two() {
        int[] expected = fibonacchi.getFibonacchiDoWhile(TWO);
        int[] actual = {0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiDoWhile_Five() {
        int[] expected = fibonacchi.getFibonacchiDoWhile(FIVE);
        int[] actual = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiDoWhile_Ten() {
        int[] expected = fibonacchi.getFibonacchiDoWhile(TEN);
        int[] actual = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonumbersFor_Two() {
        int[] expected = fibonacchi.getFibonumbersFor(TWO);
        int[] actual = {0, 1};
    }

    @Test
    public void testGetFibonumbersFor_Five() {
        int[] expected = fibonacchi.getFibonumbersFor(FIVE);
        int[] actual = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonumbersFor_Ten() {
        int[] expected = fibonacchi.getFibonumbersFor(TEN);
        int[] actual = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, actual);
    }
}