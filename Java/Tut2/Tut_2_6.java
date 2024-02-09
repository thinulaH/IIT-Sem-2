import java.util.Scanner;
public class Tut_2_6{
    public static void main(String[] args){
        String msg ="";
        Scanner input = new Scanner(System.in);
        System.out.print("Number of class held     : ");
        float totCls = input.nextInt();
        System.out.print("Number of class attended : ");
        float attCls = input.nextInt();
        float atdPc = (attCls/totCls)*100;
        if(atdPc>=75){
            msg = "You are allowed to sit in exam.";
        }else{
            System.out.print("Had a medical cause ?(Y/N) ");
            String med = input.next();
            if(med.equals("Y")) {
                msg = "Pls. contact SRU ";
            } else if (med.equals("N")) {
                msg = "You are not allowed to sit in exam.";
            }
        }
        System.out.println("Your attendance percentage is "+atdPc+"%\n"+msg);
    }
}