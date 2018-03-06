package by.epam.preTraining.krautsou.tasks.task9.Parser;

public abstract class ParserStringToArraySentence {

    public static String[] parse(String string) {
        return string.split("(?<=[.!?])\\s");
    }

    public static String reverseParse(String[] string) {
        StringBuilder sentence= new StringBuilder();
        for (String aString : string) {
            sentence.append(aString).append(" ");
        }
        return sentence.toString();
    }
}
