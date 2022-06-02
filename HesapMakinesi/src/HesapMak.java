import java.util.Scanner;
public class HesapMak {
    public static void main(String[] args) {
        float a1,a2,sonuc;
        int sec;

        Scanner girdi=new Scanner(System.in);
        System.out.println("Sayi_1'i giriniz>>\n");
        a1=girdi.nextFloat();
        System.out.println("Sayi_2'i giriniz>>\n");
        a2=girdi.nextFloat();

        System.out.println("Yapmak istediginiz islemi secin\n1-Toplama\n2-Cikartma\n3-Carpma\n4-Bolme\n");
        sec= girdi.nextInt();

        switch(sec){
            case 1:
                sonuc=a1+a2;
                System.out.println("Toplama islemi sonucu = "+sonuc);
                break;
            case 2:
                sonuc=a1-a2;
                System.out.println("Cikartma islemi sonucu = "+sonuc);
                break;
            case 3:
                sonuc=a1*a2;
                System.out.println("Carpma islemi sonucu = "+sonuc);
                break;
            case 4:
                sonuc=a1/a2;
                System.out.println("bolme islemi sonucu = "+sonuc);
                break;

        }

    }
}
