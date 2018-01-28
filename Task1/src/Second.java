import java.util.Scanner;

class Second {
    void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first radius");
        Integer radFirst = scanner.nextInt();
        System.out.println("Enter the second radius");
        Integer radSecond = scanner.nextInt();
        Double result = (Math.pow(radFirst, 2) * Math.PI) - (Math.pow(radSecond, 2) * Math.PI);
        System.out.printf("%.2f", result);
        System.out.println();

    }
}
