import java.util.Scanner;

public class Tut_1_5_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temprature in celcius :");
        double tempC = input.nextDouble();
        double tempF = tempC*(9.0/5)+32 ;
        System.out.println(tempC+"C ----> "+tempF+"F");
    }
}

