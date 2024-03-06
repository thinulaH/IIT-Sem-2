public class Tut4_4 {
    public static void main(String[] args){
        int[] array4 = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("a) :");
        for (int num : array4){
            if(num%2==0){
                System.out.print(num+" ");
            }

        }
        System.out.print("\nb) :");
        for(int num2 : array4){
            for(int num3 : array4){
                if ((num2*2)==num3){
                    System.out.print(num3 +" ");
                }
            }
        }

    }

}