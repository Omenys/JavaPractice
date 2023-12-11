/* Name: Raven Daigle
 * Course: INEW 2338
 * Date: November 28, 2023
 * Description: Encryption Program
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption {

    // Function to encrypt file
    public static String encryptFile(String doc) throws FileNotFoundException, IOException {

        // Create objects
        File file = new File(doc);
        Scanner scanner = new Scanner(file);
        FileWriter write = new FileWriter("encrypted.txt");
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            // create array of chars and cast to int; add 5 to encrypt
            for (char ch : data.toCharArray()) {
                int n = (int) ch + 5;
                write.write(n);
                System.out.println("Successfully wrote to file.");
            }
        }
        scanner.close();
        write.close();
        return doc;
    }

    // Function to decrypt file
    public static String decryptFile(String doc) throws Exception {

        // Create objects
        File file = new File(doc);
        Scanner scanner = new Scanner(file);
        FileWriter write = new FileWriter("decrypted.txt");
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            // create array of chars and cast to int; subtract 8 to decrypt
            for (char ch : data.toCharArray()) {
                int n = (int) ch - 5;
                write.write(n);
                System.out.println("Successfully wrote to file.");
            }
        }
        scanner.close();
        write.close();
        return doc;
    }

    public static void main(String[] args) {

        // Pass .txt doc to be encrypted
        try {
            encryptFile("original.txt");
            decryptFile("encrypted.txt");
        } catch (Exception e) {
            System.out.println("! Error! : Something went wrong.");
            e.printStackTrace();
        }
    }
}