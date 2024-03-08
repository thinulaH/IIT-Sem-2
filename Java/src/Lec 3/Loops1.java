public class Loops1{
    public static void main (String[] args){
        for(int i=0;i<10;i++){
            System.out.println("for loop "+i);
        }
        int j = 10 ;
        while(j>0){
            System.out.println(("while loop "+j));
            j--;
        }
        int x = 0;
        do{
            System.out.println("Do-while "+x);
            x++;
        }while(x<10);
    }
}