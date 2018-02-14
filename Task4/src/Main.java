import fibonacci.Fibonacci;
import sumOfDigit.SumOfDigit;
import viewPack.Viewer;
import power.Power;
import equals.ClassForEquals;

public class Main {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        SumOfDigit sumOfDigit = new SumOfDigit();
        Fibonacci fibonacci = new Fibonacci();
        ClassForEquals equalsClass = new ClassForEquals();
        Power power = new Power();
        int number = 4;
        double digit = 3.5;
        int degree = 2;
        viewer.output(sumOfDigit.getSum(number));
        viewer.output(fibonacci.getFibonacci(number));
        viewer.output(power.getPower(digit,degree));
        viewer.output(equalsClass.getEquals(sumOfDigit.getSum(degree), number));
    }
}
