import Games.Graphics;
import Games.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        boolean play =true;
        String again;
        Scanner input = new Scanner(System.in);
        Graphics.mainScreen();
        while(play){
            TicTacToe.playTicTacToe();
            Graphics.mainScreen();
            System.out.println("Would you like to play again yes or no?");
            again = input.next();
            if(again.equalsIgnoreCase("no")){
                play = false;
            }
        }
        System.out.println("Thanks for playing");
    }
}
