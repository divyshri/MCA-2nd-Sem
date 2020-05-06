/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
import java.awt.event.*;

public class PaintBrush extends Frame implements MouseMotionListener
{
    int w,h;
    Image image=null;
    Graphics g;
    PaintBrush()
    {
        w=1000;
        h=1000;
        addMouseMotionListener(this);
        setSize(w,h);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
    dispose();
}});
        }
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mouseDragged(MouseEvent e)
    {
        g=image.getGraphics();
        g.setColor(Color.red);
        int x=e.getX();
        int y=e.getY();
        g.fillOval(x-5, y-5, 10, 10);
        repaint();
    }
    public void paint(Graphics g)
    {
         if(image==null)
            image=createImage(2000,2000);
        if(image!=null)
            g.drawImage(image, 0, 0, this);
        
    }
    public static void main(String args[])
    {
        new PaintBrush();
    }
}

