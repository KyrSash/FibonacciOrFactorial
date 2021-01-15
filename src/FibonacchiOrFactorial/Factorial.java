package FibonacchiOrFactorial;

public class Factorial {
    int rez = 1;

    public int[] getFactorialWhile(int n) {
        while (n > 0) {
            rez *= n;
            n--;
        }
        return new int[]{rez};
    }

    public int[] getFactorialDoWhile(int n) {
        if (n > 0) {
            do {
                rez *= n;
                n--;
            } while (n > 0);
        }
        return new int[]{rez};
    }

    public int[] getFactorialFor(int n) {
        for (int i = 1; i <= n; i++) {
            rez *= i;
        }
        return new int[]{rez};
    }
}
