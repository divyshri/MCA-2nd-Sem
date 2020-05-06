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
import java.util.logging.Level;
import java.util.logging.Logger;
public class CannonGame extends Frame{
    public static void main(String args[]) throws InterruptedException
    {
       // CannonGame world=new CannonGame(Integer.valueOf(60));
         CannonGame world=new CannonGame(90);
        world.show();
        //Thread.sleep(2000);
    }
    public static final int FrameWidth=600;
    public static final int FrameHeight=400;
    private int angle=45;
    private String message="";
    private CannonBall cannonBall=null;
    private static final int barrelLength=30;
    private static final int barrelWidth=10;
    //public CannonGame(Integer theta)
    public CannonGame(int theta)
    {
        setSize(FrameWidth,FrameHeight);
        setTitle("CannonGame");
        angle=theta;
        //angle=theta.intValue();
        message="Angle= "+angle;
        double radianAngle=angle*Math.PI/180.0;
        double sinAngle=Math.sin(radianAngle);
        double cosAngle=Math.cos(radianAngle);
        double intialVelocity=12;
        cannonBall=new CannonBall(
        20+(int)(barrelLength*cosAngle),
        dy(5+(int)(barrelLength*sinAngle)),
        5,intialVelocity*cosAngle,-intialVelocity*sinAngle);
    }
    public int dy(int y)
    {
        return FrameHeight-y;
    }
    public void paint(Graphics g)
    {
        
        
        int x=20;//location of cannon
        int y=5;
        double radianAngle=angle*Math.PI/180.0;
        int lv=(int)(barrelLength*Math.sin(radianAngle));
        int lh=(int)(barrelLength*Math.cos(radianAngle));
        int sv=(int)(barrelWidth*Math.sin(radianAngle+Math.PI/2));
        int sh=(int)(barrelWidth*Math.cos(radianAngle+Math.PI/2));
        //draw Cannon
        g.setColor(Color.green);
        g.drawLine(x, dy(y), x+lh, dy(y+lv));
        g.drawLine(x+lh, dy(y+lv), x+lh+sh, dy(y+lv+sv));
        g.drawLine(x+lh+sh, dy(y+lv+sv), x+sh, dy(y+sv));
        g.drawLine(x+sh, dy(y+sv), x, dy(y));
        g.drawOval(x-8,dy(y+10),12,12);
        //draw Target
        g.setColor(Color.red);
        g.fillRoundRect(FrameWidth-100, dy(12), 50, 10, 6, 6);

//draw Cannon ball
        if(cannonBall!=null)
        {
            cannonBall.move();
            cannonBall.paint(g);
            if(dy(cannonBall.y())>0)
                repaint();
            else
            {
                int targetX=FrameWidth-100;
                if((cannonBall.x()>targetX)&&(cannonBall.x()<(targetX+50)))
                    message="You Hit it!";
                else
                    message="Missed";
                cannonBall=null;
            }
        }
        g.drawString(message,FrameWidth/2,FrameHeight/2);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }        
    }
}
