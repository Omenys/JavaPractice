/* Name: Raven Daigle
 * Course: ITSE 2317
 * Date: September 08, 2023
 * Description: Program that can perform addition and subtraction with random numbers based on user choice.
 */

import java.util.*;

public class MathTutor {
    public static void main(String[] args) {
        // Create scanner to get user input
        Scanner scanner = new Scanner(System.in);
        // Create random number object
        Random rand = new Random();

        // Greet the user and get input
        System.out.println("Welcome! I will be your math tutor.");
        System.out.println("If you would like to practice addition, please enter 1.");
        System.out.println("If you would like to practice subtraction, please enter 2.");

        // Assign user symbol and random numbers
        String userSymbol = " ";
        int randInt1 = rand.nextInt(500) + 1;
        int randInt2 = rand.nextInt(500) + 1;
        int userChoice = 0;

        // loop until valid input
        Boolean invalidAnswer = true;
        while (invalidAnswer) {
            System.out.print("What would you like to practice today? ");

            // Variables
            userChoice = scanner.nextInt();

            // Create conditions based on user input
            if (userChoice == 1) {
                userSymbol = "+";
                invalidAnswer = false;
            } else if (userChoice == 2) {
                userSymbol = "-";
                invalidAnswer = false;
            } else {
                System.out.println("Invalid selection.  Please input either 1 or 2.");
            }
        }

        System.out.println(randInt1);
        System.out.println(userSymbol);
        System.out.println(randInt2);
        System.out.println("--------------");
        System.out.print("Enter the solution: ");
        int solution = scanner.nextInt();

        if (userChoice == 1 && (randInt1 + randInt2) != solution)
            System.out.printf("Sorry, the correct answer is: %d", randInt1 + randInt2);
        else if (userChoice == 2 && (randInt1 - randInt2) != solution)
            System.out.printf("Sorry, the correct answer is: %d", randInt1 - randInt2);
        else
            System.out.printf("Congratulations! %d is the correct answer!", solution);

        // close scanner
        scanner.close();
    }
}
