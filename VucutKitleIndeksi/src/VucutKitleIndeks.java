import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        double boy,kilo,index;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz >>\n");
        boy= girdi.nextDouble();
        System.out.println("Kilonuzu giriniz >> \n");
        kilo= girdi.nextDouble();

        index= kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz: "+index);

    }
  }
