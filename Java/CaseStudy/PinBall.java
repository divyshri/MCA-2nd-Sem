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
public class PinBall extends Ball {
    public PinBall(int sx,int sy)
    {
        super(sx,sy,10);
        setMotion(-2+Math.random()/4,-15);
    }
    private static final double gravityEffect=0.3;
    public void move()
    {
        dx=dy+gravityEffect;
        super.move();
    }
    public void paint(Graphics g)
    {
        super.paint(g);
    }
    
}
