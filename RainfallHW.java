/* Array Practice
Write a RainFall class that stores the total rainfall for each of the 12 months into an array of doubles. */

import java.util.Scanner;

// Class that stores the total rainfall for 12 months
class RainFall {

    // Store rainfall in array of doubles
    private double[] annualRainfall = new double[12];

    // Method for total rainfall for the year
    public double totalRainfall() {
        double total = 0.0;
        for (double number : this.annualRainfall) {
            total += number;
        }
        return total;
    }

    // Method for average monthly rainfall
    public double avgRainfall() {
        return this.totalRainfall() / this.annualRainfall.length;
    }

    // Method for the month with most rain
    public int maxRain() {
        int maxIndex = 0;
        for (int i = 0; i < this.annualRainfall.length; i++) {
            if (this.annualRainfall[i] > this.annualRainfall[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Method for the month with least rain
    public int minRain() {
        int minIndex = 0;
        for (int i = 0; i < this.annualRainfall.length; i++) {
            if (this.annualRainfall[i] < this.annualRainfall[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Setter for annualRainfall
    public void setMonthRainfall(int index, double value) {
        this.annualRainfall[index] = value;
    }

    // Getter for totalMonths
    public int totalMonths() {
        return this.annualRainfall.length;
    }
}

public class RainfallHW {

    // Input validation
    public static double getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            Boolean invalidDouble = false;
            try {
                double userInput = input.nextDouble();
                if (userInput < 0.0) {
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

        // Create array for months
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Create Rainfall object
        RainFall rain = new RainFall();

        // variable to hold rainfall
        double rainfall = 0;

        // Loop through months for input
        for (int i = 0; i < rain.totalMonths(); i++) {
            String q = String.format("Enter the rainfall for %s in inches: ", months[i]);
            rainfall = getInput(input, q);
            rain.setMonthRainfall(i, rainfall);
        }

        // Display the total rainfall for the year
        System.out.printf("The total rainfall for the year: %.2f inches\n", rain.totalRainfall());

        // Display the average rainfall for the year
        System.out.printf("The average rainfall for the year: %.2f inches\n", rain.avgRainfall());

        // Display the month with the most rain
        System.out.printf("Month with most rainfall: %s\n", months[rain.maxRain()]);

        // Display the month with the least rain
        System.out.printf("Month with the least rainfall: %s\n", months[rain.minRain()]);
    }
}
