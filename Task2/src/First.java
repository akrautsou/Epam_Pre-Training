import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Integer age = 3;
        Integer head=3;
        Integer year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        year = scanner.nextInt();
        if (year < 200) {
            head = 200 * 3 + age;
        }
        if(year > 199){
            head = 200*3 + age;
            year = year -200;
            head +=year*2;
        }
        if(year>299){
            head = 200*3+age;
            year = year - 200;
            head += year*2;
            year = year -100;
            head +=year;
        }
        System.out.println(head);
    }
}
