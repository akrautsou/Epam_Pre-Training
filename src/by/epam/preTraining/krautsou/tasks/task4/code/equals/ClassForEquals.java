package by.epam.preTraining.krautsou.tasks.task4.code.equals;

public class ClassForEquals {
    public static boolean equalsIteration(int number, int result) {
        return number == result;
    }

    public static boolean equalsRecursion(int number1, int number2) {
        if (number1 > 0 || number2 > 0 && number1 > number2) {
            return equalsRecursion(number1 / 10, number2 - number1 % 10);
        }
        return number1 == number2;
    }
}
