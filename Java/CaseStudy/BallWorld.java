/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy;

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
import java.awt.event.*;
public class BallWorld extends Frame{
    public static void main(String args[])
    {
        BallWorld world=new BallWorld(Color.red);
        //world.show();
    }
    public static final int  FrameWidth=600;
    public static final int FrameHeight=600;
    private Ball aBall;
    private int counter=0;
    private BallWorld(Color ballColor)
    {
        setSize(FrameWidth,FrameHeight);
        setTitle("BallWorld");
        aBall=new Ball(20,300,10);
        aBall.setColor(ballColor);
        aBall.setMotion(10.0,10.0);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        aBall.paint(g);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        //g.fillOval(50,50,50,50);
        aBall.move();
       // System.out.println(aBall.y());
        if((aBall.x()<30)||(aBall.x()>FrameWidth-30))
        {
            //System.out.println(-aBall.xMotion());
            aBall.setMotion(-aBall.xMotion(),aBall.yMotion());
        }
        if(aBall.y()<30||(aBall.y()>FrameHeight-30))
            aBall.setMotion(aBall.xMotion(),-aBall.yMotion());
        counter=counter+1;
        if(counter<10000)
            repaint();
         else
            System.exit(0);
    }
}
