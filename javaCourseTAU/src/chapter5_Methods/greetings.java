package chapter5_Methods;

import java.util.Scanner;

/*
OUR FIRST METHOD:
 - Write a method that asks a user for their name.
 - Then it shpuld greet the user by their name.
*/
public class greetings {
    public static void main(String[] args) {
        System.out.println("ENTER YOUR NAME: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hi, " + name + "!!");
    }
}
