import javax.swing.*;
import java.awt.*; //for color and graphics classes
import java.awt.geom.*; //for creating shapes and paths


public class TutorialDrawingCanvas extends JComponent {

    private int width;
    private int heigth;

    public TutorialDrawingCanvas(int w, int h){
        width = w;
        heigth = h;
    }

    //Draws a background
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,heigth); //(Position x, Position y, w, h)
        g2d.setColor(new Color(255,223,186));
        g2d.fill(r);

    }
    
}