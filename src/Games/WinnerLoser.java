package Games;

import java.util.ArrayList;

public class WinnerLoser {
    private static boolean quit = true;
    public static void xWins(ArrayList<String> location) {
        if (location.get(0).equals("X") && location.get(1).equals("X") && location.get(2).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        } else if (location.get(6).equals("X") && location.get(4).equals("X") && location.get(2).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        } else if (location.get(6).equals("X") && location.get(7).equals("X") && location.get(8).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        } else if (location.get(0).equals("X") && location.get(3).equals("X") && location.get(6).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        } else if (location.get(1).equals("X") && location.get(4).equals("X") && location.get(7).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        } else if (location.get(2).equals("X") && location.get(5).equals("X") && location.get(8).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        }
        else if (location.get(0).equals("X") && location.get(4).equals("X") && location.get(8).equals("X")) {
            System.out.println("\nX Wins");
            quit = false;
        }
    }
    public static void oWins(ArrayList <String> location) {
        if (location.get(0).equals("O") && location.get(1).equals("O") && location.get(2).equals("O")) {
            System.out.println("\nO Wins");
            quit = false;
        } else if (location.get(6).equals("O") && location.get(4).equals("O") && location.get(2).equals("O")) {
            System.out.println("\nO Wins");
            quit = false;
        }else if (location.get(6).equals("O") && location.get(7).equals("O") && location.get(8).equals("O")) {
            System.out.println("\nO Wins");
            quit = false;
        } else if (location.get(0).equals("O") && location.get(3).equals("O") && location.get(6).equals("O")) {
            System.out.println("\nO Wins");
            quit = false;
        } else if (location.get(1).equals("O") && location.get(4).equals("O") && location.get(7).equals("O")) {
            System.out.println("\nO Wins");
            quit = false;
        } else if (location.get(2).equals("O") && location.get(5).equals("O") && location.get(8).equals("O")) {
            System.out.println("\nO Wins");
            quit = false;
        }
    }
}
