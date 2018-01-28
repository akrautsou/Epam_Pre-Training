import java.util.Scanner;

class First {
    static void start() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        Double weight;
        System.out.println("Enter the weight of dino");
        weight = scanner.nextDouble();
        System.out.println("Do you wanna see kg or tons");
        System.out.println("1 - kg");
        System.out.println("2 - tons");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(intokg(weight));
                break;
            case 2:
                System.out.println(intoton(weight));
                break;
            default:
                System.err.println("Error");
                break;

        }
    }

    private static Double intokg(Double weight) {
        Double weightkg;
        weightkg = weight / 1000;
        return weightkg;
    }

    private static Double intoton(Double weight) {
        Double weightton;
        weightton = weight / 1000000;
        return weightton;
    }
}
