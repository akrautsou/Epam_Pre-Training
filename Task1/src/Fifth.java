class Fifth {
    void start() {
        Integer numbers = 45678;
        String txt = Integer.toString(numbers);
        char[] array = txt.toCharArray();
        int sum = 0;
        int proizv = 1;
        for (char c : array) {
            sum = sum + Character.getNumericValue(c);
            proizv = proizv * Character.getNumericValue(c);
        }
        System.out.println("sum = " + sum);
        System.out.println("proizv = " + proizv);
    }
}
