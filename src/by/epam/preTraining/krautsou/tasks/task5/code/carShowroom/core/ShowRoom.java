package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

import java.util.Arrays;
import java.util.Objects;

public class ShowRoom {
    private String name;
    private Car[] cars;
    private int quantity = 0;

    public ShowRoom() {
        cars = new Car[5];
    }

    int getQuantity() {
        return quantity;
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

    public ShowRoom(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public void addCar(Car car) {
        if (quantity == cars.length) {
            Car[] temp = new Car[(cars.length + 5)];
            System.arraycopy(cars, 0, temp, 0, cars.length);
            cars = temp;
        }
        cars[quantity] = car;
        quantity++;
    }

    public void remove(int index) {
        if (quantity >= index) {
            for (int i = index; i < cars.length; i++) {
                if (i < cars.length - 1) {
                    cars[i] = cars[i + 1];
                } else {
                    cars[i] = null;
                }
            }
        }
    }
}
