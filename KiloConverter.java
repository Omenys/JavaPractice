import javax.swing.*; // Needed for Swing classes
import java.awt.event.*;

public class KiloConverter extends JFrame {
    // 1.Components
    private JPanel panel; // To reference a panel
    private JLabel messageLabel; // Directions label
    private JTextField kiloTextField; // input box
    private JButton calcButton;
    private final int WINDOW_WIDTH = 310;
    private final int WINDOW_HEIGHT = 100;

    public KiloConverter() {
        // Set the window title
        setTitle("Kilometer Converter");
        // set the size of the window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // Specify what happens when x button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // build the panel and add it to the frame.
        buildPanel();
        // Add the panel to the frame's content pane
        add(panel);
        // Display the window
        setVisible(true);
    }

    private void buildPanel() {
        // Create a label to display instructions
        messageLabel = new JLabel("Enter a distance in kilometers");
        // Create a text field 10 characters wide.
        kiloTextField = new JTextField(10);
        // Create a button with the caption "Calculate"
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(new CalcButtonListener());
        // Create a JPanel object
        panel = new JPanel();

        // Add the label, text field, and button to the panel
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);

    }

    private class CalcButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // 1.Variables 0.621371
            double kilometers;
            double miles;
            // 2.Get the information from the textbox 3.Store the number into kilometers
            kilometers = Double.parseDouble(kiloTextField.getText());
            // 4.Calculations
            miles = kilometers * 0.6214;
            JOptionPane.showMessageDialog(null, String.format("The miles are %,.2f", miles));
        }

    }

    public static void main(String[] args) {
        new KiloConverter();
    }
}
