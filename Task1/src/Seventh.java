class Seventh {
    void start() {
        Integer numberStart = 1234567;
        Integer numberFinish = reverse(numberStart);
        System.out.println("first:" + numberStart);
        System.out.println("second:" + numberFinish);
    }

    private int reverse(int num) {
        return num < 10 ? num : Integer.parseInt(String.valueOf(num % 10) + reverse(num / 10));
    }
}

