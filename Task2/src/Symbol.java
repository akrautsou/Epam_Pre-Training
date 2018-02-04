import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Symbol {
    public static void main(String[] args) {
        firstTry();
        secondTry();
        thirstTry();
        fourthTry();
        fifthTry();
    }

    // switch
    private static void firstTry() {
        Character symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        symbol = scanner.next().charAt(0);
        if (Character.isLowerCase(symbol)) {
            switch (symbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Diphthong ");
                    break;
                default:
                    System.out.println("Consonant");
                    break;
            }
        } else System.out.println("Error");
    }

    // array
    private static void secondTry() {
        char[] vowels = {'a', 'i', 'o', 'e', 'u'};
        char[] diphthong  = {'y', 'w'};
        char symbol;
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.next().charAt(0);
        if (symbol == vowels[0] ||
                symbol == vowels[1] ||
                symbol == vowels[2] ||
                symbol == vowels[3] ||
                symbol == vowels[4]) {
            System.out.println("Vowel");
        } else if (symbol == diphthong [0] || symbol == diphthong [1]) {
            System.out.println("Diphthong ");
        } else System.out.println("Consonant");
    }

    //if
    private static void thirstTry() {
        char symbol;
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.next().charAt(0);
        if (symbol == 'a' ||
                symbol == 'i' ||
                symbol == 'o' ||
                symbol == 'e' ||
                symbol == 'u') {
            System.out.println("Vowel");
        } else if (symbol == 'y' || symbol == 'w') {
            System.out.println("Diphthong ");
        } else System.out.println("Consonant");
    }

    //contains
    private static void fourthTry() {
        String symbol;
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.next();
        if ("a i o e u".contains(symbol)) {
            System.out.println("Vowel");
        } else if ("y w".contains(symbol)) {
            System.out.println("Diphthong ");
        } else System.out.println("Consonant");

    }

    //code
    private static void fifthTry() {
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        String s = Character.toString(c);
        byte[] codes = new byte[0];
        try {
            codes = s.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte code = codes[0];
        if (code == 97 ||
                code == 105 ||
                code == 111 ||
                code == 101 ||
                code == 117) {
            System.out.println("Vowel");
        } else if (code == 119 || code == 121) {
            System.out.println("Diphthong ");
        } else System.out.println("Consonant");
    }
}
