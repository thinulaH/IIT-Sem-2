package Tut5;

import java.util.Scanner;
public class Tut5_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        menu();
        do {
            String option = input.next();
            switch (option) {
                case 1:
                    addition();
                case 2:
                    subtraction();

            }
        }while(option=="0");


    }

    public static double addition(){
        System.out.print("\n Enter num 1 : ");
        double num1 = input.nextDouble();
        System.out.print("\n Enter num 2 : ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        System.out.print(num1 + " + " + num2 +" = " +sum);
    }



    public static void line(){
        System.out.println("**********");
    }



    public static void menu(){
        line();
        System.out.println("   MENU");
        line();
        System.out.print("1.- Addition \n2.- Subtraction \n0.- Quit Please select an option:\n");

    }
}
