import java.util.Scanner;

public class WorkWithCalendar {
    public static void main(String[] args) {
        Day data = initialization();
        String result = check(data);
        output(result);
    }

    private static Day initialization() {
        Day data = new Day();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        data.setDay(scanner.nextInt());

        System.out.println("Enter month");
        data.setMonth(scanner.nextInt());

        System.out.println("Enter year");
        data.setYear(scanner.nextInt());
        return data;
    }

    private static void output(String result) {
        System.out.println(result);
    }

    private static String check(Day data) {
        if ((data.getMonth() == 1 ||
                data.getMonth() == 5 ||
                data.getMonth() == 7 ||
                data.getMonth() == 8 ||
                data.getMonth() == 10) &&
                data.getDay() == 31) {
            return (1 + " " + (data.getMonth() + 1) + " " + data.getYear());
        }
        if ((data.getMonth() == 4 ||
                data.getMonth() == 6 ||
                data.getMonth() == 9 ||
                data.getMonth() == 11) &&
                data.getDay() == 30) {
            return (1 + " " + (data.getMonth() + 1) + " " + data.getYear());
        }
        if ((data.getYear() % 4 == 0 && data.getMonth() == 2 && data.getDay() == 29)) {
            return (1 + " " + 3 + " " + data.getYear());
        }
        if ((data.getYear() % 4 != 0 && data.getMonth() == 2 && data.getDay() == 28)) {
            return (1 + " " + 3 + " " + data.getYear());
        }
        if (data.getMonth() == 12 && data.getDay() == 31) {
            return (1 + " " + 1 + " " + (data.getYear() + 1));
        } else {
            return ((data.getDay() + 1) + " " + (data.getMonth() + 1) + " " + (data.getYear() + 1));
        }

    }

}

class Day {
    private int day;
    private int month;
    private int year;

    int getDay() {
        return day;
    }

    void setDay(int day) {
        this.day = day;
    }

    int getMonth() {
        return month;
    }

    void setMonth(int month) {
        this.month = month;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }
}
