package chapter3;

/*
    IF Statement:
    All Salespeople get a payment of $1000 a week.
    Those who exceed 10 sales get a bonus $250.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        //1. Initialize the known values
        int salary = 1000;
        int bonus = 250;

        //2. Get unknown values
        System.out.println("How many sales??");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //3. if statement for bonus
        if(sales > 10){
            salary = salary + bonus;
        }

        //4. Calculate output
        System.out.println("The pay this week is: $" + salary);

    }
}
