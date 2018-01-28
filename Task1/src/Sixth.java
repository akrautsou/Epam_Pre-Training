class Sixth {

    void start() {
        Integer numbers = 1234567;
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
        System.out.printf("geomaverage:" + "%.2f\n", geomAverage);
    }
}
