package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

import java.util.Objects;

public class Worker implements IWorker {

    private ShowRoom showRoom;

    public Worker(ShowRoom showRoom){
        this.showRoom = showRoom;
    }

    public void addCar(Car car) {
        if (Objects.equals(showRoom.getName(), car.getManufacturer())) {
            showRoom.extendsIfFull();
            showRoom.getCars()[showRoom.getQuantity()] = car;
            showRoom.setQuantity(showRoom.getQuantity()+1);
        }
    }

    public void remove(int index) {
        if (showRoom.getQuantity() >= index) {
            for (int i = index; i < showRoom.getCars().length; i++) {
                if (i < showRoom.getCars().length - 1) {
                    showRoom.getCars()[i] = showRoom.getCars()[i + 1];
                } else {
                    showRoom.getCars()[i] = null;
                }
            }
        }
    }

    public void clear() {
        for (int i = 0; i < showRoom.getQuantity(); i++) {
            showRoom.getCars()[i] = null;
        }
    }

    public void editIndex(int index) {
        if (index > showRoom.getQuantity()) {
            return;
        }
        showRoom.getCars()[index].setEngineCapacity(5);
        showRoom.getCars()[index].setRightHand(false);
    }
}

