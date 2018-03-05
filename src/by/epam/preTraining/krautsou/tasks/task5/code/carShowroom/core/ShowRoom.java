package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

import java.util.Arrays;
import java.util.Objects;

public class ShowRoom implements IShowRoom {
    private String name;
    private Car[] cars;
    private int quantity = 0;

    public ShowRoom() {
        cars = new Car[5];
    }

    public ShowRoom(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public ShowRoom(String name) {
        cars = new Car[5];
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "ShowRoom \n" +
                "name='" + name + '\'' +
                ", cars: \n" + Arrays.toString(cars);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShowRoom showRoom = (ShowRoom) o;
        return quantity == showRoom.quantity && (Objects.equals(name, showRoom.name) || (name != null && name.equals(showRoom.getName())))
                && (Arrays.equals(cars, showRoom.cars));
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = result + (Arrays.hashCode(cars) + quantity) * 5;
        return result;
    }

    public Object getInfoAboutCollection() {
        return "quantity = " + this.getQuantity() + "\n" +
                "Collections is empty?" + this.isEmpty();
    }

    public boolean isEmpty() {
        return 0 == this.getQuantity();
    }

    public Car outputIndex(int index) {
        return (this.getCars()[index]);
    }

    public String searchModel(String model) {
        for (int i = 0; i < this.getQuantity(); i++) {
            if (this.getCars()[i] != null) {
                if (Objects.equals(this.getCars()[i].getModel(), model)) {
                    return "Find N" + i;
                }
            }
        }
        return "Not Found";
    }

    public Object findAveragePrice() {
        double result = 0;
        for (Car aMazdaShowRoom : this.getCars()) {
            if (aMazdaShowRoom != null) {
                result += aMazdaShowRoom.getPrice();
            }
        }
        return result / this.getQuantity();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void extendsIfFull(){
        if (quantity == cars.length) {
            Car[] temp = new Car[(cars.length + 5)];
            System.arraycopy(cars, 0, temp, 0, cars.length);
            cars = temp;
        }
    }
}
