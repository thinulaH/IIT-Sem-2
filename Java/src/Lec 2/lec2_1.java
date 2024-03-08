import java.util.Scanner;
public class lec2_1 {
    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter the initials of first name :");
        char initials = readInput.next().charAt(0);
        System.out.print("Enter Your last name :");
        String secondName = readInput.next();
        System.out.print("Enter your year of birth :");
        int yr = readInput.nextInt();
        System.out.print("Enter your height  :");
        float height = readInput.nextFloat();

        System.out.println("Your Report ");
        System.out.println(initials+""+secondName);
        //System.out.println(74 / 10 % 2 * 5 – 10 % ( 5 – 1));




    }
    
}
