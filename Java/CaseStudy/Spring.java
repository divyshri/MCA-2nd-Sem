/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy;

import java.awt.*;

/**
 *
 * @author Rajesh Reddy
 */
public class Spring implements PinBallTarget{
    private Rectangle pad;
    private int state=1;
    public Spring(int x,int y)
    {
        pad=new Rectangle(x,y,30,3);
    }
    public void moveTo(int x,int y)
    {
        pad.setLocation(x,y);
    }
    public void paint(Graphics g)
    {
        int x=pad.x;
        int y=pad.y;
        g.setColor(Color.black);
        if(state==1)
        {
            g.fillRect(x, y, pad.width, pad.height);
            g.drawLine(x, y+3, x+30, y+5);
            g.drawLine(x+30, y+5, x, y+7);
            g.drawLine(x, y+7, x+30, y+9);
            g.drawLine(x+30, y+9, x, y+11);
        }
        else{
            g.fillRect(x, y-6, pad.width, pad.height);
            g.drawLine(x, y+5, x+30, y-1);
            g.drawLine(x+30, y-1, x, y+3);
            g.drawLine(x, y+3, x+30, y+7);
            g.drawLine(x+30, y+7, x, y+11);
            state=1;
        }
    }
    public boolean intersects(Ball aBall)
    {
        return pad.intersects(aBall.location);
    }
    public void hitBy(Ball aBall)
    {
        if(aBall.dy>0)
            aBall.dy=-aBall.dy;
        aBall.dy=aBall.dy-0.5;
        state=2;
    }
    
}
