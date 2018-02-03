class FindSumAndMultiply {
    public void start() {
        int number = 45678;
        int a = number % 10;
        int b = (number /= 10) % 10;
        int c = (number /=10) % 10;
        int d = (number /= 10) % 10;
        int e = (number /= 10) % 10;
        System.out.println("sum = " + findSum(a,b,c,d,e));
        System.out.println("multiply = " + findMultiply(a,b,c,d,e));


    }

    private int findSum(int a, int b, int c, int d, int e) {
        return ( a + b + c + d + e);
    }

    private int findMultiply(int a, int b, int c, int d, int e) {
        return ( a * b * c * d * e);
    }
}
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