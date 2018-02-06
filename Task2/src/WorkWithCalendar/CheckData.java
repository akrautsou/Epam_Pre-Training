package WorkWithCalendar;

import java.util.Objects;

public class CheckData {
    public static final int FIRST_DAY_OF_THE_MONTH = 1;
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;


    public String getTomorrowData(Day data) {
        String string = "";
        if (data.getMonth() > 13 || data.getMonth() < 0 || data.getDay() > 0 || data.getDay() < 32) {
            if ((data.getMonth() == JANUARY ||
                    data.getMonth() == MARCH ||
                    data.getMonth() == MAY ||
                    data.getMonth() == JULY ||
                    data.getMonth() == AUGUST ||
                    data.getMonth() == OCTOBER) &&
                    data.getDay() == 31) {
                string = (FIRST_DAY_OF_THE_MONTH + " " + (data.getMonth() + 1) + " " + data.getYear());
            }
            if ((data.getMonth() == APRIL ||
                    data.getMonth() == JUNE ||
                    data.getMonth() == SEPTEMBER ||
                    data.getMonth() == NOVEMBER) &&
                    data.getDay() == 30) {
                string = (FIRST_DAY_OF_THE_MONTH + " " + (data.getMonth() + 1) + " " + data.getYear());
            }
            if (isLeapYear(data.getYear()) && (data.getMonth() == FEBRUARY) && data.getDay() == 29) {
                string = (FIRST_DAY_OF_THE_MONTH + " " + MARCH + " " + data.getYear());
            }
            if (!isLeapYear(data.getYear()) && (data.getMonth() == FEBRUARY) && data.getDay() == 28) {
                string = (FIRST_DAY_OF_THE_MONTH + " " + MARCH + " " + data.getYear());
            }
            if (data.getMonth() == DECEMBER && data.getDay() == 31) {
                string = (FIRST_DAY_OF_THE_MONTH + " " + 1 + " " + (data.getYear() + 1));
            }
            if (Objects.equals(string, "")) {
                string = ((data.getDay() + 1) + " " + (data.getMonth()) + " " + (data.getYear()));
            }
        } else {
            string = ("Uncorrected");
        }
        return string;
    }

    public boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}