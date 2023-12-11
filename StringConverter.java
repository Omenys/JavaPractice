import java.util.Scanner;

public class StringConverter {

    // Validate user input
    public static String getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            Boolean invalidPhrase = false;
            try {
                String userInput = input.nextLine();
                // only accept characters, punctuation, and white space
                if (!userInput.matches("[a-z A-Z .?]+")) {
                    invalidPhrase = true;
                    throw new Exception();
                }
                return userInput;
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
                if (!invalidPhrase) {
                    input.next();
                }
            }
        }
    }

    public static void main(String[] args) {

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Get input
        String userInput = getInput(input, "Enter sentence to be converted: ");

        // Create string array of words split by uppercase
        String output = "";
        for (char ch : userInput.toCharArray()) {
            if (output.equals("")) {
                output += ch;
                continue;
            } else if (Character.isUpperCase(ch)) {
                output += " ";
            }
            output += Character.toLowerCase(ch);
        }
        System.out.println(output);

    }
}
