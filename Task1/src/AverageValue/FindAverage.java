package AverageValue;

public class FindAverage {
    private static final double DEGREE = 1 / (double) (7);


    public int sumForAverage(int number) {
        int a = number % 10;
        int b = (number /= 10) % 10;
        int c = (number /= 10) % 10;
        int d = (number /= 10) % 10;
        int e = (number /= 10) % 10;
        int f = (number /= 10) % 10;
        int g = (number / 10) % 10;
        return a + b + c + d + e + f + g;

    }

    public int multiplyForAverage(int number) {
        int a = number % 10;
        int b = (number /= 10) % 10;
        int c = (number /= 10) % 10;
        int d = (number /= 10) % 10;
        int e = (number /= 10) % 10;
        int f = (number /= 10) % 10;
        int g = (number / 10) % 10;
        return a * b * c * d * e * f * g;

    }

    public double geomAverage(double multiply) {
        return Math.pow(multiply, DEGREE);
    }

    public double findAverage(double sum) {
        return (sum / 7);
    }
}
        /*
        String n = Integer.toString(numbers);
        char[] charArray = n.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            intArray[i] = c;
        }
        double average = 0;
        double multiply = 1.0;
        double geomAverage = 1;
        double sum = 0;
        if (intArray.length > 0) {
            for (int anIntArray : intArray) {
                sum += anIntArray;
                multiply *= anIntArray;
            }
            average = sum / intArray.length;
            double degree = (1 / (double) (intArray.length));
            geomAverage = Math.pow(multiply, degree);
        }
        System.out.println("Average:" + average);
        System.out.printf("geomaverage:" + "%.2f\n", geomAverage);*/