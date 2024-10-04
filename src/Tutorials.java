import java.awt.Color;

import javax.swing.*;

public class Tutorials {
    public static void main(String[] args) {
        int w = 700;
        int h = 700;
        JFrame f = new JFrame();
        TutorialDrawingCanvas dc = new TutorialDrawingCanvas(w, h);
        f.setSize(w,h);
        f.setBackground(new Color(255,223,186));
        f.setTitle("Drawing");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }    
}
