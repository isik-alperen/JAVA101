import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int i,number,total=0;
        while(true) {
            System.out.println("Sayi giriniz: ");
            number = girdi.nextInt();
            for(i=1;i<number;i++){
                if(number%i==0){
                    total=total+i;
                }
            }
            if(total==number){
                System.out.println("Girdiginiz sayi mukemmel sayidir\n");
            }
            else {
                System.out.println("Girdiniz sayi mukemmel sayi degildir\n");
            }

        }
    }

}
