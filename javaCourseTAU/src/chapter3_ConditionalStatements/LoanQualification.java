package chapter3_ConditionalStatements;

import java.util.Scanner;

public class LoanQualification {
    /*
     * To qualify for a loan, a person must:
     * - make atleast $30000
     * - working at their current job for atleast 2 years
     */
    public static void main(String[] args) {

        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("What is your current salary? :");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you been working in the current organization? :");
        double workingYears = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary) {
            if (workingYears >= requiredYears)
                System.out.println("Congrats!! You are eligible for the loan!");
            else
                System.out.println("Sorry!! You must have worked for atleast "
                        + requiredYears
                        + " years at your current organization!!");
        } else {
            System.out.println("Sorry!! You must have atleast "
                    + requiredSalary + "$"
                    + " to qualify for the loan!!");
        }
    }
}
