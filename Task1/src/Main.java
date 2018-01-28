import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        First first = new First();
        Second second = new Second();
        Third third = new Third();
        Fourth fourth = new Fourth();
        Fifth fifth = new Fifth();
        Sixth sixth = new Sixth();
        Seventh seventh = new Seventh();
        while (true) {
            System.out.println("Choice number");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    first.start();
                    break;
                case 2:
                    second.start();
                    break;
                case 3:
                    third.start();
                    break;
                case 4:
                    fourth.start();
                    break;
                case 5:
                    fifth.start();
                    break;
                case 6:
                    sixth.start();
                    break;
                case 7:
                    seventh.start();
                    break;
                default:
                    System.err.println("Error");
            }
        }
    }
}
