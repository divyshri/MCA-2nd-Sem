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
 class Hole extends Ball implements PinBallTarget{
     public Hole(int x,int y)
     {
         super(x,y,12);
         setColor(Color.black);
     }
     public boolean intersects(Ball aBall)
     {
         return location.intersects(aBall.location);
     }
     public void hitBy(Ball aBall)
     {
         aBall.moveTo(0, PinBallGame.FrameHeight+30);
         aBall.setMotion(0, 0);
     }
 }
