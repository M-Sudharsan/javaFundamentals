package chapter3_ConditionalStatements;

import java.util.Scanner;

public class ChangeDollarGame {
    public static void main(String[] args) {

        /*
         * The objective of the game is to enter enough change to equal exactly 1$.
         * - Create a program that asks the user to enter the qualtities for the
         * following coins: Pennies, Nickels, Dimes, and Quarters.
         * - The program should count up to the value of all the change
         * If it's exactly $1, they win!
         * If it's more than $1, tell them by how much they went over.
         * If it's less than $1, tell them by how much they went under.
         * - Feel free to change the game to your country's currency.
         */

        double penny = 0.001;
        double nickel = 0.005;
        double dime = 0.1;
        double quarter = 0.25;
        double dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies do u wanna play? :");
        double pennyCoins = scanner.nextDouble();
        double total = pennyCoins * penny;
        System.out.println("How many nickels do u wanna play? :");
        double nickelCoins = scanner.nextDouble();
        total = total + nickelCoins * nickel;
        System.out.println("How many dimes do u wanna play? :");
        double dimeCoins = scanner.nextDouble();
        total = total + dimeCoins * dime;
        System.out.println("How many quarters do u wanna play? :");
        double quarterCoins = scanner.nextDouble();
        total = total + quarterCoins * quarter;
        scanner.close();

        if (total == dollar) {
            System.out.println("Congrats!! You won!! You are right on spot!!");
        } else if (total >= dollar) {
            System.out.println("Oops! You Lost! You are over by " + (total - dollar) + "$");
        } else if (total <= dollar) {
            System.out.println("Oops! You Lost! You are under by " + (dollar - total) + "$");
        }
    }
}