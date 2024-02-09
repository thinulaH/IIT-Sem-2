import java.util.Scanner;

public class myFirstApp {
	public static void main(String[] args){
		Scanner readInput = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = readInput.next();
		System.out.println("Hello "+name );
		
	}
}
