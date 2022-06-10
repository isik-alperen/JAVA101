import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz>> ");
        int a= input.nextInt();
        int i,j,total=0;
        int a1=0,a2=1;
        for(i=0;i<a;i++){
            System.out.print(total+" ");
            total=a1+a2;
            a1=a2;
            a2=total;
        }

    }
}
