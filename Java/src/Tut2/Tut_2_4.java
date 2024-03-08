import java.util.Scanner;
public class Tut_2_4{
    public static void main(String[] args){
        String classification = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score : ");
        int score = input.nextInt();
        if(score>100 || score<40){
            classification = "Invalid Value";
        } else if (score>=70 ) {
            classification = "1st Class Honours (1)";
        } else if (score>=60) {
            classification = "2nd Class Honours Upper Division (2:i)";
        } else if (score>=50) {
            classification = "2nd Class Honours Lower Division (2:ii)";
        } else{
            classification = "3rd Class Honours (3)";
        }
        System.out.println(classification);
    }
}