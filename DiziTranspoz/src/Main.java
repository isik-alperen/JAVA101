import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l,c;
        System.out.println("Satir degeri giriniz: ");
        l= input.nextInt();
        System.out.println("Sutun degeri giriniz: ");
        c= input.nextInt();
        int [][]array= new int[l][c];
        int [][]tarray= new int[c][l];
        for(int i=0; i< array.length;i++){
            for(int j=0;j< array[i].length;j++){
                array[i][j]=(int)(Math.random()*20);
            }

        }
        System.out.println("Dizi:");
        for(int[] a: array){
            for(int i:a){
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
        System.out.println();

        for(int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++){
                tarray[j][i]=array[i][j];
            }
        }
        System.out.println("Transpoz:");
        for(int[] a: tarray){
            for(int i:a){
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
    }
}