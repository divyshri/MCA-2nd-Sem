/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Rajesh Reddy
 */
import java.io.*;
public class MyEx {
    static void call() throws Exception{
        {
            FileReader f=new FileReader("ab.txt");
            int i;
            while((i=f.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
    }
public static void main(String args[])
{
    try{
    call();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}
