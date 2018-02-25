package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

public interface WorkInt {

    Object getInfoAboutCollection();

    boolean isEmpty();

    void remove(int index);

    Car outputIndex(int index);

    void editIndex(int index);

    void clear();

    String searchModel(String model);

    Object findAveragePrice();
}

