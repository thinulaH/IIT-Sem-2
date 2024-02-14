import java.util.Scanner;

public class Tut3_6{
    public static void main(String[] args){
        double ans = 0;
        String operator = "";
        Scanner input = new Scanner(System.in);
        double num1 , num2;
        String ansString = "";
        while (true) {
            try {
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }
        while (true) {
            try {
                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }
        System.out.print("Enter operator(+,-,*,/): ");
        operator = input.next();
        while (!operator.equals("+") && !operator.equals("-")&& !operator.equals("*") && !operator.equals("/")){
            System.out.print("Enter operator(+,-,*,/): ");
            operator = input.next();
        }

        switch (operator){
            case "+":
                ans = num1 + num2 ;
                ansString = Double.toString(ans);
                break;
            case "-":
                ans = num1 - num2 ;
                ansString = Double.toString(ans);
                break;
            case "*":
                ans = num1 * num2 ;
                ansString = Double.toString(ans);
                break;
            case "/":
                if(num2==0){
                    System.out.println("You cant divide number by 0.");
                    ansString = "X";
                }else{
                    ans = num1 / num2;
                    ansString = Double.toString(ans);
                    break;
                }
        }
        System.out.println(num1 +" "+operator+" "+num2+" = "+ ansString );
    }
}