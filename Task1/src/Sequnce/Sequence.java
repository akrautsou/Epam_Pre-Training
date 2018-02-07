package Sequnce;

public class Sequence {
    public boolean checkSequence(int number) {
        int a = number % 10;
        int b = (number /= 10) % 10;
        int c = (number /= 10) % 10;
        int d = (number / 10) % 10;
        return (d > c && c > b && b > a);
    }
}