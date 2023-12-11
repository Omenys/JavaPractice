/* Name: Raven Daigle
 * Course: ITSE 2317
 * Date: September 07, 2023
 * Description: Get the length and width of two rectangles. Tell the user which of the perimeters is greater or if the perimeters are the same.
 */

import java.util.Scanner;

public class rectanglePerimeter {
    public static void main(String[] args) {
        // Create scanner object to get input from user
        Scanner myObj = new Scanner(System.in);

        // Get first length
        System.out.print("Enter the length of the first rectangle: ");
        // Store variable
        double length1 = myObj.nextDouble();

        // Get first width
        System.out.print("Enter the width of the first rectangle: ");
        // Store variable
        double width1 = myObj.nextDouble();

        // Get second length
        System.out.print("Enter the length of the second rectangle: ");
        // Store variable
        double length2 = myObj.nextDouble();

        // Get second width
        System.out.print("Enter the width of the second rectangle: ");
        // Store variable
        double width2 = myObj.nextDouble();

        // Calculations
        double perimeter1 = (2 * length1) + (2 * width1);
        double perimeter2 = (2 * length2) + (2 * width2);

        // Display perimeters to user
        System.out.println("The perimeter of rectangle 1 is: " + perimeter1);
        System.out.println("The perimeter of rectangle 2 is: " + perimeter2);

        // Logic
        if (perimeter1 > perimeter2) {
            System.out.print("The first rectangle has a greater perimeter than the second rectangle.");

        } else if (perimeter1 < perimeter2) {
            System.out.print("The perimeter for the second rectangle is greater than the first rectangle.");
        } else {
            System.out.print("The perimeters for both rectangles are equal.");
        }
        myObj.close();
    }
}
