import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner girdi = new Scanner (System.in);
        System.out.println("Ogrenmek istediginiz yili girin>>");
        yil=girdi.nextInt();
        if((yil%4)==0){
            System.out.println("Artik yildir");
        }
        else
            System.out.println("Artik yil degildir");
    }

}
