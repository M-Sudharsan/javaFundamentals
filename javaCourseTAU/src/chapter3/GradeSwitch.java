package chapter3;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        /*
         * Have a user enter their grade, and using a switch statement,
         * print out a message letting themknow how they did.
         */

        System.out.println("What is your grade? :");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;

        switch (grade) {
            case "A":
            case "a":
                message = "Excellent Job!!";
                break;
            case "B":
            case "b":
                message = "Great job!";
                break;
            case "C":
            case "c":
                message = "Good job!";
                break;
            case "D":
            case "d":
                message = "Need to work a bit harder, Mate!";
                break;
            case "E":
            case "e":
                message = "You need to work a lot harder, Mate!";
                break;
            case "F":
            case "f":
                message = "Uh Oh! You Flunked the Exam!";
                break;
            default:
                message = "Error: Invalid Grade!";
                break;
        }
        System.out.println(message);
    }
}
