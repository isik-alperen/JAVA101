import java.util.Scanner;
public class ReculsiveUslu {
    static void UsAl(){
        Scanner input = new Scanner(System.in);
        int a,b,result=1;
        System.out.println("Sayi giriniz:");
        a= input.nextInt();
        System.out.println("Us degeri giriniz:");
        b= input.nextInt();
        for(int i=0;i<b;i++){
            result=result*a;
        }
        System.out.println("Sonuc: "+result);
        System.out.println("\n**************************************************************\n");
        UsAl();
    }

    public static void main(String[] args) {
        UsAl();
    }
}
