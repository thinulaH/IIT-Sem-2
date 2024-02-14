import java.util.Scanner;
public class Tut3_3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.print("Enter a number : ");
        String letter = input.next();
        System.out.print("output : ");
        for(int i = number;i>0;i--){
            System.out.print(letter);
        }

    }
}