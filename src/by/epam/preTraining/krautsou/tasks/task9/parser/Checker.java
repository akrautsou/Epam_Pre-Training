package by.epam.preTraining.krautsou.tasks.task9.parser;

import java.util.Arrays;
import java.util.Objects;

public class Checker {
    public static String check(String string, StringBuilder resultString) {
        String result = "";
        if (Objects.equals(ParserStringToArraySentence.reverseParse(ParserStringToArraySentence.parse(string)),
                customAppend(ParserStringToArraySentence.parse(string)))) {
            result += ("\n" + true + "\n");
        }
        if (Objects.equals(ParserSentenceToArrayWords.reverseParse(ParserSentenceToArrayWords.parse(string)),
                customAppend(ParserSentenceToArrayWords.parse(string)))) {
            result += (true + "\n");
        }
        if (Arrays.equals(ParserStringToArrayWordsAndReplace.parseReverse(ParserStringToArraySentence.parse(string)),
                ParserStringToArrayWordsAndReplace.parse(ParserStringToArraySentence.parse(string)))) {
            result += (true + "\n");
        }
        result += ("Was " + string.length() + "\n");
        result += ("Now " + resultString.length() + "\n");
        return result;
    }

    private static String customAppend(String[] a) {
        StringBuilder resultString = new StringBuilder();
        for (String aResult : a) {
            resultString.append(aResult).append(" ");
        }
        return resultString.toString();
    }
}
