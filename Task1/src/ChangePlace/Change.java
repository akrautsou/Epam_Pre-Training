package ChangePlace;

public class Change {
    public boolean start(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return a != b;
    }

}
