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
class A
{
    int a,b;
    A()
    {
        a=1;
        b=2;
    }
    void disp()
    {
        System.out.println(" a and b values are "+a+" and "+b);
    }
}
public class Constr {
    public static void main(String args[])
    {
        A A1=new A();
        A1.disp();
    }
    
}
