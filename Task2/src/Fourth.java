import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Day data = new Day();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        data.setDay(scanner.nextInt());

        System.out.println("Enter mounth");
        data.setMounth(scanner.nextInt());

        System.out.println("Enter year");
        data.setYear(scanner.nextInt());
        if (data.getMounth() == 1 ||
                data.getMounth() == 3 ||
                data.getMounth() == 5 ||
                data.getMounth() == 7 ||
                data.getMounth() == 8 ||
                data.getMounth() == 10 &&
                        data.getDay() == 31) {
            System.out.println(1 + " " + (data.getMounth() + 1) + " " + data.getYear());
        } else if ((data.getMounth() == 4 ||
                data.getMounth() == 6 ||
                data.getMounth() == 9 ||
                data.getMounth() == 11) &&
                        data.getDay() == 30) {
            System.out.println(1 + " " + (data.getMounth() + 1) + " " + data.getYear());
        } else if (data.getMounth() == 2 && data.getDay() == 28) {
            System.out.println(1 + " " + 3 + " " + data.getYear());
        } else if (data.getMounth() == 12 && data.getDay() == 31) {
            System.out.println(1 + " " + 1 + " " + (data.getYear() + 1));
        } else {
            System.out.println("nevernoe znachenie");
        }

    }
}

class Day {
    private Integer day;
    private Integer mounth;
    private Integer year;

    Integer getDay() {
        return day;
    }

    void setDay(Integer day) {
        this.day = day;
    }

    Integer getMounth() {
        return mounth;
    }

    void setMounth(Integer mounth) {
        this.mounth = mounth;
    }

    Integer getYear() {
        return year;
    }

    void setYear(Integer year) {
        this.year = year;
    }
}
