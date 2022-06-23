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


    }
    public void createGameArea(int a , int b){
        System.out.println("\n=====================================================================================================\n");
        a=this.rowNumber;
        b=this.colNumber;
        int x=this.rowNumber;
        int y=this.colNumber;
        String [][]areaArray= new String[x][y];

        for(int i=0;i<areaArray.length;i++){
            for(int j=0;j< areaArray[i].length;j++){
                areaArray[i][j]= " - ";
            }

        }
        for(int i=0;i<this.rowNumber;i++){
            for(int j=0;j<this.colNumber;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }

        String [][] game= new String[a][b];
        int mineNumber = this.rowNumber*this.colNumber/4;
        for(int i=0;i<this.rowNumber;i++){
            for(int j=0;j<this.colNumber;j++){
                game[i][j]=  " - ";
            }
        }

        for(int k=0; k<mineNumber;k++) {
               if( game[(int)(Math.random()*rowNumber)][(int) (Math.random() * colNumber)]!= " * ")
                  {
                      game[(int)(Math.random()*rowNumber)][(int) (Math.random() * colNumber)]= " * " ;
                  }
                else{
                    k--;
                   }
        }
        int say=0;

        playGame(game,areaArray);


    }
    public void printArea(String arr[][]) {


        for (String u[] : arr) {
            for (String i : u) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("=========================================");
    }
    void playGame (String gameArray[][], String noMine[][]){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Satir degeri giriniz>>");

            int x,y,hold=0;
            x= input.nextInt();
            System.out.println("Sutun degeri giriniz>>");
            y= input.nextInt();

            if(gameArray[x][y]== " * "){
                printArea(gameArray);
                System.out.println("Oyunu Kaybettiniz");
                break;}
            if(x==0){
                if(y==0){
                    if(gameArray[x][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y+1].equals(" * "))
                        hold++;


                switch (hold) {
                    case 0:
                        gameArray[x][y] = " 0 ";
                        noMine[x][y]=" 0 ";
                        break;
                    case 1:
                        gameArray[x][y] = " 1 ";
                        noMine[x][y]=" 1 ";
                        break;
                    case 2:
                        gameArray[x][y] = " 2 ";
                        noMine[x][y]=" 2 ";
                        break;
                    case 3:
                        gameArray[x][y] = " 3 ";
                        noMine[x][y]=" 3 ";
                        break;
                }
            }
                hold=0;

                if((y>0) && (y<this.colNumber-1)){
                    if(gameArray[x+1][y].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y-1].equals(" * "))
                        hold++;
                    if(gameArray[x][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x][y-1].equals(" * "))
                        hold++;


                switch (hold) {
                    case 0:
                        gameArray[x][y] = " 0 ";
                        noMine[x][y]=" 0 ";
                        break;
                    case 1:
                        gameArray[x][y] = " 1 ";
                        noMine[x][y]=" 1 ";
                        break;
                    case 2:
                        gameArray[x][y] = " 2 ";
                        noMine[x][y]=" 2 ";
                        break;
                    case 3:
                        gameArray[x][y] = " 3 ";
                        noMine[x][y]=" 3 ";
                        break;
                    case 4:
                        gameArray[x][y] = " 4 ";
                        noMine[x][y]=" 4 ";
                        break;
                    case 5:
                        gameArray[x][y] = " 5 ";
                        noMine[x][y]=" 5 ";
                        break;
                }
                }
                hold=0;

                if(y==this.colNumber-1) {
                    if (gameArray[x + 1][y].equals(" * "))
                        hold++;
                    if (gameArray[x + 1][y - 1].equals(" * "))
                        hold++;
                    if (gameArray[x][y - 1].equals(" * "))
                        hold++;

                    switch (hold) {
                        case 0:
                            gameArray[x][y] = " 0 ";
                            noMine[x][y]=" 0 ";
                            break;
                        case 1:
                            gameArray[x][y] = " 1 ";
                            noMine[x][y]=" 1 ";
                            break;
                        case 2:
                            gameArray[x][y] = " 2 ";
                            noMine[x][y]=" 2 ";
                            break;
                        case 3:
                            gameArray[x][y] = " 3 ";
                            noMine[x][y]=" 3 ";
                            break;
                    }
                }
                hold=0;



            }

            if((x>0) && (x<this.rowNumber-1)){
                if(y==0) {
                    if (gameArray[x][y + 1].equals(" * "))
                        hold++;
                    if (gameArray[x - 1][y].equals(" * "))
                        hold++;
                    if (gameArray[x - 1][y + 1].equals(" * "))
                        hold++;
                    if (gameArray[x + 1][y].equals(" * "))
                        hold++;
                    if (gameArray[x + 1][y + 1].equals(" * "))
                        hold++;


                    switch (hold) {
                        case 0:
                            gameArray[x][y] = " 0 ";
                            noMine[x][y]=" 0 ";
                            break;
                        case 1:
                            gameArray[x][y] = " 1 ";
                            noMine[x][y]=" 1 ";
                            break;
                        case 2:
                            noMine[x][y]=" 2 ";
                            gameArray[x][y] = " 2 ";
                            break;
                        case 3:
                            noMine[x][y]=" 3 ";
                            gameArray[x][y] = " 3 ";
                            break;
                        case 4:
                            noMine[x][y]=" 4 ";
                            gameArray[x][y] = " 4 ";
                            break;
                        case 5:
                            noMine[x][y]=" 5 ";
                            gameArray[x][y] = " 5 ";
                            break;
                    }
                }
                hold=0;

                if(y>0 && y<this.colNumber-1){
                    if(gameArray[x-1][y].equals(" * "))
                        hold++;
                    if(gameArray[x-1][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x-1][y-1].equals(" * "))
                        hold++;
                    if(gameArray[x][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x][y-1].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y-1].equals(" * "))
                        hold++;


                switch (hold) {
                    case 0:
                        noMine[x][y]=" 0 ";
                        gameArray[x][y] = " 0 ";
                        break;
                    case 1:
                        noMine[x][y]=" 1 ";
                        gameArray[x][y] = " 1 ";
                        break;
                    case 2:
                        noMine[x][y]=" 2 ";
                        gameArray[x][y] = " 2 ";
                        break;
                    case 3:
                        noMine[x][y]=" 3 ";
                        gameArray[x][y] = " 3 ";
                        break;
                    case 4:
                        noMine[x][y]=" 4 ";
                        gameArray[x][y] = " 4 ";
                        break;
                    case 5:
                        noMine[x][y]=" 5 ";
                        gameArray[x][y] = " 5 ";
                        break;
                    case 6:
                        noMine[x][y]=" 6 ";
                        gameArray[x][y] = " 6 ";
                        break;
                    case 7:
                        noMine[x][y]=" 7 ";
                        gameArray[x][y] = " 7 ";
                        break;
                    case 8:
                        noMine[x][y]=" 8 ";
                        gameArray[x][y] = " 8 ";
                        break;

                    }
                }
                hold=0;
                if(y==this.colNumber-1){
                    if(gameArray[x-1][y].equals(" * "))
                        hold++;
                    if(gameArray[x-1][y-1].equals(" * "))
                        hold++;
                    if(gameArray[x][y-1].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y].equals(" * "))
                        hold++;
                    if(gameArray[x+1][y-1].equals(" * "))
                        hold++;


                switch (hold) {
                    case 0:
                        noMine[x][y]=" 0 ";
                        gameArray[x][y] = " 0 ";
                        break;
                    case 1:
                        noMine[x][y]=" 1 ";
                        gameArray[x][y] = " 1 ";
                        break;
                    case 2:
                        noMine[x][y]=" 2 ";
                        gameArray[x][y] = " 2 ";
                        break;
                    case 3:
                        noMine[x][y]=" 3 ";
                        gameArray[x][y] = " 3 ";
                        break;
                    case 4:
                        noMine[x][y]=" 4 ";
                        gameArray[x][y] = " 4 ";
                        break;
                    case 5:
                        noMine[x][y]=" 5 ";
                        gameArray[x][y] = " 5 ";
                        break;
                }
                }
                hold=0;

            }
            if(x== this.rowNumber-1){
                if(y==0){
                    if(gameArray[x][y+1].equals(" * "))
                        hold++;
                    if(gameArray[x-1][y].equals(" * "))
                        hold++;
                    if(gameArray[x-1][y+1].equals(" * "))
                        hold++;


                switch (hold) {
                    case 0:
                        noMine[x][y]=" 0 ";
                        gameArray[x][y] = " 0 ";
                        break;
                    case 1:
                        noMine[x][y]=" 1 ";
                        gameArray[x][y] = " 1 ";
                        break;
                    case 2:
                        noMine[x][y]=" 2 ";
                        gameArray[x][y] = " 2 ";
                        break;
                    case 3:
                        noMine[x][y]=" 3 ";
                        gameArray[x][y] = " 3 ";
                        break;
                    }
                }
                hold=0;

                if(y>0 && y<this.colNumber-1) {
                    if (gameArray[x - 1][y].equals(" * "))
                        hold++;
                    if (gameArray[x - 1][y + 1].equals(" * "))
                        hold++;
                    if (gameArray[x - 1][y - 1].equals(" * "))
                        hold++;
                    if (gameArray[x][y + 1].equals(" * "))
                        hold++;
                    if (gameArray[x][y - 1].equals(" * "))
                        hold++;


                    switch (hold) {
                        case 0:
                            noMine[x][y]=" 0 ";
                            gameArray[x][y] = " 0 ";
                            break;
                        case 1:
                            noMine[x][y]=" 1 ";
                            gameArray[x][y] = " 1 ";
                            break;
                        case 2:
                            noMine[x][y]=" 2 ";
                            gameArray[x][y] = " 2 ";
                            break;
                        case 3:
                            noMine[x][y]=" 3 ";
                            gameArray[x][y] = " 3 ";
                            break;
                        case 4:
                            noMine[x][y]=" 4 ";
                            gameArray[x][y] = " 4 ";
                            break;
                        case 5:
                            noMine[x][y]=" 5 ";
                            gameArray[x][y] = " 5 ";
                            break;

                    }
                }
                hold=0;

                if(y==this.colNumber-1) {
                    if (gameArray[x - 1][y].equals(" * "))
                        hold++;
                    if (gameArray[x - 1][y - 1].equals(" * "))
                        hold++;
                    if (gameArray[x][y - 1].equals(" * "))
                        hold++;

                    switch (hold) {
                        case 0:
                            noMine[x][y]=" 0 ";
                            gameArray[x][y] = " 0 ";
                            break;
                        case 1:
                            noMine[x][y]=" 1 ";
                            gameArray[x][y] = " 1 ";
                            break;
                        case 2:
                            noMine[x][y]=" 2 ";
                            gameArray[x][y] = " 2 ";
                            break;
                        case 3:
                            noMine[x][y]=" 3 ";
                            gameArray[x][y] = " 3 ";
                            break;
                    }
                }
                hold=0;

            }
            int end=0;
            for(int i=0;i<gameArray.length;i++){
                for(int j=0;j<gameArray[i].length;j++){
                    if(gameArray[i][j].equals(" - ")){
                        end++;
                    }
                }

            }
            if(end==0){
                System.out.println("============================================");
                printArea(gameArray);
                System.out.println("Tebrikler kazandiniz");
                break;
            }

            printArea(noMine);

        }






    }
}

