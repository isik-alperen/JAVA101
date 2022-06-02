import java.util.Scanner;
public class ManavKasa {
    public static void main(String [] args){
        float armut,elma,dom,muz,patl,tutar;
        float farmut=2.14f,felma=3.67f,fdom=1.11f,fmuz=0.95f,fpatl=5;

        Scanner girdi = new Scanner(System.in);

        System.out.println("\nArmut miktarini kilo cinsinden giriniz>>\t");
        armut=girdi.nextFloat();
        System.out.println("\nElma miktarini kilo cinsinden giriniz>>\t");
        elma=girdi.nextFloat();
        System.out.println("\nDomaetes miktarini kilo cinsinden giriniz>>\t");
        dom=girdi.nextFloat();
        System.out.println("Muz miktarini kilo cinsinden giriniz>>\t");
        muz=girdi.nextFloat();
        System.out.println("Patlican miktarini kilo cinsinden giriniz>>\t");
        patl=girdi.nextFloat();

        tutar=((farmut*armut)+(felma*elma)+(fdom*dom)+(fmuz*muz)+(fpatl*patl));
        System.out.print("Toplam tutar: "+tutar);
        System.out.println(" TL");





    }
}
