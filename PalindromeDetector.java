/* Name: Raven Daigle
 * Course: INEW 2338
 * Date: November 03, 2023
 * Description: Determine whether input given by the user is a palindrome
 */

import java.util.Scanner;

public class PalindromeDetector {

    // Recursive method to determine if String argument is palindrome
    public static boolean isPalindrome(String input, int start, int end) {
        // base case
        if (start >= end) {
            return true;
        } else if (input.charAt(start) == input.charAt(end)) {
            return isPalindrome(input, start + 1, end - 1);
        }

        return false;
    }

    // Validate user input function
    public static String getInput(Scanner input, String question) {
        while (true) {
            System.out.println(question);
            try {
                String userInput = input.next();

                // Do not allow empty or null inputs
                if (userInput.isEmpty() || userInput == null) {
                    throw new Exception();
                }
                return userInput;
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
            }
        }
    }

    public static void main(String arg[]) {

        // Create scanner object and get user input
        Scanner scanner = new Scanner(System.in);
        String userInput = getInput(scanner,
                "Please enter a word, phrase, or sentence, we will determine if it is a Palindrome: ");

        // Check if input is a palindrome
        boolean success = isPalindrome(userInput.toLowerCase(), 0, userInput.length() - 1);
        if (success) {
            System.out.println("Your word, phrase, or sentence is a Palindrome.");
        } else {
            System.out.println("Your word, phrase, or sentence is not a Palindrome.");
        }
    }
}
