
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double pi,a,r,alan;
        pi=3.14;
        Scanner girdi=new Scanner(System.in);
        System.out.println("Lutfen yari capi giriniz>>\n");
        r=girdi.nextDouble();
        System.out.println("Lutfen alfa merkez acisini giriniz>>\n");
        a=girdi.nextDouble();

        alan=(pi*(r*r)*a)/360;
        System.out.println("Daire diliminizin alani >> "+alan);
    }

}

