import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};


        Arrays.sort(list);
        System.out.println("En kucuge en yakin eleman: "+list[1]);
        System.out.println("En buyuge en yakin eleman: "+list[list.length-2]);

    }
}
