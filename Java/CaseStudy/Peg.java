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
class Peg extends ScorePad{
    private int state=1;
    public Peg(int x,int y,int v)
    {
        super(x,y,v);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        if(state==2)
        {
            g.drawOval(location.x-3, location.y-3, location.width+6, location.height+6);
            state=1;
        }
        else
            g.drawOval(location.x-2, location.y-2, location.width+4, location.height+4);
    }
    public void hitBy(Ball aBall)
    {
        super.hitBy(aBall);
        aBall.setMotion(-aBall.dy, -aBall.dx);
        while(intersects(aBall))
            aBall.move();
        state=2;
    }
    
}
