package chapter4;

import java.util.Scanner;

/*
DO WHILE LOOP:
 - Write a program to allow a user to enter two numbers.
 - And then sum up the two numbers.
 - The user should be able to repeat this action until they indicate that they are done.
*/
public class AddNumbersContinuous {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        boolean repeat;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the first number: ");
            firstNumber = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println("The sum of both numbers is: " + sum);

            System.out.println("Do you want to continue? [true/false]: ");
            repeat = scanner.nextBoolean();
        } while (repeat);
        scanner.close();
    }

}
