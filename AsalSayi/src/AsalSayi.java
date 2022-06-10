import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i,a,j,b;
        System.out.println("Kaca kadar olan asal sayilari gormek istersin ?");
        a= input.nextInt();
        for(i=a;i>1;i--){
            int say=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    say++;
                }
            }
            if(say==2){
                System.out.print(i+" ");
            }

        }


    }
}
