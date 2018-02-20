package by.epam.preTraining.krautsou.tasks.task2.code.workWithCalendar;

import java.util.Objects;

public class CheckData {
    private static final int FIRST_DAY_OF_THE_MONTH = 1;
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;


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

    private boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}