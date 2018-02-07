import AverageValue.FindAverage;
import ChangePlace.Change;
import ConversionFromGramm.DinoWeight;
import Radius.Radius;
import ReverseNumber.NumberReverse;
import Sequnce.Sequence;
import SumAndMultiply.FindSumAndMultiply;
import Viewer.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        DinoWeight dinoWeight = new DinoWeight();
        Radius radius = new Radius();
        Change change = new Change();
        Sequence sequence = new Sequence();
        FindSumAndMultiply findSumAndMultiply = new FindSumAndMultiply();
        FindAverage findAverage = new FindAverage();
        NumberReverse numberReverse = new NumberReverse();
        View view = new View();
        while (true) {
            System.out.println("Choice number");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    double weight = 650;
                    view.output(dinoWeight.intoKg(weight));
                    view.output(dinoWeight.intoTon(weight));
                    break;
                case 2:
                    int radFirst = 5;
                    int radSecond = 3;
                    view.output(radius.radiusOfABagel(radFirst, radSecond));
                    break;
                case 3:
                    int a = 2;
                    int b = 3;
                    change.start(a, b);
                    break;
                case 4:
                    int number = 4678;
                    view.output(sequence.checkSequence(number));
                    break;
                case 5:
                    int digit = 45678;
                    view.output(findSumAndMultiply.findMultiply(digit));
                    view.output(findSumAndMultiply.findSum(digit));
                    break;
                case 6:
                    int numberForSix = 1234567;
                    view.output(findAverage.findAverage(findAverage.sumForAverage(numberForSix)));
                    view.output(findAverage.geomAverage(findAverage.multiplyForAverage(numberForSix)));
                    break;
                case 7:
                    int numberStart = 1234567;
                    view.output(numberReverse.reverse(numberStart));
                    break;
                default:
                    System.err.println("Error");
            }
        }
    }
}
