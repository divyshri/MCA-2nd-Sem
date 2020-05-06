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
class COver
{
    int i,j;
    COver()
    {
        i=4;
        j=5;
    }
    COver(int a)
    {
        i=a;
        j=a;
    }
    COver(int a,int b)
    {
        i=a;
        j=b;
    }
    COver(COver C)
    {
        i=C.i;
        j=C.j;
    }
    void disp()
    {
        System.out.println(" i and j values are "+i+" "+j);
    }
            
}
public class ConOver {
    public static void main(String args[])
    { 
        COver c1=new COver();
        c1.disp();
        COver c2=new COver(1);
        c2.disp();
        COver c3=new COver(1,2);
        c3.disp();
        COver c4=new COver(c3);
        c4.disp();
    }
    
}
