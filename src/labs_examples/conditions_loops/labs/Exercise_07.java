package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

import java.util.Scanner;



public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a word: ");
        String word = scanner.next();

        int count = 0;

        while(count <= word.length() - 1){
            if (word.charAt(count) == 'a' || word.charAt(count) == 'e' || word.charAt(count) == 'i' || word.charAt(count) == 'o' || word.charAt(count) == 'u'){
                System.out.println("found the first vowel at index: " + count);
                System.out.println("The vowel is: " + word.charAt(count));
                break;
            }
            count++;
        }

    }
}
