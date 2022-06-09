import java.util.Scanner;
public class GirilenSayiyaKadar {
    public static void main(String[] args) {
        Scanner girdi = new Scanner (System.in);
        System.out.println("Sayi giriniz:");
        int i,j,k;
        k= girdi.nextInt();
        System.out.print("Dordun kuvvetleri: ");
        for(i=1;i<=k;i*=4)
        {
            System.out.print(i+"\t");
        }
        System.out.print("\n");
        System.out.print("Besin kuvvetleri:  ");
        for (j=1;j<=k;j*=5){
            System.out.print(j+"\t");
        }
    }
}
