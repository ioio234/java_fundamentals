package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int count = 0; count <= 10; count++){
            System.out.println("This will repeat 2 times!!");
            if (count == 1){
                break;
            }
        }
    }

}
