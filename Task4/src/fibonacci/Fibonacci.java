package fibonacci;

public class Fibonacci {
    public int getFibonacci(int number) {
        if (number <= 0) return -1;
        if (number == 1) return 1;
        if (number == 2) return 1;
        return getFibonacci(number - 1) + getFibonacci(number - 2);
    }
}
