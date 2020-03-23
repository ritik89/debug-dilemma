import java.util.HashMap;
import java.util.Map;

public class NestedHashMap {

    public static void foo(){

        //Let's say there are 3 balls of 2 possible color, maintaining presence/absence of each ball in three bags by
        //say colors also represented by 1,2... and so on

        Map<Integer, Map<Integer, Boolean>> bag1  = new HashMap<>();
        Map<Integer, Map<Integer, Boolean>> bag2 = new HashMap<>();
        Map<Integer, Map<Integer, Boolean>> bag3 = new HashMap<>();

        //initilize these hashmaps
        for(int i = 1 ; i<= 3; i++){
            Map<Integer, Boolean> balls = new HashMap<>();
            for(int j = 1 ; j < 10; j++){
                //for balls each color ball set to be false i.e absent
                balls.put(1,false);
            }
            bag1.put(i,balls);
            bag3.put(i,balls);
            bag2.put(i,balls);
        }

        //marking ball color 1 in bag 1 to be true
        bag1.get(1).put(1,true);

        //sets it across the bags like this prints true
        System.out.println(bag2.get(1));
        
        //Reason - every bag has balls map object same  in initialization, causing the issue
        //one of the reason initializing the hashmap is a bad idea
    }

    //Driver function to call isValidSudokuState method for a sudoku board
    public static void main(String[] args) {
        foo();
    }

}
