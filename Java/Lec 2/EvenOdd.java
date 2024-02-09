import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        String option = "start";
        while (option.equals("start")) {
            Scanner num = new Scanner(System.in);
            System.out.print("Enter a number :");
            if (num % 2 == 0 ){
                System.out.println("The number is an even number");
            }
            else{
                System.out.println("The number is an odd number");
            }
            Scanner option = new Scanner(System.in);
            System.out.print("Do you wanna continue");
        }
    }
}
