class Sequence {
    public void start() {
        int number = 4678;
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number / 100) % 10;
        int d = (number / 1000) % 10;
        System.out.println(check(a,b,c,d));
    }

    private boolean check(int a, int b, int c, int d) {
        return (d > c && c > b && b > a);
    }
}