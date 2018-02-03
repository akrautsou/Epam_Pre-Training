import java.util.Scanner;

class DinoWeight {
    private static int GRAM_INTO_KILO = 1_000;
    private static int GRAM_INTO_TONNE = 1_000_000;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of dino");
        double weight = scanner.nextDouble();
        System.out.println(intoKg(weight));
        System.out.println(intoTon(weight));
    }

    private double intoKg(Double weight) {
        return weight / GRAM_INTO_KILO;
    }

    private double intoTon(Double weight) {
        return weight / GRAM_INTO_TONNE;
    }
}
