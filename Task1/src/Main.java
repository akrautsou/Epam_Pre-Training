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
        while (true) {
            System.out.println("Choice number");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    dinoWeight.start();
                    break;
                case 2:
                    radius.start();
                    break;
                case 3:
                    change.start();
                    break;
                case 4:
                    sequence.start();
                    break;
                case 5:
                    findSumAndMultiply.start();
                    break;
                case 6:
                    findAverage.start();
                    break;
                case 7:
                    numberReverse.start();
                    break;
                default:
                    System.err.println("Error");
            }
        }
    }
}
