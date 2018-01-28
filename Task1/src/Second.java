import java.util.Scanner;

class Second {
    static void start() {
        Integer radfirst, radsecond;
        Double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first radius");
        radfirst = scanner.nextInt();
        System.out.println("Enter the second radius");
        radsecond = scanner.nextInt();
        result = (Math.pow(radfirst, 2) * Math.PI) - (Math.pow(radsecond, 2) * Math.PI);
        System.out.printf("%.2f", result);
        System.out.println();

    }
}
