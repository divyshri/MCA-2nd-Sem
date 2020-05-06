/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

/**
 *
 * @author Rajesh Reddy
 */
import java.io.*;
public class PrintWriterDemo {
    public static void main(String args[]) throws IOException
    {
        PrintWriter writer=new PrintWriter(System.out);
        writer.write("Java provides object oriented features");
        writer.flush();
        writer.close();
        PrintWriter writer1=new PrintWriter(new File("B.txt"));
        writer1.write("welcome to nitw");
        writer1.flush();
        writer1.close();
    }
}
