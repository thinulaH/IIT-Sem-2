public class Tut3_2_3{
    public static void main(String[] args){
        for(int i = 1; i<6; i++){
            for(int j = (5-i);j>0;j--){
                System.out.print(" ");
            }
            for(int x = i;x>0;x--){

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}