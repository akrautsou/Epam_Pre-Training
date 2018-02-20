package by.epam.preTraining.krautsou.tasks.task4.code.power;

public class Power {
    public double getPower(double number, int degree) {
        if (degree == 0)
            return 1.0;
        if (degree < 0)
            return 1.0 / getPower(number, -degree);
        else
            return number * getPower(number, degree - 1);
    }
}
