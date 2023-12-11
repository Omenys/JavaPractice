/* Name: Raven Daigle
 * Course: ITSE 2317
 * Date: October 06, 2023
 * Description: Program that grades the written portion of a driver's license exam.
 */

import java.util.Scanner;

class DriverExam {
    // Create answer key constant
    public final char[] answerKey = {
            'B', 'D', 'A', 'A', 'C',
            'A', 'B', 'A', 'C', 'D',
            'B', 'C', 'D', 'A', 'D',
            'C', 'C', 'B', 'D', 'A' };

    // Create arrays to store user values
    public char[] answersGiven = new char[20];
    private int[] questionsMissed = new int[20];

    // Tracks total correct answers
    private int totalCorrect = 0;

    // Returns true if the student passed the exam or false if the student failed
    public Boolean passed() {
        return this.totalCorrect() >= 15;
    }

    // Setter for correct values
    public void addCorrect(int value) {
        this.totalCorrect += value;
    }

    // Getter for total correct answers
    public int totalCorrect() {
        return this.totalCorrect;
    }

    // Getter for total incorrect answers
    public int totalIncorrect() {
        return 20 - this.totalCorrect();
    }

    // Setter for questions missed
    public void updateQuestionsMissed(int i) {
        this.questionsMissed[i] = i + 1;
    }

    // Getter for questions missed
    public int[] questionsMissed() {
        return this.questionsMissed;
    }

}

public class DriversLicenseExam {

    // Validate user input function
    public static char getInput(Scanner input, String question) {
        while (true) {
            System.out.print(question);
            try {
                String userInput = input.next().toUpperCase();
                if (userInput.length() == 1) {
                    for (char c : new char[] { 'A', 'B', 'C', 'D' }) {
                        if (c == userInput.charAt(0)) {
                            return c;
                        }
                    }
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("!Exception!: Invalid input.");
            }
        }
    }

    public static void main(String[] args) {

        // Create scanner
        Scanner input = new Scanner(System.in);

        // Create instance of DriverExam
        DriverExam exam = new DriverExam();

        // Get user input
        for (int i = 0; i < 20; ++i) {
            char answer = getInput(input, "Enter a student\'s answer: ");
            exam.answersGiven[i] = answer;
            // Evaluate answers given against the answer key
            if (exam.answersGiven[i] == exam.answerKey[i]) {
                exam.addCorrect(1);
            } else {
                exam.updateQuestionsMissed(i);
            }
        }

        // Display to user
        System.out.println("-------------------");
        System.out.printf("Total Correct: %d\n", exam.totalCorrect());
        System.out.printf("Total Incorrect: %d\n", exam.totalIncorrect());
        System.out.print("Questions Missed: \n  ");
        for (int i = 0; i < 20; ++i) {
            if (exam.questionsMissed()[i] != 0) {
                System.out.printf("%d ", exam.questionsMissed()[i]);
            }
        }
        System.out.println("\n-------------------");
        if (exam.passed()) {
            System.out.println("The student passed the exam!");
        } else {
            System.out.println("The student did not pass the exam.");
        }
    }
}