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
class C{
    int i;
    
}
class D extends C
{
    int i;
    D(int a,int b)
    {
        super.i=a;
        i=b;
    }
    void show()
    {
        System.out.println("i in superclass: "+ super.i);
        System.out.println("i in subclass: "+ i);
        
        
    }
}
public class Super2 {
public static void main(String args[])
{
    D subob=new D(1,2);
    subob.show();
}
}
