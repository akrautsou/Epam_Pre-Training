import java.util.Scanner;

public class Main {
    private static int choice;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        System.out.println("Choice number");
        choice = scanner.nextInt();
        switch (choice) {
            case 0:
                System.exit(0);
            case 1:
                First.start();
                break;
            case 2:
                Second.start();
                break;
            case 3:
                Third.start();
                break;
            case 4:
                Fourth.start();
                break;
            case 5:
                Fifth.start();
                break;
            case 6:
                Sixth.start();
                break;
            case 7:
                Seventh.start();
                break;
            default:
                System.err.println("Error");
                menu();
        }
        menu();
    }
}
