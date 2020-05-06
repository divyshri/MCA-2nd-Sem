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

public class Paint extends Frame {
    public static void main(String args[])
    {
        Frame world=new Paint();
        world.show();
    }
    private Image image=null;
    private Shape currentShape=null;
    public Paint()
    {
        setTitle("Paint");
        setSize(800,800);
        Panel p=new Panel();
        p.setLayout(new GridLayout(1,3));
        p.add(new Rectangle());
        p.add(new Oval());
        p.add(new Line());
        add("North",p);
        MouseKeeper k=new MouseKeeper();
        addMouseListener(k);
        addMouseMotionListener(k);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        
    }
    public void paint(Graphics g)
    {
        if(image==null)
            image=createImage(2000,2000);
        if(image!=null)
            g.drawImage(image, 0, 0, this);
            
        }
    public abstract class Shape extends Button implements ActionListener{
        public Shape(String name)
        {
            super(name);
            addActionListener(this);
        }
        public abstract void draw(Graphics g,int a,int b,int c,int d);
        public void actionPerformed(ActionEvent e)
        {
            currentShape=this;
            
        }
    }
    private class Rectangle extends Shape {
        public Rectangle()
        {
            super("Rectangle");
        }
        
        public void draw(Graphics g, int a, int b, int c, int d) {
            int w=c-a;
            int h=d-b;
            g.drawRect(a,b,w,h);
        }
                
    }
    private class Oval extends Shape
    {
        public Oval()
        {
            super("Oval");
        }
        public void draw(Graphics g, int a, int b, int c, int d) {
            int w=c-a;
            int h=d-b;
            g.drawOval(a,b,w,h);

        }
    }
    private class Line extends Shape{
        public Line()
        {
            super("Line");
        }
        public void draw(Graphics g, int a, int b, int c, int d) {
            g.drawLine(a,b,c,d);
        }
    }
    private class MouseKeeper extends MouseAdapter implements MouseMotionListener
    {
        private int startx,starty;
        private int lastx,lasty;
        public void mousePressed(MouseEvent e)
        {
            lastx=startx=e.getX();
            lasty=starty=e.getY();
        }
        private void drawShape(Graphics g)
        {
            if(currentShape!=null)
            {
                currentShape.draw(g,startx,starty, lastx, lasty);
            }
        }
        public void mouseDragged(MouseEvent e)
        {
            Graphics g=image.getGraphics();
            g.setXORMode(Color.white);
            drawShape(g);
            lastx=e.getX();
            lasty=e.getY();
            drawShape(g);
            repaint();
            
        }
        public void mouseReleased(MouseEvent e)
        {
       //     Graphics g=image.getGraphics();
          //  g.setXORMode(Color.white);
           // drawShape(g);
           // g.setPaintMode();
           // lastx=e.getX();
         //   lasty=e.getY();
            //drawShape(g);
            
            //repaint();
        }
    }
    
}