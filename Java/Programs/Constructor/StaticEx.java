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
public class StaticEx {
    static int a=3;
    static int b=a*3;
   // int c=3,x;
    static void meth(int x)
    {
        //this.x=x; 
      //  disp();
        disp();
        System.out.println(" X value is "+x);
        System.out.println("a value is "+a);
        System.out.println(" b value is "+b);
        //System.out.println(" c value is "+c);
    }
   /* void disp()
    {
        System.out.println("Hello");
    }*/
    static void disp()
    {
       System.out.println("Hello"); 
    }
    
    static {
        System.out.println(" a and b are"+a+" "+b);
        
    }
    public static void main(String args[])
    {
                meth(2);
        
    }
    
}
