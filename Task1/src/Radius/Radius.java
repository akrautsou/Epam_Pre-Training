package Radius;

public class Radius {
    public double radiusOfABagel(int first, int second) {
        return Math.abs(spaceCalculate(first) - spaceCalculate(second));
    }

    private double spaceCalculate(int radius) {
        return Math.pow(radius, 2) * Math.PI;
    }
}
