/* Name: Raven Daigle
* Course: ITSE 2317
* Date: September 22, 2023
* Description: Calculates painting requirements and cost based on user input
*/

import java.util.Scanner;

public class PaintCompany {
    // Gallons of paint required function
    public static int paintRequired(int totalSqft) {
        if (totalSqft <= 0) {
            return 0;
        } else if (totalSqft <= 100) {
            return 1;
        }
        return totalSqft / 100;
    }

    // Hours of labor required function
    public static double hoursRequired(int totalSqft) {
        return (totalSqft / 100.0) * 8;
    }

    // Cost of paint function
    public static double paintCost(int gallons, double paintPrice) {
        return gallons * paintPrice;
    }

    // Labor charges function
    public static double laborCost(double hours) {
        return hours * 20;
    }

    // Total cost of the job function
    public static double totalCost(double laborCost, double paintCost) {
        return laborCost + paintCost;
    }

    // Validate user input function
    public static double getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            Boolean invalidDouble = false;
            try {
                double userInput = input.nextDouble();
                if (userInput < 1.0) {
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
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Get number of rooms
        int rooms = (int) getInput(input, "Please enter the number of rooms to be painted: ");

        // Get paint price
        double paintPrice = getInput(input, "What is the price of your favorite gallon of paint: ");

        // Get total square footage
        double totalSqft = 0;
        for (int i = 1; i <= rooms; ++i) {
            String q = String.format("What is the square footage of wall space in room %d: ", i);
            totalSqft += getInput(input, q);
        }

        // Round total square foot to next integer
        int totalSqft_mod = (int) Math.ceil(totalSqft);

        // Gallons required Display
        int gallons = paintRequired(totalSqft_mod);
        System.out.printf("Numbers of Gallons required: %d\n", gallons);

        // Hours of Labor Display
        double hoursRequired = hoursRequired(totalSqft_mod);
        System.out.printf("Hours of Labor: %.1f hours\n", hoursRequired);

        // Paint Cost Display
        double paintCost = paintCost(gallons, paintPrice);
        System.out.printf("Cost of paint: $%.2f\n", paintCost);

        // Labor Charges Display
        double laborCost = laborCost(hoursRequired);
        System.out.printf("Labor Charges: $%.2f\n", laborCost);

        // Total Paint Job Display
        double totalCost = totalCost(laborCost, paintCost);
        System.out.printf("Total for the paint job: $%.2f\n", totalCost);

        // Close scanner
        input.close();
    }
}