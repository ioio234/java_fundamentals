package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
        public static void main(String[] args){
            int[][] mt = new int[3][3];
            int h = 0;

            for (int c = 0; c < mt.length; c++){
                for(int d = 0; d < mt[c].length; d++){
                    mt[c][d] = h;
                    h = h + 1;
                }
            }

           for(int i = mt.length - 1; i >= 0; i--){
               for(int j = mt[i].length - 1; j >= 0; j--){
                   System.out.print(mt[i][j]);
                   System.out.print(" ");
               }
               System.out.println();
           }

        }
}
