import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String [][] letter = new String[9][5];
        int i,k;
        for(i=0;i<letter.length; i++){
            for(int j=0;j< letter[i].length;j++){
                letter[i][j]="    ";
                if(i==0 || i==4 || i==8){
                    letter[i][j]=" * ";
                }

                System.out.println("\n");
            }
            for(k=0;k< letter[i].length;k++){
                if(k==0){
                    letter[i][k]=" * ";
                }

            }

        }
        for(i=1;i< letter.length/2;i++){

                letter[i][4]=" * ";

        }
        for(i=letter.length/2;i<letter.length;i++){

            letter[i][4]=" * ";
            for(k=1;k<4;k++);

        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
