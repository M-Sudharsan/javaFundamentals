package chapter3_ConditionalStatements;

import java.util.Scanner;

public class QuotaCalculator {
    /*
     * If 10 sales are met, give congratulatory message. Else give info on remaining
     * quota
     */

    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How may sales this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= 10)
            System.out.println("Congrats!! You made the cut this week!!");

        else {
            int balance = quota - sales;
            System.out.println("You have a balance of " + balance + " sales this week!! Work harder!!");
        }

    }
}
