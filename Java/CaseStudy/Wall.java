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
class Wall implements PinBallTarget {
    public Rectangle location;
    public Wall(int x,int y,int width,int height)
    {
        location=new Rectangle(x,y,width,height);
    }
    public void moveTo(int x,int y)
    {
        location.setLocation(x,y);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(location.x,location.y, location.width, location.height);
    }
    public boolean intersects(Ball aBall)
    {
        return location.intersects(aBall.location);
    }
    public void hitBy(Ball aBall)
    {
        if((aBall.y()<location.y)||(aBall.y()>(location.y+location.height)))
        {
            aBall.dy=-aBall.dx;
        }
    }
}