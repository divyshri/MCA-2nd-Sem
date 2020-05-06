/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Rajesh Reddy
 */
public class Ball{
    protected Rectangle location;
    protected double dx,dy;
    protected Color color;
    public Ball(int x,int y,int r)
    {
        location=new Rectangle(x-r,y-r,2*r,2*r);
        dx=0;
        dy=0;
        color=Color.blue;
    }
    public void setColor(Color newColor)
    {
        color=newColor;
    }
    public void setMotion(double ndx,double ndy)
    {
        dx=ndx;
        dy=ndy;
    }
    public int radius()
    {
        return location.width/2;
    }
    public int x()
    {
        return location.x+radius();
    }
    public int y()
    {
        return location.y+radius();
    }
    public double xMotion()
    {
        return dx;
    }
    public double yMotion()
    {
        return dy;
    }
    public Rectangle region()
    {
        return location;
    }
    public void moveTo(int x,int y)
    {
        location.setLocation(x,y);
    }
    public void move()
    {
        location.translate((int)dx, (int)dy);
    }
    public void paint(Graphics g)
    {
        g.setColor(color);
        g.fillOval(location.x, location.y, location.width, location.height);
        
    }
}

