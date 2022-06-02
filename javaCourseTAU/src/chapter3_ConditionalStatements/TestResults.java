package chapter3_ConditionalStatements;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        /*
         * Test grade calculator
         */

        // Get Test Score
        System.out.println("What is your test score? :");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();
        scanner.close();

        // Determine Grade
        char grade;

        if (testScore < 60)
            grade = 'F';
        else if (testScore < 70)
            grade = 'D';
        else if (testScore < 80)
            grade = 'C';
        else if (testScore < 90)
            grade = 'B';
        else
            grade = 'A';

        System.out.println("Your Grade is: " + grade);
    }
}