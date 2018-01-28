class Seventh {
    static void start() {
        Integer numberstart = 1234567, numberfinish;
        numberfinish = reverse(numberstart);
        System.out.println("first:" + numberstart);
        System.out.println("second:" + numberfinish);
    }

    private static int reverse(int num) {
        return num < 10 ? num : Integer.parseInt(String.valueOf(num % 10) + reverse(num / 10));
    }
}

