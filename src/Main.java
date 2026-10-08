import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image");

        // Load the image using its file path
        ImageIcon myImage = new ImageIcon("src/icon.png");

        // Add the image to a label
        JLabel imageLabel = new JLabel(myImage);

        frame.add(imageLabel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible after setting everything up
        frame.setVisible(true);



    }
}
