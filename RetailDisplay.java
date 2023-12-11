import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * This program demonstrates a solution to the
 * Retail Price Calculator programming challenge.
 */

public class RetailDisplay extends JFrame {
    // Components
    private JPanel panel;
    private JTextField wholesale;
    private JTextField markupPercent;
    private JButton calcButton;

    // Constants for the window size
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 130;

    /**
     * Constructor
     */

    public RetailDisplay() {
        // set window title
        setTitle("Retail Price Calculator");
        // Set the fram to close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Build the paenl by calling buildPanel() function
        buildPanel();
        // Add the panel to the frame
        add(panel);
        // Size and display the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }

    /**
     * The buildPanel method creates a panel containing
     * other components.
     */

    private void buildPanel() {
        JLabel message1 = new JLabel("Enter the wholesale cost:");
        JLabel message2 = new JLabel("Enter the markup percentage:");

        wholesale = new JTextField(10);
        markupPercent = new JTextField(10);

        calcButton = new JButton("Calculate retail price");
        calcButton.addActionListener(new CalcButtonListener());

        // Create a panel
        panel = new JPanel();

        panel.add(message1);
        panel.add(wholesale);
        panel.add(message2);
        panel.add(markupPercent);
        panel.add(calcButton);
    }

    /**
     * CalcButtonListener is an action listener class for the
     * calcbutton component.
     */

    private class CalcButtonListener implements ActionListener {
        /**
         * actionPerformed method
         */
        public static double calculateRetail(double wholesaleCost, double markup) {
            return wholesaleCost + (wholesaleCost * markup);
        }

        public void actionPerformed(ActionEvent e) {
            // 1.Variables
            double wholesaleCost, markupPct, retail;
            // 2. Get the wholsale cost. 3.Save it to wholesaleCost var
            wholesaleCost = Double.parseDouble(wholesale.getText());
            // 2. Get the markup percent. 3.Save it to markupPct var
            markupPct = Double.parseDouble(markupPercent.getText());
            // 4.Calculate
            retail = calculateRetail(wholesaleCost, markupPct);
            // 5. Display
            JOptionPane.showMessageDialog(null, String.format("The retail price is %.2f", retail));
        }
    }

    /**
     * The main method creates an instance of the RetailPriceCalculator
     * class, causing it to display its window.
     */

    public static void main(String[] args) {
        RetailDisplay rpc = new RetailDisplay();
    }
}
