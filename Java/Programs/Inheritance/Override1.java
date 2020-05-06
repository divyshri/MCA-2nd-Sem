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
class AB1
{
    int i,j;
    AB1(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i and j :"+ i + " "+j);
    }
}
class CD1 extends AB1
{
    int k;
    CD1(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show(String msg)
    {
        //super.show();
        System.out.println(msg+k);
    }
}
public class Override1 {
    public static void main(String args[])
    {
        CD1 subob=new CD1(1,2,3);
        subob.show();
        subob.show("This is K:");
    }
    
}

