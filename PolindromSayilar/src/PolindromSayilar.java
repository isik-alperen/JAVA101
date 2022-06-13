import java.util.Scanner;
public class PolindromSayilar {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber =0,lastNumber;
        while(temp!=0){

            lastNumber= temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(reverseNumber == number){
            System.out.println("Polindrom sayidir");
        }
        else {
            System.out.println("Polindrom degildir");
        }
        System.out.println(reverseNumber);
        System.out.println(number);
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sayi giriniz>>");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        isPalindrom(a);


    }
}
