/* Name: Raven Daigle
 * Course: ITSE-2317
 * Date: September 29, 2023
 * Description: Calculate salary for person that earns compounding dimes each day and display salary in table
 */

import java.util.Scanner;

public class DimePay {

    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Create variable
        int daysWorked = 0;
        // Loop until valid input
        while (true) {
            try {
                System.out.printf("Input the number of days worked: ");
                daysWorked = input.nextInt();
                if (daysWorked < 1) {
                    System.out.println("Invalid response. Days worked must be 1 or more.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
                input.next();
            }
        }

        // Dime tracker
        int totalDimes = 1;
        System.out.println("Day | Pay");
        System.out.printf("%d | %.2f\n", 1, totalDimes * .1);
        for (int i = 1; i < daysWorked; ++i) {
            totalDimes = totalDimes * 2;
            System.out.printf("%d | %.2f\n", i + 1, totalDimes * .1);
        }

        // Display table showing dimes per day

        // close scanner
        input.close();
    }
}
