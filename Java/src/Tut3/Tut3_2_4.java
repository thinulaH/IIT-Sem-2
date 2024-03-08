public class Tut3_2_4{
    public static void main(String[] args){
        for(int i = 9; i>0; i-=2){
            for(int j = (9-i)/2;j>0;j--){
                System.out.print(" ");
            }
            for(int x = i;x>0;x--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}