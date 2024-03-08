import java.util.Scanner;
import java.util.Random;
public class Tut_2_8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String user = "";
        String rand = "";
        String winner = "";
        int randomNum = random.nextInt(3);
        System.out.print(" 0 --> Rock\n 1 --> Paper\n 2 --> Scissors\nEnter your choice : ");

        if (randomNum ==0){
            rand = "Rock";
        } else if (randomNum==1) {
            rand = "Paper";
        } else {
            rand = "Scissor";
        }

        int userChoice = input.nextInt();
        if (userChoice ==0){
            user = "Rock";
        } else if (userChoice==1) {
            user = "Paper";
        } else if (userChoice==2) {
            user = "Scissor";
        } else {
            System.out.println("Invalid input!");
        }

        if(randomNum == userChoice){
            System.out.println("Tie\n");
            System.out.print("user     : "+user);
            System.out.print("computer : "+rand);
        } else if ((userChoice==0 && randomNum==2) ||(userChoice==2 &&randomNum==1) ||(userChoice==1 && randomNum==0)) {
            winner = "User";
        }else if ((randomNum==0 && userChoice==2) ||(randomNum==2 && userChoice==1) ||(randomNum==1 && userChoice==0)) {
            winner = "Computer";
        }
        System.out.println("Winner is "+winner);
        System.out.println("User     :"+user);
        System.out.println("Computer :"+rand);

    }
}