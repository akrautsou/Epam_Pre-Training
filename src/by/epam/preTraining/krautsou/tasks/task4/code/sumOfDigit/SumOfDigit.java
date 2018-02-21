package by.epam.preTraining.krautsou.tasks.task4.code.sumOfDigit;

public class SumOfDigit {
    public static int getSumRecursion(int number) {
        if (number < 10) {
            return number;
        }
        return number % 10 + getSumRecursion(number / 10);
    }

    public static int getSumIteration(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}
