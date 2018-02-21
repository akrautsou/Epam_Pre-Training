package by.epam.preTraining.krautsou.tasks.task4.code.fibonacci;

public class Fibonacci {
    public int getFibonacci(int number) {
        if(number <= 1) {
            return number;
        }
        if (number == 2) return 1;
        return getFibonacci(number - 1) + getFibonacci(number - 2);
    }
    public int fibonacciIterative(int number) {
        if(number <= 1) {
            return number;
        }
        int fib = 1;
        int prevFib = 1;

        for(int i=2; i<number; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
