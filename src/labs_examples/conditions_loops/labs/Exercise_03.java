package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */
import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number from 1 to 12: ");

        int number = scanner.nextInt();

        while(number < 1 || number > 12){
            System.out.println("Enter a valid number");
            number = scanner.nextInt();
        }

        switch(number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
            default:
                System.out.println("April");
            //and so on
        }

    }

}
