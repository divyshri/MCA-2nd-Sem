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
class Box1 {
    
    double width,height,depth;
    private int p;
    Box1()
    {
         width=-1;
        height=-1;
        depth=-1;
    }
    Box1(Box1 ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;        
    }
    Box1(double l)
    {
        width=height=depth=l;
    }
    Box1(double w,double h,double d)
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
class BoxWeight1 extends Box1{
    double weight;
    BoxWeight1(BoxWeight1 ob)
    {
      super(ob);
        weight=ob.weight;
    }
    BoxWeight1(double w,double h,double d,double we)
    {
       super(w,h,d);
        weight=we;
    }
    BoxWeight1()
    {
       super();
        weight=-1;
    }
    BoxWeight1(double len,double m)
    {
        super(len);
        weight=m;
    }
}
public class DemoSuper
{
 public static void main(String args[])
 {
     BoxWeight1 b1=new BoxWeight1(10,20,15,34.3);
     BoxWeight1 b2=new BoxWeight1(2,3,4,0.076);
     BoxWeight1 b3=new BoxWeight1();
     BoxWeight1 b4=new BoxWeight1(3,2);
     BoxWeight1 b5=new BoxWeight1(b1);
     double vol;
     vol=b1.volume();
     System.out.println("vol of b1 is  "+vol);
     System.out.println("weight of b1 is  "+b1.weight);
     System.out.println();
     vol=b2.volume();
     System.out.println("vol of b2 is  "+vol);
     System.out.println("weight of b2 is  "+b2.weight);
     System.out.println();
     vol=b3.volume();
     System.out.println("vol of b3 is  "+vol);
     System.out.println("weight of b3 is  "+b3.weight);
     System.out.println();
     vol=b4.volume();
     System.out.println("vol of b4 is  "+vol);
     System.out.println("weight of b4 is  "+b4.weight);
     System.out.println();
     vol=b5.volume();
     System.out.println("vol of b5 is  "+vol);
     System.out.println("weight of b5 is  "+b5.weight);
     System.out.println();
     
     }
}
