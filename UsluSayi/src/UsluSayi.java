import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int i,j=1,k;
        int sayi,us;
        System.out.println("Sayi giriinz");
        sayi= girdi.nextInt();
        System.out.println("Us kuvvetini giriniz");
        us= girdi.nextInt();
        if(us==0){
            System.out.println("Sonuc: 1");
        }
        else {
            j = sayi;
            for (i = 1; i < us; i++) {
                sayi = j * sayi;
            }
            System.out.println("Sonuc: " + sayi);
        }
    }
}
