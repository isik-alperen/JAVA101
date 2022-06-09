import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        int n,i,j,l,k=0;
        System.out.println("Sayi giriniz: ");
        n = girdi.nextInt();

    for(i=0;i<n;i++){
        for(j=1;j<(n-i);j++){
            System.out.print(" ");
        }
        for(l=1;l<=(2*i+1);l++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    for(i=n;i>0;i--){
        for(j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(l=2*i-1;l>=1;l--){
            System.out.print("*");
        }
        System.out.println(" ");
    }


    }
}
