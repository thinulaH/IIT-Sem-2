import java.util.Scanner;
public class Tut4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] marks = new double[5][3];
        for(int i = 0;i< marks.length;i++){
            System.out.println("Student " +(i+1)+" :");
            for(int j=0;j< marks.length[i];j++){
                System.out.print("Enter marks "+(j+1) +":");
                marks[i][j] = input.nextInt();
            }
        }

    }
}