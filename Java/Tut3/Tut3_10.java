import java.util.*;
import java.io.*;
public class Tut3_10{
    public static void main(String[] args){
        int number , power, count;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = input.nextInt();
        System.out.println("Enter power ");
        power = input.nextInt();
        int total = number;
        count = 1;
        while(count<power){
            total = total * number;
            count++ ;
        }
        {
            System.out.println("The answer is " + total);
        }

    }


}