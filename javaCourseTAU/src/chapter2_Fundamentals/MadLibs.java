package chapter2_Fundamentals;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        /*
         * Create a program that asks the user for a season of the year, then a whole
         * number, then an adjective. Use the input to complete the sentence below and
         * output the result:
         * 
         * "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cops of coffee."
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year :\t");
        String season = scanner.next();

        System.out.println("Enter a whole number :\t");
        int wholeNumber = scanner.nextInt();

        System.out.println("Enter an adjective :\t");
        String adjective = scanner.next();
        scanner.close();

        System.out.println(
                "On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee.");
    }
}
