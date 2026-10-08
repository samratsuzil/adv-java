import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

void main() {
    JFrame frame = new JFrame("Event Classes");

    JButton actionButton = new JButton("Submit");
    JTextField inputField = new JTextField(15);

    // Create a panel for the components
    JPanel panel = new JPanel();
    panel.add(inputField);
    panel.add(actionButton);

    // 1. Handling an ActionEvent
    actionButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Action Command: " + e.getActionCommand());
        }
    });

    // 2. Handling a MouseEvent
    frame.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println(
                    "Panel clicked at X: " + e.getX() +
                            ", Y: " + e.getY()
            );
        }
    });

    // 3. Handling a KeyEvent
    inputField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println(
                    "User typed character: " + e.getKeyChar()
            );
        }
    });

    // Add the panel to the frame
    frame.add(panel);

    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
