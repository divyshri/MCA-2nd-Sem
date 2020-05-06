/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
import java.awt.event.*;
public class BigCanvas extends Frame{
    public static void main(String args[])
    {
        BigCanvas world=new BigCanvas();
        world.show();
    }
    private Polygon poly=new Polygon();
    private Canvas cv=new Canvas();
    public BigCanvas(){
        setSize(300,300);
        setTitle("scroll pane test");
        cv.setSize(1000,1000);
        cv.addMouseListener(new MouseKeeper());
        ScrollPane sp=new ScrollPane();
        sp.add(cv);
        add("Center",sp);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    public void paint(Graphics g)
    {
        Graphics gr=cv.getGraphics();
        gr.drawPolygon(poly);
    }
    private class MouseKeeper extends MouseAdapter{
        public void mousePressed(MouseEvent e)
        {
            poly.addPoint(e.getX(),e.getY());
            repaint();
        }
    }
}
