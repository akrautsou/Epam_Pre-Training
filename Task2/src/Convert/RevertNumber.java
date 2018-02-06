package Convert;

public class RevertNumber {
    private static final int HUNDREDS =100;
    private static final int TENS = 10;
    private String string = "";

    public String getALetterSpelling(int number) {
        if (number == 0) {
            string = ("Ноль");
        }
        int s = number / HUNDREDS;
        number = number % HUNDREDS;
        if (s > 0) {
            checkHundreds(s);
        }
        int d = number / TENS;
        if (number > 9 && number < 20) {
            checkTeens(number);
        } else {
            checkTens(d);
            int e = number % TENS;
            checkDigit(e);
        }
        return string;
    }

    private void checkHundreds(int s) {
        switch (s) {
            case 1:
                string += ("Сто ");
                break;
            case 2:
                string += ("Двести ");
                break;
            case 3:
                string += ("Триста ");
                break;
            case 4:
                string += ("Четыреста ");
                break;
            case 5:
                string += ("Пятьсот ");
                break;
            case 6:
                string += ("Шестьсот ");
                break;
            case 7:
                string += ("Семьсот ");
                break;
            case 8:
                string += ("Восемьсот ");
                break;
            case 9:
                string += ("Девятьсот");
                break;
        }
    }

    private void checkTens(int d) {
        switch (d) {
            case 2:
                string += ("Двадцать ");
                break;
            case 3:
                string += ("Тридцать ");
                break;
            case 4:
                string += ("Сорок ");
                break;
            case 5:
                string += ("Пятьдесят ");
                break;
            case 6:
                string += ("Шестьдесят ");
                break;
            case 7:
                string += ("Семьдесят ");
                break;
            case 8:
                string += ("Восемьдесят ");
                break;
            case 9:
                string += ("Девяносто ");
                break;
        }
    }

    private void checkDigit(int e) {
        switch (e) {
            case 1:
                string += ("Один ");
                break;
            case 2:
                string += ("Два ");
                break;
            case 3:
                string += ("Три ");
                break;
            case 4:
                string += ("Четыре ");
                break;
            case 5:
                string += ("Пять ");
                break;
            case 6:
                string += ("Шесть ");
                break;
            case 7:
                string += ("Семь ");
                break;
            case 8:
                string += ("Восемь ");
                break;
            case 9:
                string += ("Девять ");
                break;
        }
    }

    private void checkTeens(int number) {
        switch (number) {
            case 10:
                string += ("Десять ");
                break;
            case 11:
                string += ("Одинадцать ");
                break;
            case 12:
                string += ("Двенадцать ");
                break;
            case 13:
                string += ("Тринадцать ");
                break;
            case 14:
                string += ("Четырнадцать ");
                break;
            case 15:
                string += ("Пятнадцать ");
                break;
            case 16:
                string += ("Шестнадцать ");
                break;
            case 17:
                string += ("Семнадцать ");
                break;
            case 18:
                string += ("Восемьнадцать ");
                break;
            case 19:
                string += ("Девятнадцать ");
                break;
        }
    }
}
