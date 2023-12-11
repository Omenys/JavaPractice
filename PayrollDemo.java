
import java.util.Scanner;

public class PayrollDemo {

    // Validate user input function
    public static double getInput(Scanner input, String question, boolean isPayRate) {
        while (true) {
            System.out.print(question);
            Boolean invalidDouble = false;
            try {
                double userInput = input.nextDouble();
                if (userInput < 0.0) {
                    invalidDouble = true;
                    throw new Exception();
                } else if (isPayRate && userInput < 6.00) {
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

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Create instance of Payroll class
        Payroll pr = new Payroll();

        // Loop through employees to get the hours and pay rate from user
        for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {
            // Get input for hours
            String q = String.format("Enter the hours worked for employee %d: ", pr.getEmployeeID(i));
            int hours = (int) getInput(input, q, false);

            // Get input for pay rate
            q = String.format("Enter the hourly pay rate for employee number %d: ", pr.getEmployeeID(i));
            double payRate = getInput(input, q, true);

            // Store the data in the database
            pr.setHours(i, hours);
            pr.setPayRate(i, payRate);

        }

        // Display
        System.out.println("\nPayroll Data\n");

        // Loop through employees to display data for each employee
        for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {
            System.out.printf("Employee ID: %s%n", pr.getEmployeeID(i));
            System.out.printf("Hours: %d%n", pr.getHours(i));
            System.out.printf("Pay Rate: %.2f%n", pr.getPayRate(i));
            System.out.printf("Gross Pay: %.2f%n", pr.calcGrossPay(i));
            System.out.println("------------------------\n");
        }

        // close scanner
        input.close();
    }

}
