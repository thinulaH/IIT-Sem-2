public class Pattern{
    public static void main(String[] args){
        for(int i = 6;i>0;i--){
            for (int j =0;j<6-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}