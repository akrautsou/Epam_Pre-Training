package by.epam.preTraining.krautsou.tasks.task1.code.sumAndMultiply;

public class FindSumAndMultiply {
    public int findSum(int number) {
        int sum = number % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number /= 10) % 10;
        sum += (number / 10) % 10;
        return sum;
    }

    public int findMultiply(int number) {

        int multiply = number % 10;
        multiply *= (number /= 10) % 10;
        multiply *= (number /= 10) % 10;
        multiply *= (number /= 10) % 10;
        multiply *= (number / 10) % 10;
        return multiply;
    }
}
