import java.util.Scanner;
public class Tut_2_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 :");
        double num1 = input.nextDouble();
        System.out.print("Enter num2 :");
        double num2 = input.nextDouble();
        double sum = num1 + num2 ;
        System.out.println(num1+" + " + num2+" = "+sum);
    }
}