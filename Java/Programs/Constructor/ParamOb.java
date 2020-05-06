/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh Reddy
 */
package Constructor;
class B
{
    int i,j;
    B(int a,int b)
    {
       i=a;
       j=b;
    }
    boolean test(B ob)
    {
        return (ob.i==i&&ob.j==j);
    }
}
public class ParamOb {
    
    public static void main(String args[])
    {
        B A1=new B(1,2);
        B A2=new B(2,3);
        B A3=new B(1,2);
        System.out.println("A1==A2 "+A2.test(A1));
        System.out.println("A1==A3 "+A1.test(A3));
        
        
    }
}
