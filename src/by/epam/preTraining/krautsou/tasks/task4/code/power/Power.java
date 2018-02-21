package by.epam.preTraining.krautsou.tasks.task4.code.power;

public class Power {
    public static double getPowerRecursion(double number, int degree) {
        if (degree == 0) {
            return 1.0;
        }
        if (degree < 0) {
            return 1.0 / getPowerRecursion(number, -degree);
        } else {
            return number * getPowerRecursion(number, degree - 1);
        }
    }

    public static double getPowerIteration(double number, int degree) {
        double result = 1;
        for (int i = 0; i < degree; i++) {
            result *= number;
        }
        return result;
    }
}
