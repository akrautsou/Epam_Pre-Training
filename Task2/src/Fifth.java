import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Ноль");
        }
        Integer s = number / 100;
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
        Integer d = number / 10;
        if (number > 9 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("десять");
                    break;
                case 11:
                    System.out.println("одинадцать");
                    break;
                case 12:
                    System.out.println("двенадцать");
                    break;
                case 13:
                    System.out.println("тринадцать");
                    break;
                case 14:
                    System.out.println("четырнадцать");
                    break;
                case 15:
                    System.out.println("пятнадцать");
                    break;
                case 16:
                    System.out.println("шестнадцать");
                    break;
                case 17:
                    System.out.println("семнадцать");
                    break;
                case 18:
                    System.out.println("восемьнадцать");
                    break;
                case 19:
                    System.out.println("девятнадцать");
                    break;
            }
        } else {
            switch (d) {
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
            Integer e = number % 10;
            switch (e) {
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
        }

    }
}
