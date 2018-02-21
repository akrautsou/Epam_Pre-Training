package by.epam.preTraining.krautsou.tasks.task4.code.fibonacci;

public class Fibonacci {
    public static int fibonacciRecursive(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    public static int fibonacciIterative(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        int fibonacci = 1;
        int previousFibonacci = 1;

        for (int i = 3; i < number; i++) {
            int temp = fibonacci;
            fibonacci += previousFibonacci;
            previousFibonacci = temp;
        }
        return fibonacci;
    }
}
