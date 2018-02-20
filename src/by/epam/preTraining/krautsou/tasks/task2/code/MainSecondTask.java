package by.epam.preTraining.krautsou.tasks.task2.code;

import by.epam.preTraining.krautsou.tasks.task2.code.convert.RevertNumber;
import by.epam.preTraining.krautsou.tasks.task2.code.countDragon.FindEyes;
import by.epam.preTraining.krautsou.tasks.task2.code.countDragon.FindHead;
import by.epam.preTraining.krautsou.tasks.task2.code.mood.FindMood;
import by.epam.preTraining.krautsou.tasks.task2.code.symbol.CheckVowels;
import by.epam.preTraining.krautsou.tasks.task2.code.viewPack.Viewer;
import by.epam.preTraining.krautsou.tasks.task2.code.workWithCalendar.CheckData;
import by.epam.preTraining.krautsou.tasks.task2.code.workWithCalendar.Day;

import java.util.Scanner;

public class MainSecondTask {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        RevertNumber convert = new RevertNumber();
        FindHead dragonHead = new FindHead();
        FindEyes dragonEyes = new FindEyes();
        FindMood smiley = new FindMood();
        CheckVowels checkVowels = new CheckVowels();
        CheckData day = new CheckData();
        Viewer viewer = new Viewer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choice number of TASK");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    int age = 15;
                    viewer.output(dragonHead.getTheNumberOfHead(age));
                    viewer.output(dragonEyes.getTheNumberOfEyes(dragonHead.getTheNumberOfHead(age)));
                    break;
                case 2:
                    char symbol = 'Y';
                    viewer.output(String.valueOf(checkVowels.isVowelsFirst(symbol)));
                    viewer.output(String.valueOf(checkVowels.isVowelsSecond(symbol)));
                    viewer.output(String.valueOf(checkVowels.isVowelsThirst(symbol)));
                    viewer.output(String.valueOf(checkVowels.isVowelsFourth(symbol)));
                    viewer.output(String.valueOf(checkVowels.isVowelsFifth(symbol)));
                    break;
                case 3:
                    int number = 15;
                    viewer.output(smiley.getSmiley(number));
                    break;
                case 4:
                    Day data = new Day();
                    data.setDay(28);
                    data.setMonth(2);
                    data.setYear(2000);
                    viewer.output(day.getTomorrowData(data));
                    break;
                case 5:
                    int digit = 17;
                    viewer.output(convert.getALetterSpelling(digit));
                    break;
                default:
                    System.err.println("Error");
            }
        }
    }
}
