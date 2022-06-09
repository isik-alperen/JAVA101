import java.sql.SQLOutput;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int a,b,c;
        int i,n=1,r=1,t=1;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Kac elemanli bir kume ?");
        a= girdi.nextInt();
        System.out.println("Kac elemanli gruplar ?");
        b= girdi.nextInt();
        for(i=1;i<=a;i++){
            n=i*n;
        }
        for(i=1;i<=b;i++){
            r=r*i;
        }
        for(i=1;i<=(a-b);i++){
            t=t*i;
        }
        c=n/(r*t);


        System.out.println(a+" elemanli bir kumenin "+b+" elemanli "+c+" adet farkli kombinasyonu vardir");
    }
}
