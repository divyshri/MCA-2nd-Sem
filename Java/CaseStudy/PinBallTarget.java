/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy;

import java.awt.Graphics;

/**
 *
 * @author Rajesh Reddy
 */
public interface PinBallTarget {
  public boolean intersects(Ball aBall);
  public void moveTo(int x,int y);
  public void paint(Graphics g);
  public void hitBy(Ball aBall);
}
