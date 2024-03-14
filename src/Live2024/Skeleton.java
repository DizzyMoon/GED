package Live2024;

import Live2024.S2;

import javax.swing.*;
import java.awt.*;

public class Skeleton extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new Skeleton(); //Remember to change this variable. Must initialize an object from the current class (eg. Skeleton in this case).
        frame.setSize(700, 700);
        frame.setTitle("Skelet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    public Skeleton() {
        add(new DrawPanel());
    }

    class DrawPanel extends JPanel {
        S2 S=new S2(50,50, 120,300);

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            S.drawAxis(g);
        }
    } // class DrawPanel

} // GraphicsApp
