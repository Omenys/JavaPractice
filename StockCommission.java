/* Name: Raven Daigle
 * Course: ITSE 2317
 * Date: September 03, 2023
 * Assignment Description: Program to allow a user to calculate their profit from a stock investment.
 */

import java.util.Scanner; 

public class RDaigleStockCommission {
    public static void main(String[] args) 
    {
        // Greet the user 
        System.out.println("Welcome to the Stock Profit Calculator!");

        // Create scanner object
        Scanner myObj = new Scanner(System.in);

        // Get amount of shares purchased
        System.out.print("Enter amount of shares purchased: ");
        int sharesPurchased = myObj.nextInt(); // Read user imput

        // Get purchase price of shares
        System.out.print("Enter the purchase price of the shares: $");
        float purchasePrice = myObj.nextFloat();
        
        //Create total purchase price
        float purchaseCost = sharesPurchased * purchasePrice;

        // Get commisssion paid on bought shares
        System.out.print("Enter the percent of commission paid for purchase (ex. 0.07 for 7%): ");
        float purchaseCommission = myObj.nextFloat();
        purchaseCommission = purchaseCommission * purchaseCost;
        float purchaseTotal = purchaseCost + purchaseCommission;

        // Get amount of shares sold
        System.out.print("Enter the amount of shares sold: ");
        int sharesSold = myObj.nextInt();

        // Get sell price of shares
        System.out.print("Enter the sell price of the shares: $");
        float sellPrice = myObj.nextFloat();

        // Create total sale price
        float saleCost = sharesSold * sellPrice;

        // Get commission paid on sold shares
        System.out.print("Enter the percent of commission paid for sale: ");
        float saleCommission = myObj.nextFloat();
        saleCommission = saleCommission * saleCost;
        float saleTotal = saleCost - saleCommission;
        
        // Line break
        System.out.println("====================================================");

        // Display amount of shares purchased
        System.out.printf( "Shares purchased: %d%n", sharesPurchased); 

        // Display purchase price
        System.out.printf("Purchase price: $%,.2f%n", purchaseCost);

        // Display commission paid on purchased shares
        System.out.printf("Purchase commission: $%,.2f%n", purchaseCommission);

        // Display purchase total
        System.out.printf("Purchase total: $%,.2f%n", purchaseTotal);

        // Display sale price
        System.out.printf("Sell price: $%,.2f%n", saleCost);

        // Display commission paid on sold shares
        System.out.printf("Sale commission: $%,.2f%n", saleCommission);

        // Display sale total
        System.out.printf("Sale total: $%,.2f%n", saleTotal);

        // Display profit
        float Profit = (saleTotal - purchaseTotal);
        System.out.printf("Profit: $%,.2f%n", Profit);

        // Close Scanner
        myObj.close();
    }
}
