package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

public interface IShowRoom {

    Object getInfoAboutCollection();

    boolean isEmpty();

    Car outputIndex(int index);

    String searchModel(String model);

    Object findAveragePrice();
}

