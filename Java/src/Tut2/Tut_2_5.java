import java.util.Scanner;
public class Tut_2_5{
    public static void main(String[] args){
        float ans = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number     : ");
        float num1 = input.nextFloat();
        System.out.print("Enter operator(+,-,*,/): ");
        String operator = input.next();
        System.out.print("Enter second number    : ");
        float num2 = input.nextFloat();
        switch (operator){
            case "+":
                ans = num1 + num2 ;
                break;
            case "-":
                ans = num1 - num2 ;
                break;
            case "*":
                ans = num1 * num2 ;
                break;
            case "/":
                ans = num1 / num2 ;
                break;
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+ans);

    }
}