package by.epam.preTraining.krautsou.tasks.task3.code.idealNumber;

public class IdealNumber {
    private int dividerSum = 0;

    public boolean isIdealNumber(int number) {
        for (int divider = 1; number != divider; divider++) {
            if (number % divider == 0) {
                dividerSum += divider;
            }
        }
        return dividerSum == number;
    }
}
