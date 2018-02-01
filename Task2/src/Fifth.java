import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Integer number;
        Integer s;
        Integer d;
        Integer e;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        s = number / 100;

        number = number % 100;
        switch (s) {
            case 1:
                System.out.println("Сто");
                break;
            case 2:
                System.out.println("Двести");
                break;
            case 3:
                System.out.println("Триста");
                break;
            case 4:
                System.out.println("Четыреста");
                break;
            case 5:
                System.out.println("пятьсот");
                break;
            case 6:
                System.out.println("шестьсот");
                break;
            case 7:
                System.out.println("семьсот");
                break;
            case 8:
                System.out.println("восемьсот");
                break;
            case 9:
                System.out.println("девятьсот");
                break;
        }
        d = number / 10;
        e = number % 10;
        if (e > 11) {
            switch (d) {
                case 0:
                    break;
                case 1:
                    System.out.println("десят");
                    break;
                case 2:
                    System.out.println("двадцать");
                    break;
                case 3:
                    System.out.println("тридцать");
                    break;
                case 4:
                    System.out.println("сорок");
                    break;
                case 5:
                    System.out.println("пятьдесят");
                    break;
                case 6:
                    System.out.println("шестьдесят");
                    break;
                case 7:
                    System.out.println("семьдесят");
                    break;
                case 8:
                    System.out.println("восемьдесят");
                    break;
                case 9:
                    System.out.println("девяносто");
                    break;
            }
            switch (e) {
                case 0:
                    break;
                case 1:
                    System.out.println("один");
                    break;
                case 2:
                    System.out.println("два");
                    break;
                case 3:
                    System.out.println("три");
                    break;
                case 4:
                    System.out.println("четыре");
                    break;
                case 5:
                    System.out.println("пять");
                    break;
                case 6:
                    System.out.println("шесть");
                    break;
                case 7:
                    System.out.println("семь");
                    break;
                case 8:
                    System.out.println("восемь");
                    break;
                case 9:
                    System.out.println("девять");
                    break;
            }
        } else {
            switch (e) {
                case 0:
                    break;
                case 1:
                    System.out.println("одинадцать");
                    break;
                case 2:
                    System.out.println("двенадцать");
                    break;
                case 3:
                    System.out.println("тринадцать");
                    break;
                case 4:
                    System.out.println("четырнадцать");
                    break;
                case 5:
                    System.out.println("пятнадцать");
                    break;
                case 6:
                    System.out.println("шестнадцать");
                    break;
                case 7:
                    System.out.println("семнадцать");
                    break;
                case 8:
                    System.out.println("восемьнадцать");
                    break;
                case 9:
                    System.out.println("девятнадцать");
                    break;
            }

        }
    }
}
