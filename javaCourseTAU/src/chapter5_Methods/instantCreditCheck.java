package chapter5_Methods;

import java.util.Scanner;

import chapter3_ConditionalStatements.SalaryCalculator;

public class instantCreditCheck {
    /*
     * Write an 'Instant Credit Check' program that:
     * - APPROVES anyone who makes MORE THAN $25,000,
     * - and has a CREDIT SCORE of 700 OR BETTER,
     * - and REJECTS ALL OTHERS.
     */
    static double minimumSalaryAmount = 25000;
    static double minimumCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        double creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Enter your Salary amount: ");
        double actualSalary = scanner.nextDouble();
        return actualSalary;
    }

    public static double getCreditScore() {
        System.out.println("Enter your current Credit Score: ");
        double actualCreditScore = scanner.nextDouble();
        return actualCreditScore;
    }

    public static boolean isUserQualified(Double salary, Double creditScore) {
        if (salary >= minimumSalaryAmount && creditScore >= minimumCreditScore) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified)
            System.out.println("Congrats! You have been approved!");
        else
            System.out.println("Sorry. You have been rejected!");
    }
}
