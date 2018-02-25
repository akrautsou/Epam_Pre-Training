package by.epam.preTraining.krautsou.tasks.task5.code;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.creater.Infinity;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.creater.Nissan;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.viewer.Viewer;

public class MainFifthTask {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Nissan nissan = Nissan.getInstance();
        Infinity infinity = Infinity.getInstance();
        nissan.create();
        nissan.editIndex(2);
        viewer.output(nissan.getInfoAboutCollection());
        viewer.output(nissan.output());
        viewer.output(nissan.searchModel("Almera"));
        viewer.output(nissan.findAveragePrice());
        viewer.output(nissan.outputIndex(0));
        nissan.remove(2);
        viewer.output(nissan.output());
        nissan.clear();
        viewer.output(nissan.output());
        infinity.create();
        viewer.output(infinity.output());

    }


}
