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
public class CannonBall extends Ball {
    public static final double GravityEffect=0.3;

    CannonBall(int sx, int sy, int r,  double dx, double dy) {
       super(sx,sy,r);
        setMotion(dx,dy);
    }
    public void move()
    {
        dx=dy+GravityEffect;
        super.move();
    }
    
}
