import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

void main() {
    JFrame frame = new JFrame("Event Handling");

    JButton button = new JButton("Click Me!");

    // Register an action listener to handle the click event
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button" +
                    " was clicked!");
        }
    });

    frame.add(button);

    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Make the frame visible after setting everything up
    frame.setVisible(true);
}
