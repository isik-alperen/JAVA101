import java.util.Arrays;


public class Main {
    static int Frequence(int dizi[], int value){
        int sayac=0;
        for(int i: dizi){
            if(i==value){
                sayac++;
            }
        }
        return sayac;
    }


    public static void main(String[] args) {
        int say=0;
        int []array = new int [10];
        int []freq = new int[10];
        for(int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*10);
        }
        System.out.print("Dizi:       ");
        System.out.println(Arrays.toString(array));
        for(int i=0;i< array.length;i++){
            freq[i]= Frequence(array,array[i]);
        }
        System.out.print("Frekanslar: ");
        System.out.println(Arrays.toString(freq));



    }
}
