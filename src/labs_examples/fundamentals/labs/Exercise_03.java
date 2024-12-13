package labs_examples.fundamentals.labs;

import videos_source_code.classes.Person;

/**
 * Fundamentals Exercise 3: My First Program
 *      Write the necessary code to display the follow message to the console
 *      Hello World!
 *      Check out my first program!
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Person2 firstPerson = new Person2("oie", 12);

        System.out.println("Hello World!");
        System.out.println("Check out my first program!");

        System.out.println(firstPerson.toString());

    }

}
