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
class BufferedInputStreamDemo
{
    public static void main(String arg[]) throws FileNotFoundException, IOException
    {
        File f1 = new File("filename.txt");
        //LINE A
        //BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1)); 
        BufferedInputStream bis = new BufferedInputStream(System.in); 
        //System.out.println("Available Bytes : " + bis.available()); //LINE B
        //System.out.println("MarkSuppoted : " + bis.markSupported()); //LINE C
        System.out.println(bis.read());
        System.out.println(bis.read());
        // reading bytes from BufferedInputStream
       // System.out.print((char) bis.read());
        //System.out.print((char) bis.read());
        // marking position
        //bis.mark(2); // LINE D
        //System.out.println();
        // reading bytes from BufferedInputStream
        //System.out.print((char) bis.read());
        //System.out.println((char) bis.read());
        //System.out.println("reset method invoked.");
       // bis.reset(); // LINE E
        
        /*int c = 0;
        while((c = bis.read()) != -1)
            System.out.print((char) c);*/
        bis.close();
    
    }
}

