package FibonacchiOrFactorial;

public class FibonacchiOrFactorial {

    public int[] getFibonacchiOrFactorial(int algorithmld, int loopType, int n) {
        if (algorithmld == 1) {
            switch (loopType) {
                case 1:
                    System.out.println("Вычисление первых " + n + " чисел Фибоначчи через цикл while. Числа равны: ");
                    Fibonacchi fibonacchi = new Fibonacchi();
                    return fibonacchi.getFibonacchiWhile(n);
                case 2:
                    System.out.println("Вычисление первых " + n + " чисел Фибоначчи через цикл do - while. Числа равны: ");
                    Fibonacchi fibonacchi1 = new Fibonacchi();
                    return fibonacchi1.getFibonacchiDoWhile(n);
                case 3:
                    System.out.println("Вычисление первых " + n + " чисел Фибоначчи через цикл for. Числа равны: ");
                    Fibonacchi fibonacchi2 = new Fibonacchi();
                    return fibonacchi2.getFibonumbersFor(n);
                default:
                    return null;
            }
        }
        if (algorithmld == 2) {
            switch (loopType) {
                case 1:
                    System.out.println("Вычисление факториала числа " + n + " через цикл while. Факториал равен: ");
                    Factorial factorial = new Factorial();
                    return factorial.getFactorialWhile(n);
                case 2:
                    System.out.println("Вычисление факториала числа " + n + " через цикл do - while. Факториал равен: ");
                    Factorial factorial1 = new Factorial();
                    return factorial1.getFactorialDoWhile(n);
                case 3:
                    System.out.println("Вычисление факториала числа " + n + " через цикл for. Факториал равен: ");
                    Factorial factorial2 = new Factorial();
                    return factorial2.getFactorialFor(n);
                default:
                    return null;
            }
        }
        return null;
    }
}
