package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.EngineType;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.Car;
import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.Core.Type;

public class OilCar extends Car {
    private int volumeOfFuelTank;


    public OilCar(String manufacturer, String model, double price, double engineCapacity, double rating, Type type, boolean rightHand, int volumeOfFuelTank) {
        super(manufacturer, model, price, engineCapacity, rating, type, rightHand);
        this.volumeOfFuelTank = volumeOfFuelTank;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OilCar oilCar = (OilCar) o;

        return volumeOfFuelTank == oilCar.volumeOfFuelTank;
    }

    @Override
    public String toString() {
        return super.toString() +
                " volumeOfFuelTank=" + volumeOfFuelTank + "\n";
    }

    @Override
    public int hashCode() {
        return volumeOfFuelTank;
    }

    public int getVolumeOfFuelTank() {
        return volumeOfFuelTank;

    }

    public void setVolumeOfFuelTank(int volumeOfFuelTank) {
        this.volumeOfFuelTank = volumeOfFuelTank;
    }

}
