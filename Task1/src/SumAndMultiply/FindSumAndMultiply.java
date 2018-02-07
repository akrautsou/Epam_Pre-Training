package SumAndMultiply;

public class FindSumAndMultiply {
    public int findSum(int number) {
        int a = number % 10;
        int b = (number /= 10) % 10;
        int c = (number /= 10) % 10;
        int d = (number /= 10) % 10;
        int e = (number / 10) % 10;
        return (a + b + c + d + e);
    }

    public int findMultiply(int number) {

        int a = number % 10;
        int b = (number /= 10) % 10;
        int c = (number /= 10) % 10;
        int d = (number /= 10) % 10;
        int e = (number / 10) % 10;
        return (a * b * c * d * e);
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