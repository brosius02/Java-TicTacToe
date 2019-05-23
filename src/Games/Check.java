package Games;

public class Check {
    private static boolean again;


    public static void checkNumbers(int[] recorder, int set){

        for(int i = 0; i<recorder.length; i++){
            if(set == recorder[i]){
                System.out.println("Enter a new number that one was taken.");
                again = true;
                redo(again);
            }

        }
        
    }

    public static boolean redo(boolean again) {
        if (again == true){
            again = true;

        }
        return again;
    }
}
