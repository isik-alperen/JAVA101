import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int i,j,l,k;
        System.out.println("Sayi giriniz");
        l= input.nextInt();
        for(i=0;i<l;i++) {
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for (k = 0; k <= (l-2*i+1); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
