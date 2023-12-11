/* Chapter 5 Practice Problem
 * Write a program that asks the user to enter an item's wholesale cost and its markup percentage.  
 * It should then display the item's retail price. */

import java.util.Scanner;

public class RetailPriceCalculator {

    public static double calculateRetail(double price, double markup) {
        return price + (price * markup);
    }

    // Validate user input function
    public static double getInput(Scanner input, String question, boolean isPrice) {
        while (true) {
            System.out.print(question);
            Boolean invalidDouble = false;
            try {
                double userInput = input.nextDouble();
                if (isPrice && userInput < 0.0) {
                    invalidDouble = true;
                    throw new Exception();
                }
                return userInput;
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
                if (!invalidDouble) {
                    input.next();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Get wholesale cost
        double price = getInput(input, "Enter the wholesale cost of the item: ", true);

        // Get markup cost
        double markup = getInput(input, "Enter the markup percentage: ", false);
        markup = markup / 100.0;

        // Display retail price
        System.out.printf("The retail price of this item is: %.2f", calculateRetail(price, markup));

    }

}
