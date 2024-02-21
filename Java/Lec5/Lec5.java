import java.util.Scanner;
public class Lec5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String stuName[] = new String[5];
        int marks[] = new int[5];
        int total = 0 ;
        for(int i = 0;i<5;i++){
            System.out.print("Enter student name :");
            stuName[i] = input.next();
            System.out.print("Enter student marks :");
            marks[i] = input.nextInt();
            total = total + marks[i];
        }
        for(int j = 0;j<5;j++){
            System.out.println(stuName[j]+" :"+marks[j]);
        }

    }
}