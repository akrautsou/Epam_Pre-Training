import java.util.Scanner;

class Radius {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first radius");
        int radFirst = scanner.nextInt();
        System.out.println("Enter the second radius");
        int radSecond = scanner.nextInt();
        System.out.printf("%.2f", spaceCalculate(radFirst) - spaceCalculate(radSecond));
        System.out.println();
    }
    private double spaceCalculate(int radius){
        return Math.pow(radius, 2) * Math.PI;
    }

}
