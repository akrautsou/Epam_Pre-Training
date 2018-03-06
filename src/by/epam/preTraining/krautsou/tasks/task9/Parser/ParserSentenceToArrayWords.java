package by.epam.preTraining.krautsou.tasks.task9.Parser;

public abstract class ParserSentenceToArrayWords {
    public static String[] parse(String sentence) {
        return sentence.split("\\s");
    }

    public static String reverseParse(String[] word) {
        StringBuilder result = new StringBuilder();
        for (String aWord : word) {
            result.append(aWord).append(" ");
        }
        return result.toString();
    }
}
