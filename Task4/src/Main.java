import equals.ClassForEquals;
import fibonacci.Fibonacci;
import hanoiTower.HanoiTower;
import power.Power;
import sumOfDigit.SumOfDigit;
import viewPack.Viewer;

public class Main {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        SumOfDigit sumOfDigit = new SumOfDigit();
        Fibonacci fibonacci = new Fibonacci();
        ClassForEquals equalsClass = new ClassForEquals();
        HanoiTower hanoiTower = new HanoiTower();
        Power power = new Power();
        int number = 3;
        double digit = 3.5;
        int degree = 2;
        char a = '1';
        char b = '2';
        char c = '3';

        viewer.output(sumOfDigit.getSum(number));
        viewer.output(fibonacci.getFibonacci(number));
        viewer.output(power.getPower(digit,degree));
        viewer.output(equalsClass.getEquals(sumOfDigit.getSum(degree), number));
        hanoiTower.moveDisks(number, a,b,c);
    }
}
