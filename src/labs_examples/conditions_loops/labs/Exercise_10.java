package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

      for (int count = 0; count <= 10; count++){
          if (count == 0){
              continue;
          }
          System.out.println(count);
      }



    }
}
