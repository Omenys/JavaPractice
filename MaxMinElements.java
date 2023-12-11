/* Name: Raven Daigle
 * Course: INEW 2338
 * Date: December 01, 2023
 * Description: Generic class that accepts array of objects and returns the minimum and maximum values
 */

import java.util.Scanner;

// Generic class with type parameter constrained to any type and implements
// comparable
class MinMax<T extends Comparable<T>> {

    // Define array
    private T[] values;

    // Constructor for MinMax class
    public MinMax(T[] values) {
        this.values = values;
    }

    // Method to return maximum value in array
    public T getMax() {

        T maxValue = this.values[0];

        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i].compareTo(maxValue) > 0) {
                maxValue = this.values[i];
            }
        }
        return maxValue;
    }

    // Method to return minimum value in array
    public T getMin() {

        T minValue = this.values[0];

        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i].compareTo(minValue) < 0) {
                minValue = this.values[i];
            }
        }
        return minValue;
    }
}

public class MaxMinElements {

    public static void main(String[] args) {

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Create array of strings
        String[] stray = new String[2];

        // Get user input for string
        System.out.print("Please enter a word or phrase: ");
        stray[0] = input.next();

        System.out.print("Please enter another word or phrase: ");
        stray[1] = input.next();

        // Create MinMax object for string
        MinMax<String> stringMinMax = new MinMax<>(stray);
        // Display max and min strings
        System.out.println("The maximum string is: " + stringMinMax.getMax());
        System.out.println("The minimum string is: " + stringMinMax.getMin());

        // Create array of integers
        Integer[] intray = new Integer[2];

        // Create MinMax object for integers
        MinMax<Integer> intMinMax = new MinMax<>(intray);
        // Get user input for integer
        System.out.print("Please enter an integer: ");
        intray[0] = input.nextInt();
        System.out.print("Please enter another integer: ");
        intray[1] = input.nextInt();

        // Display max and min ints
        System.out.println("The maximum integer is: " + intMinMax.getMax());
        System.out.println("The minimum integer is: " + intMinMax.getMin());

        // Create array of doubles
        Double[] douray = new Double[2];
        // Create MinMax object for doubles
        MinMax<Double> douMinMax = new MinMax<>(douray);
        // Get user input for double
        System.out.print("Please enter a real number (decimal): ");
        douray[0] = input.nextDouble();
        System.out.print("Please enter another real number (decimal): ");
        douray[1] = input.nextDouble();
        // Display max and min doubles
        System.out.println("The maximum real number is: " + douMinMax.getMax());
        System.out.println("The minimum real number is: " + douMinMax.getMin());

        // close scanner
        input.close();
    }
}