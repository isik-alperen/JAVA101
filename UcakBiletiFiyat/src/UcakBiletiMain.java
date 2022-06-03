import java.util.Scanner;
public class UcakBiletiMain {
    public static void main(String[] args) {
        Scanner girdi =new Scanner (System.in);

        int yol,yas,tip,tarife=0;
        float tutar;
        System.out.println("Lutfen gideceginiz mesafeyi km cinsinden giriniz >>");
        yol = girdi.nextInt();
        System.out.println("Lutfen yasinizi giriniz >>");
        yas= girdi.nextInt();
        if(yas<1){
            System.out.println("Lutfen gecerli bir yas girin");
        }
        else if(yas>0 && yas<=12)
        {
            tarife=1;
        } else if (yas>12 && yas<25) {
            tarife=2;
        }
        else if(yas>65){
            tarife=3;
        }
        else{
            tarife=4;
        }
        System.out.println("Lutfen yolculuk tipini giriniz >>\n1--> Tek yon\n2-->Gidis donus");
        tip= girdi.nextInt();
        if(tip==1) {
            switch (tarife) {
                case 1:
                    System.out.println("Toplam tutar: " + (((yol * 0.10) * tip) / 2));
                    break;
                case 2:
                    System.out.println("Toplam tutar: " + ((yol * 0.10) * tip * 9 / 10));
                    break;
                case 3:
                    System.out.println("Toplam tutar: " + ((yol * 0.10) * tip * 7 / 10));
                    break;
                case 4:
                    System.out.println("Toplam tutar: " + ((yol * 0.10) * tip));
            }
        }
        else{
            switch (tarife) {
                case 1:
                    System.out.println("Toplam tutar: " + (((yol * 0.10) * tip) / 2)*8/10);
                    break;
                case 2:
                    System.out.println("Toplam tutar: " + ((yol * 0.10) * tip * 9 / 10)*8/10);
                    break;
                case 3:
                    System.out.println("Toplam tutar: " + ((yol * 0.10) * tip * 7 / 10)*8/10);
                    break;
                case 4:
                    System.out.println("Toplam tutar: " + ((yol * 0.10) * tip)*8/10);
            }
        }

    }
}
