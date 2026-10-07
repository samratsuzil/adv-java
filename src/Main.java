import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Main {

    public static void main(String[] args) {

        JFrame frame=new JFrame("Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font myFont=new Font("Arial",Font.BOLD|Font.ITALIC,50);
        JLabel label=new JLabel("Saptagandaki",JLabel.CENTER);
        label.setFont(myFont);

        frame.add(label);

        frame.setSize(400,400);
        frame.setVisible(true);


    }
}
