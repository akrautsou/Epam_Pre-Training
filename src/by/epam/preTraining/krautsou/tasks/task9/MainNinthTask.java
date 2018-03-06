package by.epam.preTraining.krautsou.tasks.task9;

import by.epam.preTraining.krautsou.tasks.task9.task.Five;
import by.epam.preTraining.krautsou.tasks.task9.task.Ten;

import java.io.IOException;

public class MainNinthTask {
    public static void main(String[] args) throws IOException {
        new Five().start();
        new Ten().start();
        new Ten().start2();
    }
}
