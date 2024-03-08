import java.util.Scanner;
public class Tut3_5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;
        System.out.print("The Fibonacci series : 1, ");
        for(int i = n-2;i>0;i--){
            n3 = n2 +n1;
            n1 = n2;
            n2 = n3 ;
            System.out.print(n1+", ");
        }
        System.out.println(n3 +"\nn"+n +" = "+n3);
        input.close();

    }
}