package chapter4_Loops;

import java.util.Scanner;

/*
Write a cashier program which scans the given number of items and tally the cost.

*/
public class Cashier {
    public static void main(String[] args) {
        int quantity;
        double total = 0;

        System.out.println("Enter the number of items you want to tally: ");
        Scanner scanner = new Scanner(System.in);
        quantity = scanner.nextInt();

        for (int iter = 0; iter < quantity; iter++) {
            System.out.println("Enter the cost of item: ");
            total += scanner.nextDouble();
        }
        scanner.close();

        System.out.println("Your total is: $" + total);
    }
}
