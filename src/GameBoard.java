/**
 * Created by Home on 11.04.2017.
 */
class GameBoard {
    private static int FIELDSIZE = 3;
    private int currentRow;
    private int currentColumn;
    private int[][] grid = new int[FIELDSIZE][FIELDSIZE];
    private int currentPlayer = 2; //1=x;2=O
    private int movecounter = 0;

    GameBoard() {
    }

    void move(int x, int y){

        if(grid[x][y] != 0){
            System.out.println("invalid move");
            return;
        }
        currentColumn = y;
        currentRow = x;
        grid[x][y] = currentPlayer;
        movecounter++;
        drawBoard();
    }

    int findWinner(){
        if(movecounter >= FIELDSIZE*FIELDSIZE) return 3;
        else if(checkRow() || checkColumn() || checkDiagonal() || checkAntidiagonal()) return currentPlayer;
        else return 0;
    }

    void swapPlayer(){
        if(currentPlayer == 1) currentPlayer = 2;
        else currentPlayer = 1;
    }

    private boolean checkRow() {
        for (int i = 0; i < FIELDSIZE; i++) {
            if (grid[currentRow][i] != currentPlayer) return false;
        }
        return true;
    }

    private boolean checkColumn() {
        for (int i = 0; i < FIELDSIZE; i++) {
            if (grid[i][currentColumn] != currentPlayer) return false;
        }
        return true;
    }

    private boolean checkDiagonal(){
        for(int i = 0; i < FIELDSIZE; i++){
            if(grid[i][i] != currentPlayer) return false;
        }
        return true;
    }

    private boolean checkAntidiagonal(){
        for(int i = 0; i < FIELDSIZE; i++){
            if(grid[FIELDSIZE-i-1][i] != currentPlayer) return false;
        }
        return true;
    }

    private void drawBoard(){
        for(int i = 0; i < FIELDSIZE; i++){
            for(int j = 0; j < FIELDSIZE; j++) {
                drawCell(grid[i][j]);
                if (j >= 2) System.out.println();
                if (j < 2) System.out.print(" | ");

            }
            if(i < FIELDSIZE-1)System.out.println("----------");
        }
    }

    private void drawCell(int x){
        char c;
        if(x == 1) c='X';
        else if(x == 2) c='O';
        else c=' ';
        System.out.print(c);
    }
}
