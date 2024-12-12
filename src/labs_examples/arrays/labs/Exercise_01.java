package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */
import java.util.Scanner;


public class Exercise_01 {

    public static void main(String[] args){

        System.out.print("Insert 10 numbers:");
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        sc.close();
        System.out.println("Your numbers are: ");

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        float media = (float) sum / nums.length;

        System.out.println(sum);
        System.out.println(media);


    }
}