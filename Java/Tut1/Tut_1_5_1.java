import java.util.Scanner;
public class Tut_1_5_1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name :");
		String firstName = input.next();
		System.out.print("Enter your second name :");
		String secondName = input.next();
		String init1 = firstName.substring(0,1); 
		String init2 = secondName.substring(0,1);
		
		System.out.println(init1+init2);
		
	}
}