import java.util.Arrays;
public class deneme {
    public static void main(String[] args) {

        int[][] matrix  = { {1,2,3,4},{7,8,9,10},{5,6,7,8}};
        for(int i[]: matrix){
            for( int a: i){
                System.out.print(a+" " );
            }
            System.out.println();
        }



    }
}