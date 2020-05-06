/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Rajesh Reddy
 */
class Box
{
    int width,height,depth;
   /* Box(int w,int h,int d)
    {
        width=w;
        height=h;
        depth=d;
    }*/
    Box(int width,int height,int depth)
    {
        this.width=width;
       this.height=height;
        this.depth=depth;
    }
    double volume()
    {
        return width*height*depth;
    }
}
public class ParamCon {
public static void main(String args[])
        {
            Box b=new Box(1,2,3);
            Box b1=new Box(4,5,6);
            System.out.println("volume is "+b.volume());
            System.out.println("volume is "+b1.volume());
        }
}
