package by.epam.preTraining.krautsou.tasks.task9.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static String  reader(String path) throws FileNotFoundException {
        StringBuilder string = new StringBuilder();
        Scanner in = new Scanner(new File(path));
        while (in.hasNext()) {
            string.append(in.nextLine()).append(" ");
        }
        return string.toString();
    }
}
