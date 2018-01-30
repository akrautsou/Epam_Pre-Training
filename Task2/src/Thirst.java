import java.util.Random;

public class Thirst {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int number = random.nextInt(250);
        if(number == 0){
            System.out.println("You're happy");
        }else if (number < 50){
            System.out.println("You're dovolen");
        }else if (number < 100){
            System.out.println("you're normal");
        }else if (number < 150){
            System.out.println("you're nervious");
        }else if(number < 200){
            System.out.println("you're panic");
        }else if(number < 250){
            System.out.println("You're scared");
        }else if(number == 250){
            System.out.println("you are died");
        }
        System.out.println(number);
    }
}
