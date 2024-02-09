import java.util.Scanner;

public class Lec3{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Choose an Operator :");
        String operator = input.next();
        System.out.print("Enter number 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = input.nextInt();
        """if(operator.equals("+")){
           int result = num1 + num2;
            System.out.println(result);
        } else if (operator.equals("-")) {
           int result = num1 - num2;
            System.out.println(result);
        } else if (operator.equals("*")) {
           int result = num1*num2;
            System.out.println(result);
        } else if (operator.equals("/")) {
           int result = num1/num2;
            System.out.println(result);
        }"""
        int result;
        switch (operator){
            case "+":
                result = num1 + num2;
                //System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                //System.out.println(result);
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
        }
        System.out.println(result);


    }
}