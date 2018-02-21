package by.epam.preTraining.krautsou.tasks.task4.code;

import by.epam.preTraining.krautsou.tasks.task4.code.equals.ClassForEquals;
import by.epam.preTraining.krautsou.tasks.task4.code.fibonacci.Fibonacci;
import by.epam.preTraining.krautsou.tasks.task4.code.hanoiTower.HanoiTower;
import by.epam.preTraining.krautsou.tasks.task4.code.power.Power;
import by.epam.preTraining.krautsou.tasks.task4.code.sumOfDigit.SumOfDigit;
import by.epam.preTraining.krautsou.tasks.task4.code.viewPack.Viewer;

public class MainFourthTask {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        SumOfDigit sumOfDigit = new SumOfDigit();
        Fibonacci fibonacci = new Fibonacci();
        ClassForEquals equalsClass = new ClassForEquals();
        HanoiTower hanoiTower = new HanoiTower();
        Power power = new Power();
        int number = 5;
        double digit = 3.5;
        int degree = 2;
        char a = 'A';
        char b = 'B';
        char c = 'C';

        viewer.output(sumOfDigit.getSumRecursion(number));
        viewer.output(sumOfDigit.getSumIteration(number));
        viewer.output(fibonacci.getFibonacci(number));
        viewer.output(fibonacci.fibonacciIterative(number));
        viewer.output(power.getPowerRecursion(digit, degree));
        viewer.output(power.getPowerIteration(digit, degree));


        viewer.output(equalsClass.getEquals(sumOfDigit.getSumRecursion(degree), number));
        viewer.output(hanoiTower.moveDisks(number, a, b, c));
    }
}
