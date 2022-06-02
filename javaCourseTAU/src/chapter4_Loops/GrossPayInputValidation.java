package chapter4_Loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        /*
         * While Loop:
         * 
         * Each store employee makes $15 an hour. Write a program that allows the
         * employee to enter the number of hours worked for the week. Do not allow
         * overtime.
         */

        int rate = 15;
        int maxHours = 40;
        int minHours = 1;

        System.out.println("How many hours did u work this week? :");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < minHours) {
            System.out.println("Invalid Input: Enter a value between 1 - 40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        // Calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay is: $" + gross);
    }
}
