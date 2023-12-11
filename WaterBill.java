/* Name: Raven Daigle
 * Course: ITSE-2317
 * Date: September 29, 2023
 * Description: Collect data and calculate the average water bill over a period of years
 */

import java.util.Scanner;

public class WaterBill {

    // input validation
    public static double getInput(Scanner input, String question, Boolean isYear) {
        while (true) {
            System.out.print(question);
            Boolean invalidDouble = false;
            try {
                double userInput = input.nextDouble();
                if (userInput < 1.0 && isYear) {
                    invalidDouble = true;
                    throw new Exception();
                }
                else if (userInput < 0.0)
                {
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
    public static void main(String[] args)
    {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        // Get number of years
        int years = (int) getInput(input, "Enter the number of years: ", true);

        // total bill variable
        double totalBill = 0;
        
        //iterate years
        for (int i = 1; i < years + 1; ++i)
        {
            // System.out.printf("Year %d\n", i);
            
            double yearlyBill = 0.0;

            // iterate months
            for (int j = 1; j <= 12; j++)
            {
                // System.out.printf("\tMonth %d\n", j);
                String q = String.format("Enter the water bill for the %d month: ", j);
                double monthlyBill = getInput(input, q, false);
                yearlyBill += monthlyBill;
                totalBill += monthlyBill;
            }
            //Display yearly bill
            System.out.printf("Yearly Bill: %.2f\n", yearlyBill);
            // Display yearly average
            System.out.printf("Monthly average: %.2f\n", yearlyBill/12.0);
        }
        // Display months
        System.out.printf("Months: %d\n", years*12);
        // Display total paid
        System.out.printf("Total Bill: %.2f\n", totalBill);
        // Display average paid over the years
        System.out.printf("Total monthly average: %.2f\n", totalBill/(years*12.0));   
    }
}
