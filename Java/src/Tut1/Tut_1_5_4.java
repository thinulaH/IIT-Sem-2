import java.util.Scanner;
public class Tut_1_5_4{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Manual count :");
        int manualCount = input.nextInt();
        System.out.print("Skilled count :");
        int skilledCount = input.nextInt();
        System.out.print("Management count :");
        int manageCount = input.nextInt();
        int wageBill = (manualCount*500)+(skilledCount*700)+(manageCount*800);
        float tax = wageBill*20/100;
        System.out.println("Wage Bill :"+wageBill);
        System.out.println("Tax :"+ tax);
    }
}