package by.epam.preTraining.krautsou.tasks.task9.Parser;

public abstract class ParserStringToArraySentence {

    public static String[] parser(String string) {
        String[] sentence = string.split("[\\!|\\.|\\?]\\s?");
        return sentence;
    }
}
