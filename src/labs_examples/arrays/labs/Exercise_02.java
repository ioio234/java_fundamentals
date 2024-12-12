package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */
import java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        for (int i = 0; i < array.length; i++){
            if(array[i] == num){
                System.out.println("number found and it is at index: " + i );
                break;
            }
        }


    }
}