package Live2024;

import javax.swing.*;
import java.awt.*;

public class ChangeOfBasis extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new ChangeOfBasis();
        frame.setSize(700, 700);
        frame.setTitle("Change of Basis");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public ChangeOfBasis() {
        add(new DrawPanel());
    }

    static class DrawPanel extends JPanel {
        S2 S = new S2(50, 50, 120, 300);
        V2 P = new V2(5, 3);
        S2 Sm = new S2(50, 50, 120, 300);
        V2 Pm = new V2(2 * Math.sqrt(2), -Math.sqrt(2));
        DrawPanel() {
            Sm.moveTo(new V2(2, 2));
            Sm.rotate((Math.PI / 4));
            repaint();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            S.drawAxis(g);
            S.drawPoint(g, P, Color.BLUE, 8);
            Sm.drawAxis(g);
            Sm.drawPoint(g, Pm, Color.YELLOW, 4);

        }
    }

}
