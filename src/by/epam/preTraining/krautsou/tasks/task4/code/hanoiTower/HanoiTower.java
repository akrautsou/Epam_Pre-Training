package by.epam.preTraining.krautsou.tasks.task4.code.hanoiTower;

public class HanoiTower {
    private String result = "";

    public String moveDisks(int n, char a, char b, char c) {
        if (n > 0) {
            moveDisks(n - 1, a, c, b);
            result += (a + "-->" + b + "\n");
            moveDisks(n - 1, c, b, a);
        }
        return result;
    }
}
