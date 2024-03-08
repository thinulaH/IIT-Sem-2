import java.util.Scanner;
public class Tut4_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] array3 = {12,32,54,63,55,32,12,23};
        for(double num : array3){
            System.out.print(num+" ");
        }
        System.out.print("\nEnter num1(i) :");
        int i = input.nextInt();
        System.out.print("Enter num2(j) :");
        int j = input.nextInt();
        double temp = array3[i];
        array3[i] = array3[j];
        array3[j] = temp;
        for(double num1 : array3){
            System.out.print(num1+" ");
        }

    }
}