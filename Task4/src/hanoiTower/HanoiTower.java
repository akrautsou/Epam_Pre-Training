package hanoiTower;

import viewPack.Viewer;

public class HanoiTower {

    public void moveDisks(int n, char a, char b, char c) {
        Viewer viewer = new Viewer();
        if (n > 0) {
            moveDisks(n - 1, a, c, b);
            viewer.output(a, b);
            moveDisks(n - 1, c, b, a);
        }
    }
}
