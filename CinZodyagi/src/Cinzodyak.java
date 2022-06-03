import java.util.Scanner;
public class Cinzodyak {
    public static void main(String[] args) {
        int yil,sec;
        Scanner girdi = new Scanner (System.in);
        System.out.println("Lutfen dogum yilinizi girin>>");
        yil= girdi.nextInt();
        sec= yil%12;

        switch (sec){
            case 0:
                System.out.println("Cin Zodyagi burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyagi burcunuz: Kopek");
                break;
            case 3:
                System.out.println("Cin Zodyagi burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi burcunuz: Fare");
                break;
            case 5:
                System.out.println("Cin Zodyagi burcunuz: Okuz");
                break;
            case 6:
                System.out.println("Cin Zodyagi burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi burcunuz: Tavsan");
                break;
            case 8:
                System.out.println("Cin Zodyagi burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi burcunuz: Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyagi burcunuz: At");
                break;
            case 11:
                System.out.println("Cin Zodyagi burcunuz: Koyun");
                break;

        }

    }
}
