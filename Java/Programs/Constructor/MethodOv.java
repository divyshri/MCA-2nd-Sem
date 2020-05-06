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
class Overloding
{
 
    void disp()
    {
        System.out.println("No parameters");
    }
    void disp(int a)
    {
        System.out.println("1 parameter "+a);
    }
    void disp(int a,int b)
    {
        System.out.println("2 parameters "+a+" and "+b);
    }
    double disp(double a)
    {
        System.out.println(" a parameter "+a);
        return a;
    }
}
public class MethodOv {
    public static void main(String arg[])
    {
        Overloding ob=new Overloding();
        ob.disp();
        ob.disp(1);
        ob.disp(1,2);
        double d=ob.disp(1.4);
        System.out.println("result is "+ d);
        
    }
}
