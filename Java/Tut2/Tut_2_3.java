import java.util.Scanner;
public class Tut_2_3{
    public static void main(String[] args){
        double finalMark;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your CW marks  : ");
        float cwMarks = input.nextFloat();
        System.out.print("Enter your ICT marks : ");
        float ictMarks = input.nextFloat();
        if (cwMarks>=30 && ictMarks>=30){
            finalMark = (ictMarks+cwMarks)/2;
            if (finalMark>=40){
                System.out.println("Pass\n"+finalMark);
            }
        }else {
            System.out.println("Fail");
        }
    }
}