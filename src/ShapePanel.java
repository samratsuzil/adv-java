import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.geom.*;


class ShapePanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
//        Rectangle2D rect = new Rectangle2D.Double(50,50,100,200);
//
//        Color myColor = new Color(1,50,32);
//        g2.setColor(myColor);
//        g2.fill(rect);

        g2.setColor(Color.GREEN);

        int[] xpoints= {50,50,100};
        int[] ypoints={50,100,100};
        int npoints=3;

        Polygon poly=new Polygon(xpoints,ypoints,npoints);
        g2.fillPolygon(poly);




    }

    void main() {
        JFrame frame = new JFrame("Shapes");

        ShapePanel sp = new ShapePanel();
        frame.add(sp);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}