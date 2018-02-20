package by.epam.preTraining.krautsou.tasks.task3.code.algoritm;

import static java.lang.Math.sqrt;

public class Solutions {
    private String result = "";
    private static final int ARRAY_DIGIT[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public int checkMax(int number) {
        int mod = number % 10;
        number = number / 10;
        while (number > 0) {
            if (number % 10 > mod) {
                mod = number % 10;
            }
            number = number / 10;
        }
        return mod;
    }

    public boolean isCheckSimple(int number) {
        for (int i = 2; i < sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int findNOD(int first, int second) {
        int div;
        if (first == second) {
            return first;
        }
        int difference = first - second;
        if (difference < 0) {
            difference = -difference;
            div = findNOD(first, difference);
        } else
            div = findNOD(second, difference);
        return div;
    }

    public int findNOK(int first, int second) {
        return first * second / findNOD(first, second);
    }

    public boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;
        while (temp != 0) {
            reverseNumber *= 10;
            reverseNumber = reverseNumber + temp % 10;
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public String findAllSimple(int number) {
        for (int divider = 2; divider <= number; divider++) {
            if (number % divider == 0 && isCheckSimple(divider)) {
                result = divider + " ";
            }
        }
        return result;
    }

    public int findNumberOfDifferentDigits(int number) {
        int counter = 0;
        while (number > 0) {
            int digit = number % 10;
            for (int i = 0; i < 10; i++) {
                if (digit == ARRAY_DIGIT[i]) {
                    ARRAY_DIGIT[i] = Integer.MAX_VALUE;
                    counter++;
                }
            }
            number /= 10;
        }

        return counter;
    }
}