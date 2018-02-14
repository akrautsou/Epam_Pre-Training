package hanoiTower;

public class HanoiTower {

    public void moveDisks(int n, char a, char b, char c) {
        if (n > 0) {
            moveDisks(n - 1, a, c, b);
            System.out.println(a + "-->" + b);
            moveDisks(n - 1, c, b, a);
        }
    }
}
