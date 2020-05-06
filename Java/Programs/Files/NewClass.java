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
  
public class NewClass 
{ 
    public static void main(String[] args) throws Exception 
    { 
        InputStream file = null; 
        try { 
           // InputStream geek = null; 
            file = new FileInputStream("file.txt"); 
            System.out.println("availabel no of bytes "+file.available());
            byte b[]=new byte[6];
            //byte b1[]=new byte[20];
            
            // read() method : reading and printing Characters 
            // one by one 
            file.read(b);
            //file.read(b1,0,13);
            String s=new String(b);
            System.out.println("contents of b are "+s);
            //System.out.println("contents of b1 are "+new String(b1));
            //System.out.print(s);
            System.out.println("skip "+file.skip(2));
            System.out.println((char)file.read());
             System.out.println("availabel no of bytes "+file.available());
          // System.out.println("Char : "+(char)file.read()); 
          //System.out.println("Char : "+(char)file.read()); 
           // System.out.println("Char : "+(char)file.read()); 
            /*System.out.println("availabel no of bytes "+file.available());*/
            // mark() : read limiing the 'geek' input stream 
           //file.mark(5); 
            //file.skip(1);
            // skip() : it results in redaing of 'e' in G'e'eeks 
            //System.out.println("no of characters ignored "+file.skip(1)); 
            //System.out.println("skip() method comes to play"); 
            //System.out.println("mark() method comes to play"); 
            //System.out.println("Char : "+(char)file.read()); 
            //System.out.println("Char : "+(char)file.read()); 
            //System.out.println("Char : "+(char)file.read()); 
            //System.out.println("mark suported: "+file.markSupported());
           // System.out.println("availabel no of bytes "+file.available());*/
            
           // System.out.println("availabel no of bytes "+file.available());
           // file.reset();
            file.close();
        } 
        catch(Exception excpt) 
        { 
            // in case of I/O error 
            excpt.printStackTrace(); 
        } 
        finally
        { 
            // releasing the resources back to the 
            // GarbageCollector when closes 
            if (file!=null) 
            { 
                // Use of close() : closing the file 
                // and releasing resources 
                file.close(); 
            } 
        } 
    } 
} 
