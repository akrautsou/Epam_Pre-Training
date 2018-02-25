package by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.entities;

import by.epam.preTraining.krautsou.tasks.task5.code.carShowroom.core.Type;

public class Car {
    private String manufacturer;
    private String model;
    private double price;
    private double horsepower;
    private double rating;
    private Type type;
    private boolean rightHand;

    public Car() {
    }

    public Car(String manufacturer, String model, double price, double engineCapacity, double rating, Type type, boolean rightHand) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.horsepower = engineCapacity;
        this.rating = rating;
        this.type = type;
        this.rightHand = rightHand;
    }

    @Override
    public String toString() {
        return
                "Model='" + model + '\'' +
                        ", Price=" + price +
                        ", Horsepower=" + horsepower +
                        ", Rating=" + rating +
                        ", Type='" + type + '\'' +
                        ", RightHand=" + rightHand
                ;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    public String getModel() {
        return model;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEngineCapacity() {
        return horsepower
                ;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.horsepower
                = engineCapacity;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Type getType() {
        return type;
    }

    public boolean isRightHand() {
        return rightHand;
    }

    public void setRightHand(boolean rightHand) {
        this.rightHand = rightHand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.price, price) != 0) return false;
        if (Double.compare(car.horsepower, horsepower) != 0) return false;
        if (Double.compare(car.rating, rating) != 0) return false;
        if (rightHand != car.rightHand) return false;
        if (!manufacturer.equals(car.manufacturer)) return false;
        if (!model.equals(car.model)) return false;
        return type == car.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer.hashCode();
        result = 31 * result + model.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(horsepower);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + type.hashCode();
        result = 31 * result + (rightHand ? 1 : 0);
        return result;
    }
}
