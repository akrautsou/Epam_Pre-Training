class Fourth {
    void start() {
        Integer number = 4678;
        int a, b, c, d;
        a = number % 10;
        number /= 10;
        b = number % 10;
        number /= 10;
        c = number % 10;
        number /= 10;
        d = number % 10;
        if (check(a, b, c, d)) {
            System.out.println("Vernoe");
        } else {
            System.out.println("Nevernoe");
        }
    }

    private boolean check(int a, int b, int c, int d) {
        return (d > c && c > b && b > a);
    }
}