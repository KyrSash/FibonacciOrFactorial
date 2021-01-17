package FibonacchiOrFactorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacchiOrFactorialTest {
    private static final int FIVE = 5;
    private FibonacchiOrFactorial fibonacchiOrFactorial;

    @Before
    public void setUp() throws Exception {
        fibonacchiOrFactorial = new FibonacchiOrFactorial();
    }

    @After
    public void tearDown() throws Exception {
        fibonacchiOrFactorial = null;
    }

    @Test
    public void testGetFibonacchiOrFactorial_AlgoritmOne_LooptypeOne_nFive() {
        int[] expected = fibonacchiOrFactorial.getFibonacchiOrFactorial(1, 1, FIVE);
        int[] actual = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiOrFactorial_AlgoritmOne_LooptypeTwo_nFive() {
        int[] expected = fibonacchiOrFactorial.getFibonacchiOrFactorial(1, 2, FIVE);
        int[] actual = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiOrFactorial_AlgoritmOne_LooptypeThree_nFive() {
        int[] expected = fibonacchiOrFactorial.getFibonacchiOrFactorial(1, 3, FIVE);
        int[] actual = {0, 1, 1, 2, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiOrFactorial_AlgoritmTwo_LooptypeOne_nFive() {
        int[] expected = fibonacchiOrFactorial.getFibonacchiOrFactorial(2, 1, FIVE);
        int[] actual = {120};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiOrFactorial_AlgoritmTwo_LooptypeTwo_nFive() {
        int[] expected = fibonacchiOrFactorial.getFibonacchiOrFactorial(2, 2, FIVE);
        int[] actual = {120};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGetFibonacchiOrFactorial_AlgoritmTwo_LooptypeThree_nFive() {
        int[] expected = fibonacchiOrFactorial.getFibonacchiOrFactorial(2, 3, FIVE);
        int[] actual = {120};
        assertArrayEquals(expected, actual);
    }
}