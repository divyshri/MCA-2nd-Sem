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
public class BufferedWriterDemo {
   public static void main(String args[]) throws IOException 
   {
       FileWriter writer=new FileWriter("A.txt");
       BufferedWriter br=new BufferedWriter(writer);
       br.write("welcome to nitw");
       br.close();
       System.out.println("success");     
   }
}
