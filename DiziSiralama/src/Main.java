import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi kac elemanli olsun ? ");
        int n= input.nextInt();
        int array[]= new int[n];
        System.out.println("Dizinin elemanlari random atamak isterseniz 1'e tek tek girmek isterseniz 2'ye basiniz.");
        int select= input.nextInt();
        switch (select){
            case 1: {
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * 100);
                }
                break;
            }
            case 2:
            {
                for(int i=0;i<n;i++){
                    System.out.println(i+". indisi giriniz:");
                    array[i]= input.nextInt();
                }
                break;
            }

        }
        int say=0;
        System.out.println("Diziniz: "+Arrays.toString(array));
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length;j++){
                if(array[i]<array[j] && i!=j){
                    int t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("Sirali diziniz: "+Arrays.toString(array));
    }
}
