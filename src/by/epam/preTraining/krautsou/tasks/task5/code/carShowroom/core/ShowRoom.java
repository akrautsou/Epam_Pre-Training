package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities.Car;

import java.util.Arrays;

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

        if (!name.equals(showRoom.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(cars, showRoom.cars);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + Arrays.hashCode(cars);
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
