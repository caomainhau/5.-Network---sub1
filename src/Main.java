import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Example");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel to hold our components
        JPanel panel = new JPanel();

        // Create a JLabel to display the welcome message
        JLabel welcomeLabel = new JLabel("Hello and welcome!");

        // Add the welcome label to the panel
        panel.add(welcomeLabel);

        // Create a JTextArea to display the loop output
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setEditable(false); // Make it read-only

        // Add the text area to the panel
        panel.add(textArea);

        // Create a loop to add values to the text area
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            output.append("i = ").append(i).append("\n");
        }
        textArea.setText(output.toString());

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
