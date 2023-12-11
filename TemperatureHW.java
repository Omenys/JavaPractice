/* Name: Raven Daigle
 * Course: ITSE-2317
 * Date: October 13, 2023
 * Description: Convert temperatures from Fahrenheit to Celsius and Kelvin
 */

import java.util.Scanner;

class Temperature {

    // Temperature in Fahrenheit variable
    private double ftemp = 0.0;

    // Constructor accepts Fahrenheit temperature
    public Temperature(double value) {
        setFahrenheit(value);
    }

    // Accepts a Fahrenheit temperature and updates it
    public void setFahrenheit(double newValue) {
        ftemp = newValue;
    }

    // Returns the value of the ftemp field as a Fahrenheit temperature
    public double getFahrenheit() {
        return ftemp;
    }

    // Returns the value of ftemp converted to Celsius
    public double calcCelsius() {
        return (5.0 / 9.0) * (ftemp - 32.0);
    }

    // Returns the value of the ftemp converted to Kelvin
    public double calcKelvin() {
        return (5.0 / 9.0) * (ftemp - 32.0) + 273.0;
    }
}

public class TemperatureHW {

    // Validate user input
    public static double getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                return input.nextDouble();
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
                input.next();
            }
        }
    }

    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for a Fahrenheit temperature
        double ftemp = getInput(input, "Enter a temperature in Fahrenheit: ");

        // Create instance of Temperature class
        Temperature temperature = new Temperature(ftemp);

        // Display temperatures in Fahrenheit, Celcius, and Kelvin
        System.out.printf("Fahrenheit: %.2f degrees\n", temperature.getFahrenheit());
        System.out.printf("Celsius: %.2f degrees\n", temperature.calcCelsius());
        System.out.printf("Kelvin: %.2f kelvin", temperature.calcKelvin());

    }
}
