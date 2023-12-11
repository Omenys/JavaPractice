/* Name: Raven Daigle
 * Course: INEW 2338
 * Date: December 01, 2023
 * Description: Generic class that accepts array of objects and returns the minimum and maximum values
 */

import java.util.Scanner;

// Interface
interface IMinMax<T extends Comparable<T>> {
    T getMax();

    T getMin();
}

// Generic class with type parameter constrained to any type and implements
// comparable
class MinMax<T extends Comparable<T>> implements IMinMax<T> {

    // Define array
    private T[] array;

    // Constructor for MinMax class
    public MinMax(T[] array) {
        this.array = array;
    }

    // Method to return maximum value in array
    public T getMax() {

        T maxValue = this.array[0];

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].compareTo(maxValue) > 0) {
                maxValue = this.array[i];
            }
        }
        return maxValue;
    }

    // Method to return minimum value in array
    public T getMin() {

        T minValue = this.array[0];

        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].compareTo(minValue) < 0) {
                minValue = this.array[i];
            }
        }
        return minValue;
    }
}

public class MaxMinElements {

    public static void main(String[] args) {

        // Create scanner
        try (Scanner input = new Scanner(System.in)) {

            // Create array of strings
            String[] stray = new String[2];

            // Get user input for string
            System.out.println("Input a string: ");
            stray[0] = input.next();

            System.out.println("Input another string: ");
            stray[1] = input.next();

            MinMax<String> stringMinMax = new MinMax<>(stray);
            System.out.println("String Min: " + stringMinMax.getMin());
            System.out.println("String Max: " + stringMinMax.getMax());
            // Display minimum value for string

            // Get MinMax object for Integers
            // Get user input for integer
            // Display maximum value for integer
            // Display minimum value for integer

            // Get MinMax object for Doubles
            // Get user input for double
            // Display maximum value for double
            // Display minimum value for double
        }
    }
}
