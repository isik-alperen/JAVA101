import java.util.Scanner;
public class notort {
    public static void main(String[] args) {
        int ders1,ders2,ders3,ders4;
        float top,ort;


        Scanner input =new Scanner(System.in);

        System.out.print("Ilk ders sinav notunuzu giriniz>>\n");
        ders1=input.nextInt();

        System.out.print("\nIkinci sinav notunuzu giriniz>> \n");
        ders2= input.nextInt();

        System.out.print("\nUcuncu sinav notunuzu giriniz>>\n");
        ders3=input.nextInt();

        System.out.print("\nDorduncu sinav notunuzu giriniz>>\n");
        ders4= input.nextInt();

        top=ders1+ders2+ders3+ders4;
        ort= top/4;

        boolean kosul=ort>60;
        System.out.println("Ortalamaniz>> "+ort);
        System.out.println(ort>60 ? "\nSinifi gectiniz" : "\nsinifta kaldiniz");




    }
}
