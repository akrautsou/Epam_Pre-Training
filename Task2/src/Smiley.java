import java.util.Random;

public class Smiley {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int number = random.nextInt(250);
        String result = check(number);
        output(result);
    }
    private static String check(int number){
        if(number == 0){
            return (":)");
        } if (number < 50){
            return (":D");
        } if (number < 100){
            return (">:-[");
        } if (number < 150){
            return (":(");
        } if(number < 200){
            return (":-|");
        } if(number < 250){
            return (":-X");
        } if(number == 250){
            return ("q(^_^)p");
        }
        return "";
    }

    private static void output(String result) {
        System.out.println(result);
    }

}
