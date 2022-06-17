import java.util.Scanner;
import java.util.Arrays;
public class MineSweeper {
    int rowNumber;
    int colNumber;

    public MineSweeper(int rowNumber, int colNumber){
        rowNumber=rowNumber;
        colNumber=colNumber;
        String [][] dizi = new String[rowNumber][colNumber];
        createArea(rowNumber,colNumber);
        createGameArea(rowNumber,colNumber);
    }
    public void createArea(int a, int b){
        Scanner input = new Scanner(System.in);
        this.rowNumber=a;
        this.colNumber=b;

        String [][]area= new String[a][b];

        for(int i=0;i<area.length;i++){
            for(int j=0;j<area[i].length;j++){
                area[i][j]= " - ";
            }

        }
        for(int i=0;i<this.rowNumber;i++){
            for(int j=0;j<this.colNumber;j++){
                System.out.print(" - ");
            }
             System.out.println();
        }

    }
    public void createGameArea(int a , int b){
        System.out.println("\n=====================================================================================================\n");
        a=this.rowNumber;
        b=this.colNumber;
        String [][] game= new String[a][b];
        int mineNumber = this.rowNumber*this.colNumber/4;
        for(int i=0;i<this.rowNumber;i++){
            for(int j=0;j<this.colNumber;j++){
                game[i][j]=  " 0 ";
            }
        }

        for(int k=0; k<mineNumber;k++) {
               if( game[(int)(Math.random()*rowNumber)][(int) (Math.random() * colNumber)]!= " * ")
                  {
                      game[(int)(Math.random()*rowNumber)][(int) (Math.random() * colNumber)]= " * " ;         }
                else{k--;
                   }
        }
        int say=0;
        for(String u[]:game){
            for(String i: u){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}
