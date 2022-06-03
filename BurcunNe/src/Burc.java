import  java.util.Scanner;
public class Burc {
    public static void main (String[] args){
        Scanner girdi = new Scanner (System.in);
        int ay,gun;
        System.out.println("Kacinci ayda dogdunuz ?");
        ay= girdi.nextInt();


        if(ay==1){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>21 && gun<32){
                System.out.println("Kova burcusunuz");
            }
            else if(gun>0 && gun<22){
                System.out.println("Oglak burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }

        }
        if(ay==2){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>19 && gun<29){
                System.out.println("Balik burcusunuz");
            }
            else if(gun>0 && gun<20 ){
                System.out.println("Kova burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==3){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>20 && gun<32){
                System.out.println("Koc burcusunuz");
            }
            else if (gun>0 && gun<21){
                System.out.println("Balik burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==4){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>20 && gun<31){
                System.out.println("Boga burcusunuz");
            }
            else if(gun>0 && gun<21){
                System.out.println("Koc burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==5){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>21 && gun<32){
                System.out.println("Ikizler burcusunuz");
            }
            else if (gun>0 && gun<22){
                System.out.println("Boga burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }

        }
        if(ay==6){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>22 && gun<31){
                System.out.println("Yengec burcusunuz");
            }
            else if (gun>0 && gun< 23){
                System.out.println("ıkizler burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==7){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>22 && gun<32){
                System.out.println("Aslan burcusunuz");
            }
            else if (gun>0 && gun<23){
                System.out.println("Yengec burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==8){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>22 && gun<32){
                System.out.println("Basak burcusunuz");
            }
            else if(gun>0 && gun<23){
                System.out.println("Aslan burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==9){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>22 && gun<31){
                System.out.println("Terazi burcusunuz");
            }
            else if (gun>0 && gun<23){
                System.out.println("Basak burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==10){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>22 && gun<32){
                System.out.println("Akrep burcusunuz");
            }
            else if (gun>0 && gun<23){
                System.out.println("Terazi burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==11){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>21 && gun<31){
                System.out.println("Yay burcusunuz");
            }
            else if(gun>0 && gun<22){
                System.out.println("Akrep burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay==12){
            System.out.println("Ayin kacinda dogdunuz ?");
            gun= girdi.nextInt();
            if(gun>21 && gun<32){
                System.out.println("Oglak burcusunuz");
            }
            else if (gun>0 && gun<22){
                System.out.println("Yay burcusunuz");
            }
            else{
                System.out.println("Yanlis deger girdiniz !");
            }
        }
        if(ay>12 || ay<0){
            System.out.println("Yanlis deger girdiniz !");
        }

    }
}
