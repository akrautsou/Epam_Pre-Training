package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

import java.util.Objects;
public  class Worker {
    protected ShowRoom showRoom = new ShowRoom();

    public Object output() {
        return showRoom;
    }

    public Object getInfoAboutCollection() {
        return "quantity = " + showRoom.getQuantity() +
                "Collections is empty?" + isEmpty();
    }

    private boolean isEmpty() {
        return 0 == showRoom.getQuantity();
    }

    public void remove(int index) {
        showRoom.remove(index);
    }

    public Car outputIndex(int index) {
        return (showRoom.getCars()[index]);
    }

    public void editIndex(int index) {
        if (index > showRoom.getQuantity()) {
            return;
        }
        showRoom.getCars()[index].setEngineCapacity(5);
        showRoom.getCars()[index].setRightHand(false);
    }

    public void clear() {
        for (int i = 0; i < showRoom.getQuantity(); i++) {
            showRoom.getCars()[i] = null;
        }
    }

    public String searchModel(String model) {
        for (int i = 0; i < showRoom.getQuantity(); i++) {
            if (showRoom.getCars()[i] != null) {
                if (Objects.equals(showRoom.getCars()[i].getModel(), model)) {
                    return "Find N" + i;
                }
            }
        }
        return "Not Found";
    }

    public Object findAveragePrice() {
        double result = 0;
        for (Car aMazdaShowRoom : showRoom.getCars()) {
            if (aMazdaShowRoom != null) {
                result += aMazdaShowRoom.getPrice();
            }
        }
        return result / showRoom.getQuantity();
    }
}
