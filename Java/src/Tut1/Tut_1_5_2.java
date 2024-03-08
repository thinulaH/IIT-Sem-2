import java.util.Scanner;
public class Tut_1_5_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length in CM :");
        float lenCM = input.nextFloat();
        float lenM = lenCM/100 ;
        System.out.println(lenCM+"cm ----> "+lenM+"m");
    }
}
