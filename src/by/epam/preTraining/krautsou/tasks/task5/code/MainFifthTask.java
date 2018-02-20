package by.epam.preTraining.krautsou.tasks.task5.code;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Manufacturer.Infinity;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Manufacturer.Nissan;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.Viewer;

public class MainFifthTask {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Nissan nissan = new Nissan();
        Infinity infinity = new Infinity();
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
