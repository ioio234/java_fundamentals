package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7: ");

        int number = scanner.nextInt();

        if ((number < 1) || (number > 7)){
            System.out.println("This number is beyond what was asked");
        }else if (number == 1){
            System.out.println("Monday");
        }else if (number == 2){
            System.out.println("Tuesday");
        }else if (number == 3){
            System.out.println("Wednesday");
        }else {
            System.out.println("Imagine");
        }
    }
}
