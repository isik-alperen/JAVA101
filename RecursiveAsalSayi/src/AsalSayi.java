import java.util.Scanner;
public class AsalSayi {
    static void Asal(){
        Scanner input = new Scanner (System.in);
        System.out.println("Sayi giriniz >>");
        int a= input.nextInt(),say=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                say++;
            }
        }
        if(say==2){
            System.out.println(a+" asal bir sayidir.");
        }
        else {
            System.out.println(a+" asal bir sayi degildir.");
        }
        System.out.println("\n****************************************************\n");
        Asal();
    }

    public static void main(String[] args) {
        Asal();
    }
}
