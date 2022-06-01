
package UcgenAlan;

        import java.util.Scanner;


public class Ucgen {
    public static void main(String[] args) {
        int a,b,c,cevre,u;
        double alankare,alan;
        Scanner girdi =new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz: ");
        a= girdi.nextInt();
        b= girdi.nextInt();
        c= girdi.nextInt();

        cevre = a+b+c;
        System.out.println("Ucgenin cevresi:  "+cevre);
        u=cevre/2;
        alankare=(u*(u-a)*(u-b)*(u-c));
        alan=Math.sqrt(alankare);
        System.out.print("\nUcgenin alani: "+alan);
    }
}

