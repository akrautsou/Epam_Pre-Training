import java.util.Scanner;

public class Dragon {
    private static int head=3;
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int year = scanner.nextInt();
        int result = check(year);
        System.out.println(result);
    }
    private static int check(int year){
        if (year < 200) {
            head = 200 * 3 + head;
        }
        if(year > 199){
            head = 200*3 + head;
            year = year -200;
            head +=year*2;
        }
        if(year>299){
            head = 200*3+head;
            year = year - 200;
            head += year*2;
            year = year -100;
            head +=year;
        }
        return head;
    }
}
