import java.util.Scanner;

class First {
    void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of dino");
        Double weight = scanner.nextDouble();
        System.out.println("Do you wanna see kg or tons");
        System.out.println("1 - kg");
        System.out.println("2 - tons");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(intoKg(weight));
                break;
            case 2:
                System.out.println(intoTon(weight));
                break;
            default:
                System.err.println("Error");
                break;

        }
    }

    private Double intoKg(Double weight) {
        return weight / 1000;
    }

    private Double intoTon(Double weight) {
        return weight / 1000000;
    }
}
