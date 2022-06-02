package chapter4_Loops;

import java.util.Random;

public class Chapter4Assignment {
    /*
     * The objective of this game is to travel the entire game board of 20 paces
     * within 5 die rolls.
     * - Roll the die for the user (GTenerate a random number between 1 - 6)
     * - Advance the user that number of paces on the game goard.
     * - After each roll, inform the user which game space they are on, and how many
     * more spaces they have left to go to win.
     * - Repeat this 4 additional times for a total of 5 rolls.
     * - If the user gets a 20 before 5 rolls, end the game --> they win
     * - If they are less or more than 20 paces exactly, they lose.
     * There are only 20 paces on the board. So a message like
     * "You advanced to space 22" is a bug.
     */

    public static void main(String[] args) {
        int steps = 20;
        int moved = 0;
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int roll = random.nextInt(6) + 1;
            steps = steps - roll;
            moved = moved + roll;
            // if (steps > 0 || steps == 0) {
            // System.out.println(
            // "Roll #" + i
            // + ": You've rolled a " + roll
            // + ". You are now on space " + moved
            // + " and have "
            // + steps + " more to go!");

            // } else if (steps < 0) {
            // System.out.println("You Loose");
            // }

            /*
             * pass
             * moved = 20 && (i <= 4)
             * fail
             */

            if (moved < 20 && i <= 4) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + roll + ". You are now on space " + moved
                        + " and have " + steps + " more to go!");
            }

            if (moved == 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + roll + ". You're on space " + moved
                        + ". Congrats, you win!");
                break;
            } else if (moved > 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + roll + ". You're on space " + moved
                        + ". Tough Luck, you loose!");
                break;
            } else if (moved < 20 && i == 4) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + roll + ". You're on space " + moved
                        + ". Tough Luck, you loose!");
            }
        }
    }
}