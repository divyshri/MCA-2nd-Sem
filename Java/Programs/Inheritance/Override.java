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
class AB
{
    int i,j;
    AB(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i and j :"+ i + " "+j);
    }
}
class CD extends AB
{
    int k;
    CD(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show()
    {
        //super.show();
        System.out.println("K: "+k);
    }
}
public class Override {
    public static void main(String args[])
    {
        CD subob=new CD(1,2,3);
        subob.show();
    }
    
}
