/**
 * Created by Home on 11.04.2017.
 */
public class GameBoard {
    private Field[][] grid = new Field[3][3];
    int turn;
    

    public int checkForWinner(){
        for (int i = 0; i < 3; i++) {
            if(grid[1][i] == grid[2][i] && grid[2][i] == grid[3][i] && grid[3][i] != 0) return grid[3][i];
            if(grid[i][1] == grid[i][2] && grid[i][2] == grid[i][3] && grid[i][3] != 0) return grid[i][3];
        }
        if(grid[1][1] == grid[2][2] && grid[2][2] == grid[3][3] && grid[3][3] != 0) return grid[3][3];
        if(grid[3][1] == grid[2][2] && grid[2][2] == grid[1][3] && grid[1][3] != 0) return grid[1][3];
        if (turn >= 9) return 3;
        return 0;
    }

}
