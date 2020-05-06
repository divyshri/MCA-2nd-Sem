/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Rajesh Reddy
 */

class Box {
    
    double width,height,depth;
    private int p;
    Box()
    {
         width=-1;
        height=-1;
        depth=-1;
    }
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;        
    }
    Box(double l)
    {
        width=height=depth=l;
    }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return (width*height*depth);
    }
  
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w,double h,double d,double we)
    {
        width=w;
        height=h;
        depth=d;
        weight=we;
    }
}
public class RefDemo
{
 public static void main(String args[])
 {
     BoxWeight b1=new BoxWeight(10,11,12,13);
     Box p1=new Box();
     double vol=b1.volume();
     System.out.println("vol of b1 is  "+vol);
     System.out.println("weight of b1 is  "+b1.weight);
     System.out.println();
     p1=b1;
     vol=p1.volume();
     System.out.println("Volume of p1 is"+vol);
    // System.out.println("weight  of p1 is"+ p1.weight);
     }
}
