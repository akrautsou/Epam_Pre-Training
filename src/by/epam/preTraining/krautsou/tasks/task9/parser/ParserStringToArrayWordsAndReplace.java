package by.epam.preTraining.krautsou.tasks.task9.parser;

public abstract class ParserStringToArrayWordsAndReplace {

    public static String[] parse(String[] sentence) {
        String[] words = new String[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            words[i] = sentence[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }
        return words;
    }
    public static String[] parseReverse(String[] sentence) {
        String[] words = new String[sentence.length];
        for (int i = 0; i < sentence.length; i++) {
            words[i] = sentence[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }
        return words;
    }
}
