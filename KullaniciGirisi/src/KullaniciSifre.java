import java.util.Scanner;

public class KullaniciSifre {
    public static void main (String[] args){

        String userName,password,sifre;
        char sec;

        Scanner girdi= new Scanner(System.in);
        System.out.println("Kullanici adi giriniz >>");
        userName=girdi.nextLine();
        System.out.println("Sifre giriniz >> ");
        password= girdi.nextLine();

        if(password.equals("java123"))
        {
            System.out.println("Oturum aciliyor...");
        }
        else{
            System.out.println("Sifreyi yanlis girdiniz\nSifreyi sifirlamak ister misiniz ?\nEvetse 'E' Hayirsa 'H' tusuna basiniz");
            String sec2= girdi.next();
            sec= sec2.charAt(0);
            switch (sec){
                case 'e':
                    System.out.println("Yeni sifreyi giriniz >> ");
                    Scanner giris = new Scanner(System.in);
                    sifre=giris.nextLine();
                    if (sifre.equals("java123")){
                        System.out.println("Sifreniz onceki sifre ile ayni olamaz");
                    }
                    else {
                        System.out.println("Sifre basariyla degistirildi");
                    }
                    break;
                case 'E':
                    System.out.println("Yeni sifreyi giriniz >> ");
                    sifre=girdi.nextLine();
                    if (sifre == password){
                        System.out.println("Sifreniz onceki sifre ile ayni olamaz");
                    }
                    else {
                        System.out.println("Sifre basariyla degistirildi");
                    }
                    break;
                case 'h':
                    System.out.println("Lutfen bilgilerin dogrulugundan emin olup tekrar deneyiniz.");
                    break;
                case 'H':
                    System.out.println("Lutfen bilgilerin dogrulugundan emin olup tekrar deneyiniz.");
                    break;

            }

        }
    }
}
