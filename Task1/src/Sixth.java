class Sixth {

    void start() {
        Integer numbers = 1234567;
        double geomAverage1;
        double average1;
        double sum1 = 0;
        double multiply1 = 1;
        Integer a = numbers % 10;
        numbers = numbers / 10;
        Integer b = numbers % 10;
        numbers = numbers / 10;
        Integer c = numbers % 10;
        numbers = numbers / 10;
        Integer d = numbers % 10;
        numbers = numbers / 10;
        Integer e = numbers % 10;
        numbers = numbers / 10;
        Integer f = numbers % 10;
        numbers = numbers / 10;
        Integer g = numbers % 10;

        sum1  = sum1 + a+b+c+d+e+f+g;
        multiply1 = multiply1 *a*b*c*d*e*f*g;

        average1 = sum1 / 7;
        double degree = (1 / (double) (7));
        geomAverage1 = Math.pow(multiply1, degree);

        System.out.println("Average:" + average1);
        System.out.printf("geomaverage:" + "%.2f\n", geomAverage1);


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

    }
}
