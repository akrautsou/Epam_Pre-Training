package ReverseNumber;

public class NumberReverse {

    public int reverse(int num) {
        return num < 10 ? num : Integer.parseInt(String.valueOf(num % 10) + reverse(num / 10));
    }
}

