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
class ScorePad extends Hole{
    protected int value;
    public ScorePad(int x,int y,int v)
    {
        super(x,y);
        value=y;
        setColor(Color.red);
    }
    public void hitBy(Ball aBall)
    {
        PinBallGame.world.addScore(value);
    }
    public void paint(Graphics g)
    {
        g.setColor(color);
        g.drawOval(location.x, location.y, location.width, location.height);
        String s=""+value;
        g.drawString(s,location.x,y()+2);
        
    }
}
