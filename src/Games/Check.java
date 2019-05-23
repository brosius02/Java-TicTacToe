package Games;

import java.util.Scanner;

public class Check {


    public static void checkNumbers(int[] recorder, int set){
        Scanner input = new Scanner(System.in);
        while()
        for(int i = 0; i<recorder.length; i++){
            if(set != recorder[i]){
                System.out.println("Enter a new number that one was taken.");
                set = input.nextInt();
            }

        }
        
    }

}
