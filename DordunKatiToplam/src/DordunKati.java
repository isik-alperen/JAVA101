import java.util.Scanner;

public class DordunKati {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int i,top=0;

        do{
            System.out.println("Sayi giriniz: ");
            i= girdi.nextInt();
            if(i%4==0)
            {
                top=i+top;
            }
        }while(i%2==0);
        System.out.println("Toplam : "+top);
    }
}