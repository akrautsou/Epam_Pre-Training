package by.epam.preTraining.krautsou.tasks.task5.code;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.ShowRoom;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.Type;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.Worker;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.creater.Creator;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.viewer.Viewer;

public class MainFifthTask {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        ShowRoom[] showRoom = new ShowRoom[5];
        Creator creator = Creator.getInstance();
        showRoom[1] = new ShowRoom("Nissan");
        Worker workerNissan1 = new Worker(showRoom[1]);
        Worker workerNissan2 = new Worker(showRoom[1]);
        workerNissan1.addCar(creator.createElectra("Nissan", "Juke", 750, 175,
                3, String.valueOf(Type.CROSSOVER), true, 57, 500, 600, 700));
        workerNissan2.addCar(creator.createOil("Nissan", "JukeEI", 850, 187,
                5, String.valueOf(Type.CROSSOVER), true, 60));
        showRoom[2] = new ShowRoom("Infinity");
        Worker workerInfinity = new Worker(showRoom[2]);
        workerInfinity.addCar(creator.createElectra("Infinity", "QEI50", 1150, 235,
                4, String.valueOf(Type.SEDAN), true, 75, 850, 750, 400));

        viewer.output(showRoom[1].getInfoAboutCollection());
        viewer.output(showRoom[1].searchModel("Juke"));
        viewer.output(showRoom[1].findAveragePrice());
        viewer.output(showRoom[1].outputIndex(0));
        viewer.output(showRoom[1].outputIndex(1));
        workerNissan1.editIndex(0);
        workerNissan1.remove(1);
        workerNissan1.clear();
    }

}
