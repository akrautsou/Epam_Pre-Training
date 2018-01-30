import java.util.Scanner;

class First {
    void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of dino");
        Double weight = scanner.nextDouble();
        System.out.println("Do you wanna see kg or tons");
        System.out.println("1 - kg");
        System.out.println("2 - tons");
        System.out.println(intoKg(weight));
        System.out.println(intoTon(weight));

    }

    private Double intoKg(Double weight) {
        return weight / 1000;
    }

    private Double intoTon(Double weight) {
        return weight / 1000000;
    }
}
