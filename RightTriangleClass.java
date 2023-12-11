/* Name: Raven Daigle
 * Course: INEW 2338
 * Date: November 03, 2023
 * Description: Creates a right triangle from user input of base and height and displays area and perimeter
 */

import java.lang.Math;
import java.util.Scanner;

class RightTriangle {

    // FIELDS
    private double base = 0.0;
    private double height = 0.0;

    // CONSTRUCTORS
    // Constructor that accepts base and height as arguments
    public RightTriangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    // No arg constructor that sets the base and height field to 0.0
    public RightTriangle() {
    }

    // SETTERS
    // Setter for base
    public void setBase(double base) {
        this.base = base;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // GETTERS
    // Getter for base
    public double getBase() {
        return this.base;
    }

    // Getter for height
    public double getHeight() {
        return this.height;
    }

    // Metod to calculate hypotenuse of the triangle
    public double getHypotenuse() {
        return Math.hypot(this.getBase(), this.getHeight());
    }

    // Method to calculate the area of the triangle
    public double calcArea() {
        return (this.getBase() * this.getHeight()) / 2.0;
    }

    // Method to calculate the perimeter of the triangle
    public double calcPerimeter() {
        return this.getBase() + this.getHeight() + this.getHypotenuse();
    }
}

public class RightTriangleClass {

    // Validate user input function
    public static double getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            Boolean invalidDouble = false;
            try {
                double userInput = input.nextDouble();
                if (userInput <= 0.0) {
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

    public static void main(String arg[]) {

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Get base from user
        double base = getInput(input, "What is the base of the triangle? ");

        // Get height from user
        double height = getInput(input, "What is the height of the triangle? ");

        // Create right triangle object
        RightTriangle triangle = new RightTriangle(base, height);

        // Display area of triangle
        double area = triangle.calcArea();
        System.out.printf("The area of the triangle is: %.2f\n", area);

        // Display perimeter of triangle
        double perimeter = triangle.calcPerimeter();
        System.out.printf("The perimeter of the triangle is: %.2f\n", perimeter);
    }

}
