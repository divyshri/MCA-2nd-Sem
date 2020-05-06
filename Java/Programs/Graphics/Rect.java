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
public class Rect extends Frame {
    Rect()
    {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
        setVisible(true);
        setSize(800,800);
        //repaint();
        //setBackground(Color.blue);
        //repaint();
       // select(String s);
    }
   /* public void update(Graphics g)
    {
        setBackground(Color.yellow);
        //setForeground(Color.pink);
    }*/
    public void paint(Graphics g)
            {
             //  g.setBackground(Color.blue);
                g.setColor(Color.blue);
                //g.drawLine(100, 200, 500, 600);
                //int x[]={10,50,100};
                //int y[]={60,40,70};
                //int n=x.length;
               // g.drawRect(50,50,100,100);
               // g.fillRect(50,50,100,100);
               // g.fillRoundRect(50,50,100,100,20,20);
               // g.draw3DRect(50,50,100,100,true);
               // g.drawOval(40, 40, 100, 200);
                g.setColor(Color.red);
                //setBackground(Color.red);
               // g.fillOval(40, 40, 100, 100);
                //g.fillArc(50, 50, 100, 100, 50, 50);
               // g.drawPolygon(x,y,n);
               // Polygon p=new Polygon();
               // p.addPoint(10, 60);
               // p.addPoint(50, 40);
                //p.addPoint(100, 70);
                //g.drawPolygon(p);
                 Rectangle r=new Rectangle(100,100,800,800);
                 
                //Rectangle r1=new Rectangle(600,600);
                
                  //Rectangle r3=new Rectangle();
               // g.fillRect(r.x,r.y,r.width,r.height);
                // System.out.println(r.equals(r1));
                  //System.out.println(r.inside(200,200));
                   //System.out.println(r.intersects(r1));
                // System.out.println(r3.isEmpty());
                  //  r.add(800, 800);
                  
                  // r.add(800, 800);
                 r.setLocation(200, 200);
                 g.fillRect(r.x,r.y,r.width,r.height);
                  // g.fillRect(r1.x,r1.y,r1.width,r1.height);
                  // Rectangle r3=r.union(r1);
                  // g.fillRect(r3.x,r3.y,r3.width,r3.height);
                 /*Rectangle r4=r.union(r1);
                 r4.grow(-50, -50);
                  //g.fillRect(r4.x,r4.y,r4.width,r4.height);
                  //System.out.println(r.intersects(r1));
               // r4.setLocation(100, 100);
                r4.translate(100, 100);
                r4.setSize(200, 200);
                r4.reshape(200, 200, 500, 500);
               //  g.fillRect(r4.x,r4.y,r4.width,r4.height);
                Font aFont=new Font("TimesRoman",Font.BOLD,30);
                g.setFont(aFont);
               g.drawString("Hai", 100, 200);
               FontMetrics fm=g.getFontMetrics();
               System.out.println(fm.getHeight());*/
                  
            }
 
    public static void main(String args[])
    {
        new Rect();
    }
}
