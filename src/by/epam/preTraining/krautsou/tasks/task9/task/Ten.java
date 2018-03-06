package by.epam.preTraining.krautsou.tasks.task9.task;

import by.epam.preTraining.krautsou.tasks.task9.files.Reader;
import by.epam.preTraining.krautsou.tasks.task9.parser.ParserSentenceToArrayWords;
import by.epam.preTraining.krautsou.tasks.task9.viewer.Viewer;

import java.io.IOException;
import java.util.*;

//Существует текст и список слов. Для каждого слова из заданного списка найти, сколько раз оно встречается в каждом
// предложении, и рассортировать слова по убыванию общего количества вхождений.
public class Ten {
    public void start() throws IOException { // Array
        String string = Reader.reader("c:\\Users\\Drico\\Documents\\IdeaProjects\\epam\\Epam_Pre-Training\\src" +
                "\\by\\epam\\preTraining\\krautsou\\tasks\\task9\\files\\File");
        String words = Reader.reader("c:\\Users\\Drico\\Documents\\IdeaProjects\\epam\\Epam_Pre-Training\\src" +
                "\\by\\epam\\preTraining\\krautsou\\tasks\\task9\\files\\Words");
        String[] wordsArray = ParserSentenceToArrayWords.parse(words);
        String[] txt = ParserSentenceToArrayWords.parse(string);
        int[] quantity = new int[wordsArray.length];

        for (String aTxt : txt) {
            for (int g = 0; g < wordsArray.length; g++) {
                if (aTxt.contains(wordsArray[g])) {
                    quantity[g]++;
                }
            }
        }
        bubbleSort(quantity, wordsArray);
        for (int g = 0; g < wordsArray.length; g++) {
            Viewer.output("\n" + wordsArray[g] + " " + quantity[g]);
        }
    }

    public void start2() throws IOException { //HashMap
        String string = Reader.reader("c:\\Users\\Drico\\Documents\\IdeaProjects\\epam\\Epam_Pre-Training\\src" +
                "\\by\\epam\\preTraining\\krautsou\\tasks\\task9\\files\\File");
        String words = Reader.reader("c:\\Users\\Drico\\Documents\\IdeaProjects\\epam\\Epam_Pre-Training\\src" +
                "\\by\\epam\\preTraining\\krautsou\\tasks\\task9\\files\\Words");
        String[] wordsArray = ParserSentenceToArrayWords.parse(words);
        String[] txt = ParserSentenceToArrayWords.parse(string);
        Map<String, Integer> map = new HashMap<>();
        for (String aTxt : txt) {
            for (String aWordsArray : wordsArray) {
                if (aTxt.contains(aWordsArray)) {
                    if (map.containsKey(aWordsArray)) {
                        map.put(aWordsArray, map.get(aWordsArray) + 1);
                    } else {
                        map.put(aWordsArray, 1);
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list,
                new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return (o2.getValue()).compareTo(o1.getValue());
                    }
                });
        for (Map.Entry<String, Integer> entry : list) {
            Viewer.output("\n" + entry.getKey(), entry.getValue());
        }
    }

    private static void bubbleSort(int[] array, String[] charArray) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    String temp2 = charArray[j + 1];
                    charArray[j + 1] = charArray[j];
                    charArray[j] = temp2;
                }
            }
        }
    }
}
