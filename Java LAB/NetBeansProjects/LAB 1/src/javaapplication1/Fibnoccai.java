/*
    To display a fibonacci series
 */
package javaapplication1;

public class Fibnoccai {
    public static void main(String args[])
    {
        int a=-1,b=1;
        int n=10;
       System.out.println("Fibonacci Series upto "+n+" terms is:");
        for(int i=1;i<=n;i++)
        {
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
}
