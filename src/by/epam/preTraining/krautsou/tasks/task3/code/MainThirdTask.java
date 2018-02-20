package by.epam.preTraining.krautsou.tasks.task3.code;

import by.epam.preTraining.krautsou.tasks.task3.code.algoritm.Solutions;
import by.epam.preTraining.krautsou.tasks.task3.code.headsOrTails.HeadsOrTails;
import by.epam.preTraining.krautsou.tasks.task3.code.idealNumber.IdealNumber;
import by.epam.preTraining.krautsou.tasks.task3.code.viewer.View;

import java.util.Scanner;

public class MainThirdTask {
    private static final int COUNT_OF_TRY = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HeadsOrTails headsOrTails = new HeadsOrTails();
        Solutions solutions = new Solutions();
        IdealNumber idealNumber = new IdealNumber();
        View view = new View();
        int number = 28778;
        int firstDigit = 15;
        int secondDigit = 5;
        int countOfHeads;
        while (true) {
            System.out.println("Enter");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:

                    view.output(countOfHeads = headsOrTails.countHeads(COUNT_OF_TRY));
                    view.output(COUNT_OF_TRY - countOfHeads);
                    break;
                case 2:
                    view.output(solutions.checkMax(number));
                    view.output(solutions.isCheckSimple(number));
                    view.output(solutions.isPalindrome(number));
                    view.output(solutions.findNOD(firstDigit, secondDigit));
                    view.output(solutions.findNOK(firstDigit, secondDigit));
                    view.output(solutions.findAllSimple(number));
                    view.output(solutions.findNumberOfDifferentDigits(number));
                    break;
                case 3:
                    view.output(idealNumber.isIdealNumber(number));
                    break;
                default:
                    System.err.println("Error");
            }
        }
    }
}
