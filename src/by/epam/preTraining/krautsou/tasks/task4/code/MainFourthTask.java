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
        HanoiTower hanoiTower = new HanoiTower();
        int number = 3;
        double digit = 3.5;
        int degree = 5;
        char a = 'A';
        char b = 'B';
        char c = 'C';

        viewer.output(SumOfDigit.getSumRecursion(number));
        viewer.output(SumOfDigit.getSumIteration(number));
        viewer.output(Fibonacci.fibonacciRecursive(number));
        viewer.output(Fibonacci.fibonacciIterative(number));
        viewer.output(Power.getPowerRecursion(digit, degree));
        viewer.output(Power.getPowerIteration(digit, degree));
        viewer.output(ClassForEquals.equalsRecursion(degree, number));
        viewer.output(ClassForEquals.equalsIteration(degree, number));
        viewer.output(hanoiTower.moveDisks(number, a, b, c));
    }
}
