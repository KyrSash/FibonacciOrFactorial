package FibonacchiOrFactorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial factorial;

    private final static int ZERO = 0;
    private final static int ONE = 1;
    private final static int FIVE = 5;
    private final static int TEN = 10;

    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial = null;
    }

    @Test
    public void testGetFactorialWhile_Five() {
        int[] expected = factorial.getFactorialWhile(FIVE);
        int[] actual = {120};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialWhile_One() {
        int[] expected = factorial.getFactorialWhile(ONE);
        int[] actual = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialWhile_Zero() {
        int[] expected = factorial.getFactorialWhile(ZERO);
        int[] actual = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialWhile_Ten() {
        int[] expected = factorial.getFactorialWhile(TEN);
        int[] actual = {3628800};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialDoWhile_Zero() {
        int[] expected = factorial.getFactorialDoWhile(ZERO);
        int[] actual = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialDoWhile_One() {
        int[] expected = factorial.getFactorialDoWhile(ONE);
        int[] actual = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialDoWhile_Five() {
        int[] expected = factorial.getFactorialDoWhile(FIVE);
        int[] actual = {120};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialDoWhile_Ten() {
        int[] expected = factorial.getFactorialDoWhile(TEN);
        int[] actual = {3628800};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialFor_Zero() {
        int[] expected = factorial.getFactorialFor(ZERO);
        int[] actual = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialFor_One() {
        int[] expected = factorial.getFactorialFor(ONE);
        int[] actual = {1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialFor_Five() {
        int[] expected = factorial.getFactorialFor(FIVE);
        int[] actual = {120};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testGetFactorialFor_Ten() {
        int[] expected = factorial.getFactorialFor(TEN);
        int[] actual = {3628800};
        assertArrayEquals(actual, expected);
    }
}