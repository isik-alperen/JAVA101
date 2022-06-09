import java.util.Scanner;
public class SayiDegerleriTop {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int sayi,i,a=0;
        int sonuc=1,bas=0,sayd=0;
        System.out.print("Sayi giriniz>>");
        sayi=girdi.nextInt();

        do{
            sonuc=sayi/10;
            sayd=sayi%10;
            a=a+sayd;
            bas++;
            sayi=sonuc;
        }while(sonuc!=0);
        System.out.println(bas+" basamakli bir sayi");
        System.out.println("Sayi degerleri toplami: "+a);
    }
}
