import java.util.Scanner;
public class Desen {
    static void add(int n, int m, int k ){
        int t;
        t=n;
        if(n>0 && n<=t ){
            System.out.print(n+",");
            n=n-5;
            m=n;
            add(n,m,k);
        }
        else if(n<=0){
            System.out.print(m+",");
            m=m+5;
            if(m == k){
                System.out.println(k);
            }
            else {
                add(n,m,k);
            }

        }


    }
    public static void main(String[] args) {
        System.out.println("N sayisini giriniz >>");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        add (n,n,n);
    }
}
