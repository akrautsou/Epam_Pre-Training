package by.epam.preTraining.krautsou.tasks.task9.Parser;

public abstract class ParserSentenceToArrayWords {
    public static String[] parser(String sentence) {
        String[] words = sentence.split("\\s");
        for(int i = 0; i< words.length; i++){
            words[i] = words[i].replaceAll("(?U)[\\pP\\s]", "");
        }
        return words;
    }
}
