/**
 * Created by Home on 11.04.2017.
 */
import java.util.Scanner;

public class Gameplay {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        GameBoard myGameBoard = new GameBoard();

        do {
            myGameBoard.swapPlayer();
            System.out.println("Enter X then Y");
            myGameBoard.move(scn.nextInt() , scn.nextInt());
        }
        while (myGameBoard.findWinner()==0);

        System.out.printf("Winner : %d",myGameBoard.findWinner());
    }
}
