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
class A1
{
    int i;
    private int j;
    void setij(int x,int y) {
         i=x;
        j=y;
    }
    int getj()
    {
        return j;
    }
}
class B1 extends A1
{
    int total;
    void sum() {
        total=i+getj();
        //total=i+j;
    }
          
}
       

public class Access1 {
    public static void main(String args[])
    {
        B1 subob=new B1();
        subob.setij(10,12);
        subob.sum();
        System.out.println("Total is "+subob.total);
    }
    
}
