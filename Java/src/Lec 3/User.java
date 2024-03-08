import java.util.Scanner;
public class User{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        String jobTitle = "";
        String emp_Num = "";
        String wantToContinue = "No";
        do{
            System.out.print("Enter emp. name :");
            name = input.next();
            System.out.print("Enter emp. jobTitle :");
            jobTitle = input.next();
            System.out.print("Enter emp. number :");
            emp_Num = input.next();
            System.out.println("Name :"+name);
            System.out.println("Emp.ID :"+emp_Num);
            System.out.println("Job title :"+jobTitle);
            System.out.println("Do you want to continue ?(Yes/No) ");
            wantToContinue = input.next();
        } while(wantToContinue.equals("Yes"));

    }
}