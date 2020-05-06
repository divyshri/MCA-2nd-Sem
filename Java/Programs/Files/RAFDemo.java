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
public class RAFDemo {
    public static void main(String args[])
    {
        try{
            RandomAccessFile ra=new RandomAccessFile("file4.txt","rw");
           ra.writeUTF("Hello");
           ra.seek(0);
           System.out.println(""+ra.readLine());
           ra.seek(0);
           ra.writeUTF("This is an example\nHelloWorld");
           ra.seek(0);
           System.out.println(""+ra.readLine());

           /* ra.writeUTF("Hello World");
            ra.seek(0);
            ra.read();
            System.out.println(ra.read());
            ra.seek(0);
            System.out.println(""+ra.readLine());
            ra.seek(0);
            ra.writeUTF("This is an example HelloWorld");
           // ra.readLine();
            ra.seek(0);
            System.out.println(""+ra.readLine());
            //System.out.println(""+ra.readLine());
            ra.writeInt(1);
            System.out.println(""+ra.readInt());
            ra.writeChar('A');
            System.out.println(""+ra.readChar());
            ra.writeFloat(1.5f);
            System.out.println(""+ra.readFloat());
            ra.seek(0);*/
            ra.close();
            
        }
         
         // create a new RandomAccessFile with filename test
         /*RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // print the line
         System.out.println("" + raf.readLine());

         // set the file pointer at 0 position
         raf.seek(0);

         // write something in the file
         raf.writeUTF("This is an example \n Hello World");

         raf.seek(0);
         // print the line
         System.out.println("" + raf.readLine());
         }*/

        catch(IOException Ex)
        {
            Ex.printStackTrace();
        }
    }
    
}
