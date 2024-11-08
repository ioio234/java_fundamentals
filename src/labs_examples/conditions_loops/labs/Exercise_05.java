package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */
import java.util.Scanner;
public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the Lower Bound :");
        int loBound = scanner.nextInt();

        System.out.println("Insert the Upper Bound: ");
        int upBound = scanner.nextInt();

        float sum = 0;
        float avg = 0;

        for (int count = loBound; count <= upBound; count++ ){
            sum += count;
            avg = sum/upBound;
        }


        System.out.println("The sum is: " + sum);
        System.out.println("The avarage is: " + avg);

    }
}
