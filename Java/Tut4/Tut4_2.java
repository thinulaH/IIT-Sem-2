public class Tut4_2 {
    public static void main(String[] args){
        String[] array2 = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};
        String temp = array2[2];
        array2[2] = array2[4];
        array2[2] = temp;
        for(String name : array2){
            System.out.print(name+ " ");
        }
        System.out.println();
    }
}