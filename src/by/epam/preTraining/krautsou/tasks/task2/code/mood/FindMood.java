package by.epam.preTraining.krautsou.tasks.task2.code.mood;

public class FindMood {
    private static final int MOOD_IS_OKAY = 75;
    private static final int MOOD_IS_FUNNY = 150;
    private static final int MOOD_IS_SAD = 200;
    private static final int MOOD_IS_POKERFACE = 250;

    public String getSmiley(int number) {
        String string = "";
        if (number < MOOD_IS_OKAY) {
            string = (":)");
        }
        if (number < MOOD_IS_FUNNY) {
            string = (":D");
        }
        if (number < MOOD_IS_SAD) {
            string = (":(");
        }
        if (number < MOOD_IS_POKERFACE) {
            string = (":-|");
        }
        return string;
    }
}
