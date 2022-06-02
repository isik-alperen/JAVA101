import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;
        int sayac=5,top=0;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Matematik dersi notunu giriniz>>");
        mat=girdi.nextInt();
        if(mat>100 || mat <0){
            sayac--;

        }
        else{
            top=top+mat;
        }
        System.out.println("Fizik dersi notunu giriniz>>");
        fiz=girdi.nextInt();
        if(fiz>100 || fiz <0){
            sayac--;

        }
        else{
            top=top+fiz;
        }
        System.out.println("Turkce dersi notunu giriniz>>");
        tur=girdi.nextInt();
        if(tur>100 || tur <0){
            sayac--;

        }
        else{
            top=top+tur;
        }
        System.out.println("Kimya dersi notunu giriniz>>");
        kim=girdi.nextInt();
        if(kim>100 || kim <0){
            sayac--;

        }
        else{
            top=top+kim;
        }
        System.out.println("Muzik dersi notunu giriniz>>");
        muz=girdi.nextInt();
        if(muz>100 || muz <0){
            sayac--;

        }
        else{
            top=top+muz;
        }

        double ort;
        ort=top/sayac;
        if(ort>=55){
            System.out.print("Ortalamaniz: "+ort);
            System.out.println("--> sinifi gectiniz..");
        }
        else{
            System.out.print("Ortalamaniz: "+ort);
            System.out.println(" -->sinif tekrari ..!!");
        }

    }
}
