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
class AB
{
  
    private int a=1;
    public int b=2;
    int c=3;
    static int d=4;
   protected  AB()
    {
     //   BC B=new BC();
       // B.disp();
        System.out.println("protected constructor");
    }
    
    class BC {
        int y=10;
        BC()
        {
            System.out.println("Hello");
        }
        void disp()
        {
            show();
            System.out.println("a,b,c are "+a+" "+b+" "+c);
        }

    }
    static class CD
    {
        CD()
        {
            sshow();
            System.out.println("welcome to static inner class and static variable d is "+d);
        }
    }
    static void sshow()
    {
        System.out.println("printing static method");
    }
            
    void show()
    {
        
        System.out.println("Welcome to outer class");
       // System.out.println("inner class variable"+y);
    }
}
public class NestClass {
    public static void main(String args[])
    {
        AB A=new AB();
        AB.BC A1=A.new BC();
        A1.disp();
        
        //BC b=new BC();
    }
    
    
    
}
