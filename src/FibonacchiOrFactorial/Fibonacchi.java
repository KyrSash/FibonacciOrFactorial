package FibonacchiOrFactorial;

public class Fibonacchi {

    public int[] getFibonacchiWhile(int n) {
        int[] fibonumbers = new int[n];
        fibonumbers[0] = 0;
        fibonumbers[1] = 1;
        int i = 2;

        while (i < n) {
            fibonumbers[i] = fibonumbers[i - 1] + fibonumbers[i - 2];
            i++;
        }
        return fibonumbers;
    }

    public int[] getFibonacchiDoWhile(int n) {
        int[] fibonumbers = new int[n];
        fibonumbers[0] = 0;
        fibonumbers[1] = 1;
        int i = 2;

        if (n > 2) {
            do {
                fibonumbers[i] = fibonumbers[i - 1] + fibonumbers[i - 2];
                i++;
            } while (i < n);
        }
        return fibonumbers;
    }

    public int[] getFibonumbersFor(int n) {
        int[] fibonumbers = new int[n];
        fibonumbers[0] = 0;
        fibonumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonumbers[i] = fibonumbers[i - 1] + fibonumbers[i - 2];
        }
        return fibonumbers;
    }
}
