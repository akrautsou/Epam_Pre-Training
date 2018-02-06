package Mood;

public class FindMood {
    public static final int MOOD_IS_OKAY = 75;
    public static final int MOOD_IS_FUNNY = 150;
    public static final int MOOD_IS_SAD = 200;
    public static final int MOOD_IS_POKERFACE = 250;

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
