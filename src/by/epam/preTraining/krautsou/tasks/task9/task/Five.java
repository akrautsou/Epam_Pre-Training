package by.epam.preTraining.krautsou.tasks.task9.task;


import by.epam.preTraining.krautsou.tasks.task9.files.Reader;
import by.epam.preTraining.krautsou.tasks.task9.parser.Checker;
import by.epam.preTraining.krautsou.tasks.task9.parser.ParserStringToArraySentence;
import by.epam.preTraining.krautsou.tasks.task9.parser.ParserStringToArrayWordsAndReplace;
import by.epam.preTraining.krautsou.tasks.task9.viewer.Viewer;

import java.io.IOException;

//В каждом предложении текста поменять местами первое слово с последним,не изменяя длины предложения.
public class Five {
    public void start() throws IOException {
        String string = Reader.reader("c:\\Users\\Drico\\Documents\\IdeaProjects\\epam\\Epam_Pre-Training\\src" +
                "\\by\\epam\\preTraining\\krautsou\\tasks\\task9\\files\\File");
        StringBuilder resultString = new StringBuilder();
        String[] result = ParserStringToArrayWordsAndReplace.parse(ParserStringToArraySentence.parse(string));
        for (String aResult : result) {
            Viewer.output(aResult);
            resultString.append(aResult).append(" ");
        }
        String[] resultReverse = ParserStringToArrayWordsAndReplace.parseReverse(result);
        for (String aResultReverse : resultReverse) {
            Viewer.output(aResultReverse);
        }
        Viewer.output(Checker.check(string, resultString));

    }
}
