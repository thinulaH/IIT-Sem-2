import java.util.Scanner;
public class Weather {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double [][] wearherRecords = new double[31][10];
        double [][] sortedwearherRecords = new double[31][10];
        double highestTemp ;
        double lowestTemp ;
        for(int days = 0;days< wearherRecords.length;days++){
            System.out.println("Day " +days+":" );
            for(int i=0;i<2;i++){
                if (i==0){
                    System.out.print("Enter lowest temperature :");
                    wearherRecords[days][i] = input.nextInt();
                }
                if (i==1){
                    System.out.print("Enter highest temperature :");
                    wearherRecords[days][i] = input.nextInt();
                }
            }
        }

    }
}