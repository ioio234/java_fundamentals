package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main (String[] args){
        int[][] arr2d = new int[2][2];
        int n = 2;

        for(int a = 0; a < arr2d.length; a++){
            for (int b = 0; b < arr2d[a].length; b++){
                arr2d[a][b] = n;
                n = n + 2;
            }
        }

        for (int[] x : arr2d){
            for(int y : x) {

                System.out.print(y);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
