package Games;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static boolean quit;

    public static void playTicTacToe() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int set = 0;
        quit = true;
        boolean sameNumber = true;
        int count = 0;
        Random rand = new Random();
        ArrayList <String> location = new ArrayList <>();//This populates to the board and displays
        //where you have placed your markers
        ArrayList<Integer> recorder1 = new ArrayList <>();
        int[] recorder = new int[9];//records locations of moves for computer and human player
        Board.populateArraySizeToString(location);//Calls and populates the array size
        Board.displayPlayingBoard(location);//displays playing board
        while (quit) {
            System.out.println("\nWelcome to Tic Tac Toe enter a number from the grid to start");
            //X goes first
            if(count % 2 == 0){//remainder it is O's turn no remainder X's turn
                set = input.nextInt();
                Check.checkNumbers(recorder, set);
                recorder[count] = set;//records locations for AI

//Enter the Check Class here to see if the option the user selected is already taken.
                location.set(set, "X");
            }
            else if(set == 999){
                quit = false;
            }
            //O goes next if 'count' has a remainder
            else{
                int i = 0;
                while(sameNumber){
                    int r = rand.nextInt(8);
                    if(recorder[i] == r){
                        i = i + 1;
                        System.out.println("Print recorder " + recorder[i]+ " print random " + r);
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
            new Main();
            if(count == 9){
                System.out.println("\nTie\n");
                quit = false;
            }
        }
        Board.displayPlayingBoard(location);
    }
}
