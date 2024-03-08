import java.util.Scanner;
public class Tut3_7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int passcode = 48651;
        int i = 0;
        do {
            System.out.print("Enter your password :");
            int userpw = input.nextInt();
            if (userpw==passcode){
                System.out.println("Correct passcode");
                break;
            }
            else{
                System.out.println("incorrect passcode");
            }
            i++ ;

        }while(i<4);
    }
}