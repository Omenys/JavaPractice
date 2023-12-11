/* Name: Raven Daigle
 * Course: INEW 2338
 * Date: November 15, 2023
 * Description: Convert input English text into pig latin
 */

import java.util.Scanner;

public class PigLatin {

    // Function to convert each word of phrase to pig latin
    public static String convertPhrase(String word) {
        word = word.substring(1) + word.charAt(0) + "AY ";
        // Return manipulated word in upper case
        return word.toUpperCase();
    }

    // Validate user input
    public static String getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            Boolean invalidPhrase = false;
            try {
                String userInput = input.nextLine();
                // only accept characters and white space
                if (!userInput.matches("[a-z A-Z ]+")) {
                    invalidPhrase = true;
                    throw new Exception();
                }
                return userInput;
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
                if (!invalidPhrase) {
                    input.next();
                }
            }
        }
    }

    public static void main(String arg[]) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Get input from the user
        String userInput = getInput(input, "Enter a phrase to convert it into Pig Latin: ");

        // Declare pig latin variable
        String pigLatin = "";

        // Create string array of words split by space
        String[] userPhrase = userInput.split(" ");
        for (String s : userPhrase) {
            pigLatin += convertPhrase(s);
        }

        // Display results to user
        System.out.printf("English: %s\n", userInput);
        System.out.printf("Pig Latin: %s", pigLatin);
    }
}
