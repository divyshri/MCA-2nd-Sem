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
class H
{
    void callme()
    {
        System.out.println("Ïnside H' s csll me method" );
        
    }
}
class I extends H
{
    void callme()
    {
        System.out.println("Ïnside I' s csll me method" );
    }
}
class J extends H
{
    void callme()
    {
        System.out.println("Ïnside J' s csll me method" );
    }
}
public class Dispatch {
    public static void main(String args[])
    {
        H h=new H();
        I i=new I();
        J j=new J();
        H r;
        r=h;
        r.callme();
        r=i;
        r.callme();
        r=j;
        r.callme();
    }
}
