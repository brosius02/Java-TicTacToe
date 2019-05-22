package Games;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static boolean quit;

    public static void playTicTacToe() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int set;
        quit = true;
        boolean sameNumber = true;
        int count = 0;
        Random rand = new Random();
        ArrayList <String> location = new ArrayList <>();//This populates to the board and displays
        //where you have placed your markers
        int[] recorder = new int[9];//records locations of moves for computer and human player
        Board.populateArraySizeToString(location);//Calls and populates the array size
        Board.displayPlayingBoard(location);//displays playing board
        while (quit) {
            System.out.println("\nWelcome to Tic Tac Toe enter a number from the grid to start");
            //X goes first
            if(count % 2 == 0){//remainder it is O's turn no remainder X's turn
                set = input.nextInt();
                recorder[count] = set;//records locations for AI
                location.set(set, "X");
            }
            //O goes next if 'count' has a remainder
            else{
                int i = 0;
                while(sameNumber){
                    int r = rand.nextInt(8);
                    if(recorder[i] == r){
                        i = i + 1;
                    }
                    else{
                        recorder[count] = r;//records locations for AI
                        location.set(r, "O");
                        sameNumber = false;
                        Graphics.displayGraphics();
                        Board.displayPlayingBoard(location);
                    }
                }
            }
            //Call the board showing the new locations
            WinnerLoser.xWins(location);
            WinnerLoser.oWins(location);
            count++;
            sameNumber = true;
            if(count == 9){
                System.out.println("\nTie\n");
                quit = false;
            }
        }
        Board.displayPlayingBoard(location);
    }
}
