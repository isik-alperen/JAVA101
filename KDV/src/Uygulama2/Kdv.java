package Uygulama2;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        double fiyat,kdv,kdvsiz;
        Scanner girdi =new Scanner(System.in);
        System.out.print("Fiyati giriniz >>>\n");
        fiyat= girdi.nextDouble();

        if(fiyat >1000){
            kdv=fiyat*8/100;
        }
        else {
            kdv=fiyat*18/100;
        }
        kdvsiz=fiyat-kdv;

        System.out.println("\nKdv'li fiyat:  " +fiyat);
        System.out.println("\nKdv'siz fiyat: "+kdvsiz);
        System.out.println("\nKdv = "+kdv);22
    }
}

