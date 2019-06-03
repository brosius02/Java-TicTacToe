package Games;


import java.util.ArrayList;
import java.util.Scanner;


public class WinnerLoser {

    public static void xWins(ArrayList<String> location) throws InterruptedException {

        if (location.get(0).equals("X") && location.get(1).equals("X") && location.get(2).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        } else if (location.get(6).equals("X") && location.get(4).equals("X") && location.get(2).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        } else if (location.get(6).equals("X") && location.get(7).equals("X") && location.get(8).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        } else if (location.get(0).equals("X") && location.get(3).equals("X") && location.get(6).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        } else if (location.get(1).equals("X") && location.get(4).equals("X") && location.get(7).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        } else if (location.get(2).equals("X") && location.get(5).equals("X") && location.get(8).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        } else if (location.get(0).equals("X") && location.get(4).equals("X") && location.get(8).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        }else if (location.get(3).equals("X") && location.get(4).equals("X") && location.get(5).equals("X")) {
            System.out.println("X Wins");
            XWINS();
            playAgain();
        }

    }
    public static void oWins(ArrayList <String> location) throws InterruptedException {
        if (location.get(0).equals("O") && location.get(1).equals("O") && location.get(2).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        } else if (location.get(6).equals("O") && location.get(4).equals("O") && location.get(2).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        }else if (location.get(6).equals("O") && location.get(7).equals("O") && location.get(8).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        } else if (location.get(0).equals("O") && location.get(3).equals("O") && location.get(6).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        } else if (location.get(1).equals("O") && location.get(4).equals("O") && location.get(7).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        } else if (location.get(2).equals("O") && location.get(5).equals("O") && location.get(8).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        }else if (location.get(3).equals("O") && location.get(4).equals("O") && location.get(5).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        }else if (location.get(0).equals("O") && location.get(4).equals("O") && location.get(8).equals("O")) {
            System.out.println("O Wins");
            OWINS();
            playAgain();
        }

    }
    public static void playAgain() throws InterruptedException {

        String again;
        Scanner input = new Scanner(System.in);
        Graphics.mainScreen();
        System.out.println("Would you like to play yes or no?");
        again = input.next();
        if(again.equalsIgnoreCase("yes")){
                TicTacToe.playTicTacToe();
                Graphics.mainScreen();
        }
        else {
            System.out.println("Thanks for playing");
            System.exit(0);
        }
    }
    public static void XWINS() throws InterruptedException {
        System.out.println("XX                     XX");
        System.out.println("  XX                 XX");
        System.out.println("    XX             XX");
        System.out.println("      XX         XX");
        System.out.println("        XX     XX");
        System.out.println("          XX XX");
        System.out.println("           XXX");
        System.out.println("          XX XX");
        System.out.println("        XX     XX");
        System.out.println("      XX         XX");
        System.out.println("    XX             XX");
        System.out.println("  XX                 XX");
        System.out.println("XX                     XX");
        Graphics.displayGraphics();
    }
    public static void OWINS() throws InterruptedException {

        System.out.println("OOOOOOOOOOOOOOOOO  ");
        System.out.println("OOOOOOOOOOOOOOOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOO         OOOO  ");
        System.out.println("OOOOOOOOOOOOOOOOO  ");
        System.out.println("OOOOOOOOOOOOOOOOO  ");

        Graphics.displayGraphics();
    }
}
