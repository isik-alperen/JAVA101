import java.util.Scanner;
public class Girilen {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int i = 1, j=0, k;
        float top=0,ort;
        System.out.println("Bir sayi giriniz>>");
        k = girdi.nextInt();

        while (i <= k) {
            if (i % 3 == 0 && i % 4 == 0) {
                    top=top+i;
                    j++;
            }
                i++;
            }
            ort=top/j;
            System.out.println("3'e ve 4'e tam bolunen sayilarin ortalamasi: " +ort);

        }

    }

