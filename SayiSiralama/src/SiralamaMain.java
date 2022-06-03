import java.util.Scanner;
public class SiralamaMain {
    public static void main(String[] args) {

        int a,b,c;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz>>");
        a=girdi.nextInt();
        System.out.println("Ikinci sayiyi giriniz>>");
        b=girdi.nextInt();
        System.out.println("Ucuncu sayiyi giriniz>>");
        c= girdi.nextInt();

        if(a<b && a<c){
            if (b<c)
            {
                System.out.println( a +" < " + b +" < "+ c );
            }
            else {
                System.out.println(a+ "<" +c+ "<"+b);
            }
        }
        else if (b<a && b<c){
            if(a<c){
                System.out.println(b+ "<" +a+"<" +c);
            }
            else {
                System.out.println(b+"<"+c+"<"+a);
            }
        }
        else if(c<b && c<a){
            if(b<a){
                System.out.println(c+"<"+b+"<"+a);
            }
            else{
                System.out.println(c+"<"+a+"<"+b);
            }
        }

    }
}
