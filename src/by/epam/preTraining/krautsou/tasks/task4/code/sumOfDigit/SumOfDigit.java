package by.epam.preTraining.krautsou.tasks.task4.code.sumOfDigit;

public class SumOfDigit {
    public int getSum(int number) {
        int sum = 0;
        if (number != 0) {
            sum += (number % 10);
            number /= 10;
            getSum(number);
        }
        return sum;
    }
}
