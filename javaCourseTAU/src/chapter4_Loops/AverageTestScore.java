package chapter4_Loops;

import java.util.Scanner;

public class AverageTestScore {
    /*
     * - Find the Average Test Score for each student in the class.
     * - There are 24 students and 4 tests.
     */

    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;

            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter your score for Test#" + (j + 1));
                double score = scanner.nextDouble();
                total += score;
            }
            double average = total / numberOfTests;
            System.out.println("The average score of Student #" + (i + 1) + " is: " + average);
        }

        scanner.close();
    }
}
