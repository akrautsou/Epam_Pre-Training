class Fifth {
    void start() {
        Integer numbers = 45678;
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
        int sum1 = 0;
        int proizv1 = 1;

        sum1  = sum1 + a+b+c+d+e;
        proizv1 = proizv1 *a*b*c*d*e;

        System.out.println("sum = " + sum1);
        System.out.println("proizv = " + proizv1);

        /*        String txt = Integer.toString(numbers);
        int sum = 0;
        int proizv = 1;
        char[] array = txt.toCharArray();
        for (char c : array) {
            sum = sum + Character.getNumericValue(c);
            proizv = proizv * Character.getNumericValue(c);
        }
        System.out.println("sum = " + sum);
        System.out.println("proizv = " + proizv);*/
    }
}
