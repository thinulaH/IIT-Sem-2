import java.util.Scanner ;
public class Tut4_1 {
    public static void main(String[] args){
        int failCount=0 ;
        int sum =0;
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[6];
        for(int i=0;i<6;i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            array1[i] = input.nextInt();
            sum = sum+array1[i];
            if (array1[i] < 40) {
                failCount++;
            }
        }
        for(int y : array1){
            System.out.println(y);
        }
        System.out.println("Average : "+(sum/6));
        System.out.println("Fail count :"+failCount);
    }
}