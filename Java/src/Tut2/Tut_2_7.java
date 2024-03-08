import java.util.Scanner;
public class Tut_2_7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your account balance :");
        float accBalance = input.nextFloat();
        Boolean exit = false ;
        while(!exit){
            System.out.print("Enter a number according to this menu -\n 1 - Deposit money\n 2 - Withdraw money\n" +
                    " 3 - Fraud check\n 4 - Exit\n");
            String selection = input.next();
            float dep ;
            float wid ;
            float frdLimit = 1000;
            switch(selection){
                case "1":
                    System.out.print("Deposit : ");
                    dep = input.nextFloat();
                    accBalance += dep;
                    break;
                case "2":
                    System.out.print("Withdraw : ");
                    wid = input.nextFloat();
                    if(accBalance-wid<=0){
                        System.out.println("You can't withdraw money. Your account balance = "+accBalance);
                    }else{
                        accBalance -= wid;
                    }
                    break;
                case "3":
                    if (frdLimit>accBalance) {
                        System.out.println("Warning: Your account balance is low. Please be cautious of potential fraud.");
                    }else{
                        System.out.println("Your account is safe");
                    }
                    break;
                case "4":
                    System.out.println("your account balance is Rs."+accBalance+"\nExiting...");
                    exit = true;
                    break;

            }

        }

    }
}