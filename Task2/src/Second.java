import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
       // firstTry();
        //secondTry();
        //thirstTry();
        //fourthTry();
        //fifthTry();
    }
    // switch
    private static void firstTry()  {
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
                    System.out.println("Glasn");
                    break;
                case 'y':
                case 'w':
                    System.out.println("psevdo");
                    break;
                default:
                    System.out.println("sogl");
                    break;
            }
        } else System.out.println("Error");
    }
    // array
    private static void secondTry() {
        char[] vovels = {'a', 'i', 'o', 'e', 'u'};
        char[] psevdo = {'y', 'w'};
        char symbol;
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.next().charAt(0);
        if (symbol == vovels[0] ||
                symbol == vovels[1] ||
                symbol == vovels[2] ||
                symbol == vovels[3] ||
                symbol == vovels[4]) {
            System.out.println("Glans");
        } else if (symbol == psevdo[0] || symbol == psevdo[1]) {
            System.out.println("Psevdo");
        } else System.out.println("Sogl");
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
            System.out.println("Glans");
        } else if (symbol == 'y' || symbol == 'w') {
            System.out.println("Psevdo");
        } else System.out.println("Sogl");
    }
    //contains
    private static void fourthTry() {
        String  symbol;
        System.out.println("Enter");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.next();
        if("a i o e u".contains(symbol)){
            System.out.println("glasn");
        }else if ("y w".contains(symbol)){
            System.out.println("psevdo");
        }else System.out.println("sogl");

    }
    //code
    private static void fifthTry(){
    }
}
