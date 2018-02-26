package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.Type;

public class ElectraCar extends Car {
    private int lifetime;
    private double powerReserve;
    private double batteryCapacity;
    private double chargingTime;

    public ElectraCar(String manufacturer, String model, double price, double engineCapacity, double rating, Type type, boolean rightHand, int lifetime, double powerReserve, double batteryCapacity, double chargingTime) {
        super(manufacturer, model, price, engineCapacity, rating, type, rightHand);
        this.lifetime = lifetime;
        this.powerReserve = powerReserve;
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public String toString() {
        return super.toString() + " ElectraCharacteristics " +
                ", lifetime=" + lifetime +
                ", powerReserve=" + powerReserve +
                ", batteryCapacity=" + batteryCapacity +
                ", chargingTime=" + chargingTime + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectraCar that = (ElectraCar) o;

        if (lifetime != that.lifetime) return false;
        if (Double.compare(that.powerReserve, powerReserve) != 0) return false;
        if (Double.compare(that.batteryCapacity, batteryCapacity) != 0) return false;
        return Double.compare(that.chargingTime, chargingTime) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = lifetime;
        temp = Double.doubleToLongBits(powerReserve);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(batteryCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(chargingTime);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public double getPowerReserve() {
        return powerReserve;
    }

    public void setPowerReserve(double powerReserve) {
        this.powerReserve = powerReserve;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(double chargingTime) {
        this.chargingTime = chargingTime;
    }


}
