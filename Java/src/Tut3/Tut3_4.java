import java.util.Scanner;
public class Tut3_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number that you want to find factorial : ");
        int num = input.nextInt();
        if (num>0) {
            int Factorial = 1;
            for (int i = num; i > 0; i--) {
                Factorial = Factorial * i;
            }
            System.out.print("Factorial of " + num + " = ");
            for (int j = num; j > 1; j--) {
                System.out.print(j + " x ");
            }

            System.out.print("1 = " + Factorial + ".");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1. ");
        } else{
            System.out.println("You need to Enter a positive number. ");
        }
    }
}