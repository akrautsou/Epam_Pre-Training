package by.epam.preTraining.krautsou.tasks.task5.code;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.ShowRoom;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.Type;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.creater.Creator;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.viewer.Viewer;

public class MainFifthTask {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        ShowRoom[] showRoom = new ShowRoom[5];
        Creator creator = Creator.getInstance();
        showRoom[1] = new ShowRoom("Nissan");
        showRoom[1].addCar(showRoom[1], creator.createElectro("Nissan", "Juke", 750, 175, 3, String.valueOf(Type.CROSSOVER), true, 57, 500,600, 700));
        showRoom[1].addCar(showRoom[1], creator.createOil("Nissan", "Juke", 750, 175, 3, String.valueOf(Type.CROSSOVER), true, 57));
        showRoom[2] = new ShowRoom("Infinity");
        showRoom[2].addCar(showRoom[2], creator.createElectro("Nissan", "Juke", 750, 175, 3, String.valueOf(Type.CROSSOVER), true, 57, 500,600, 700));

        viewer.output(showRoom[1].getInfoAboutCollection());
        viewer.output(showRoom[1].searchModel("Almera"));
        viewer.output(showRoom[1].findAveragePrice());
        viewer.output(showRoom[1].outputIndex(0));
        showRoom[1].remove(1);
        showRoom[1].clear();

    }

}
