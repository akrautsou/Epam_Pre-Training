package by.epam.preTraining.krautsou.tasks.task9.Task;


import by.epam.preTraining.krautsou.tasks.task3.code.viewer.View;
import by.epam.preTraining.krautsou.tasks.task9.Files.Reader;
import by.epam.preTraining.krautsou.tasks.task9.Parser.ParserStringToArraySentence;
import by.epam.preTraining.krautsou.tasks.task9.Parser.ParserStringToArrayWordsAndReplace;
import by.epam.preTraining.krautsou.tasks.task9.viewer.Viewer;

import java.io.IOException;

//В каждом предложении текста поменять местами первое слово с последним,не изменяя длины предложения.
public class Five {
    public void start() throws IOException {
        String string = Reader.reader("c:\\Users\\Drico\\Documents\\IdeaProjects\\epam\\Epam_Pre-Training\\src" +
                "\\by\\epam\\preTraining\\krautsou\\tasks\\task9\\Files\\File");
        String[] result = ParserStringToArrayWordsAndReplace.parser(ParserStringToArraySentence.parser(string));
        for (String aResult : result) {
            Viewer.output(aResult);
        }
        Viewer.output("\n");
    }
}
