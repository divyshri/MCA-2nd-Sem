/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Random;

/**
 *
 * @author Rajesh Reddy
 */
public class Exc0 {
    public static void main(String args[])
    {
        int a=0,b=0,c=0;
        Random r=new Random();
        for(int i=0;i<5;i++)
        {
            try{
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Division by zero");
                a=0;
              
            }
           /* finally
            {
                System.out.println("wecome");
            }*/
            System.out.println("a:"+a);
        }
    }
}
