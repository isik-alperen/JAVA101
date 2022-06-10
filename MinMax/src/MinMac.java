import java.util.Scanner;
public class MinMac {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int i,a,b,min=1000000000,max=1;

        System.out.println("Kac sayi gireceksiniz ? ");
        a=girdi.nextInt();
        for(i=1;i<=a;i++){
            System.out.println(i+". sayiyi giriniz>>");
            b=girdi.nextInt();
            if(i==1){
                max=b;
                min=b;
            }
            else {
                if (b > max) {
                    max = b;
                }
                if (b < min) {
                    min = b;
                }
            }
        }
        System.out.println("En buyuk sayi: "+max);
        System.out.println("En kucuk sayi: "+min);
    }
}
