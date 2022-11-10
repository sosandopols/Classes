package com.company;

import javax.swing.*;
import java.awt.*;

public class Fractal {
    public static void main(String[] args) {
        DrawCanvas canvas = new DrawCanvas();
        //set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle(" FractalCircles.java");
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add the canvas to the frame as a content panel
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}

class DrawCanvas extends Canvas {
    int index = 0;
    public void paint (Graphics graphics){
        int xc = 10000, yc = 10000;
        int r = 15000;
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke(new BasicStroke(1));
        graphics.setColor(Color.BLACK);
        draw(graphics, xc, yc, r);
        repaint();

    }

    public void draw(Graphics graphics, int xc, int yc, int r){
        if (r < 5)
            return;
        index++;
        graphics.drawOval(xc - r, yc - r, 2 * r, 2 * r);
        draw(graphics, xc, yc - r, r / 2);
        draw(graphics, xc - r, yc, r / 2);
        draw(graphics, xc, yc + r, r / 2);
        draw(graphics, xc + r, yc, r / 2);
    }

}
