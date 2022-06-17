import java.util.Arrays;

public class Main {
    static boolean isFind( int []arr, int value){
        for (int i: arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int sayac=0;
        int dizi[]= new int[20];
        int []cift = new int[20];

        for (int i=0;i< dizi.length;i++){
            dizi[i]= (int)(Math.random()*10);
        }
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j< dizi.length;j++){
                if((i!=j) && (dizi[i]==dizi[j])){
                    if(!isFind(cift,dizi[i])){
                        cift[sayac++]=dizi[i];
                    };
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(dizi));

        for (int value: cift) {
            if ((value!= 0) && (value%2!=1)) {
                System.out.println(value);
            }
        }
    }
}
