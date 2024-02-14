public class Tut3_1 {
    public static void main(String[] args){
        System.out.println("i) (for loop)");
        for(int i=1;i<6;i++){
            System.out.println(i);
        }

        System.out.println("i) (while loop)");
        int j = 1;
        while(j<6){
            System.out.println(j);
            j += 1;
        }

        System.out.println("ii) (for loop)");
        for(int x=0; x<=14; x+=2){
            if (x==6){
                continue;
            }
            System.out.println(x);
        }

        System.out.println("ii) (while loop)");
        int y = 0;
        while(y<15){
            if(y==6){
                y = y + 2;
                continue;
            }
            System.out.println(y);
            y = y + 2;

        }

    }
}
