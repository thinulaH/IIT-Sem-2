import java.util.Random;
import java.util.Scanner;

public class Tut3_8 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNum = random.nextInt(20);
        System.out.println(randomNum);
        System.out.print("Enter your guess :");
        int guess = input.nextInt();
        int i = 5;
        while(i>0){
            if(guess==randomNum){
                System.out.println("You are correct :) ");
                break;
            }else{
                System.out.println("You are not correct :( ");
            }
            System.out.print("Enter your guess :");
            guess = input.nextInt();
            i-- ;

        }

    }
}