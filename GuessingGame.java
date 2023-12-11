/* Name: Raven Daigle
 * Course: ITSE 2317
 * Date: September 15, 2023
 * Description: Game for user to guess random number
 */

import java.util.*;

public class GuessingGame 
{
    public static void main(String[] args)
    {
        // Create scanner to get user input
        Scanner scanner = new Scanner (System.in);

        // Create random number object
        Random rand = new Random();

        // Greet the user and get input
        System.out.println("Let's play a guessing game!");

        // Assign random numbers and user choice
        int randInt = rand.nextInt(100) + 1;
        int userChoice = 0;
        
        // Loop until correct answer
        while (userChoice != randInt) 
        {
            // Take user input
            Boolean invalidInput = true;
            while (invalidInput)
            { 
                System.out.print("Guess the number I am thinking of between 1 and 100: ");
                try
                {
                    userChoice = scanner.nextInt();
                    invalidInput = false;
                }
                catch (Exception e)
                {
                    System.out.printf("!Exception!: Invalid Input. Try again.\n", e);
                    scanner.next();
                } 
            }

            // Test user choice against random number
            if (userChoice > randInt)
                System.out.printf("%d is too high! Try again.\n", userChoice);
            else if (userChoice < randInt)
                System.out.printf("%d is too low! Try again.\n", userChoice);
            else
                System.out.printf("Great guess! %d is the number I was thinking of!\n", userChoice);
        }

        // close scanner
        scanner.close();
    }
}
