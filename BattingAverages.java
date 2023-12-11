/* Name: Raven Daigle
 * Course: ITSE-2317
 * Date: September 29, 2023
 * Description: Calculate the batting average based on input from the user
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BattingAverages {
    public static void main(String[] args)
    {
        //Create scanner
        Scanner input = new Scanner(System.in);

        // Holds all of the averages gathered.
        List<Double> avgs = new ArrayList<>();

        //Get five batting averages
        int userInput = 0;
        while (userInput < 5)
        {
            System.out.println("Enter a batting average: ");
            avgs.add(input.nextDouble()); 
            userInput++;
        }


        // Build the total amount.
        double totalValue = 0.0;
        for (double avg : avgs) {
        totalValue = totalValue + avg;
        }

        // Creates the avg of the averages.
        double totalAvg = totalValue / avgs.size();

        // Sort
        Collections.sort(avgs);
        Collections.reverse(avgs);

        // Print the sorted list.
        int i = 0;
        for (Double v: avgs) {
            System.out.printf("%d: %.3f\n", ++i, v);
        }

        // Display quality based on total average
        String quality = "Needs Improvement";
        if (totalAvg >= .303)
        {
            quality = "Excellent Average";
        }
        else if (totalAvg > .267)
        {
            quality = "Good Average";
        }
        else if (totalAvg > .231)
        {
            quality = "Normal";
        }
        else if (totalAvg > .195)
        {
            quality = "Below Average";
        }
        System.out.printf("Total average: %.3f\t%s\n", totalAvg, quality);

    //close scanner
    input.close();
    }
}
