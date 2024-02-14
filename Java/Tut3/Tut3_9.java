public class Tut3_9 {
    public static void main(String[] args){
        for(int i = 0;i<=500;i++){

            int vten = (i%1000-i%100)/100;
            int vhun = (((i%100-i%10)/10));
            int vtho = ((i%10));

            int temp = vten*vten*vten + vhun*vhun*vhun + vtho*vtho*vtho;
            if (temp==i){
                System.out.println(i);
            }

        }
    }
}