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
 import java.io.ByteArrayInputStream; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.io.PushbackInputStream; 
public class PushBackEx {
    public static void main(String arg[]) throws Exception 
    { 
        PrintWriter pw = new PrintWriter(System.out, true); 
        String str = "hello welcome to nitw "; 
        byte b[] = str.getBytes();
        byte c[]=new byte[str.length()];
        ByteArrayInputStream bout = new ByteArrayInputStream(b); 
        PushbackInputStream push = new PushbackInputStream(bout,50); 
          
   /*     int c; 
        while((c=push.read())!=-1) 
        { 
            pw.print((char)c); 
        }*/ 
 //       pw.println(); 
        push.read(c);
        /*int c2;
        while((c2=push.read())!=-1) 
        { 
            System.out.print((char)c2);
//pw.print((char)c); 
        }*/
      // unread method 
        push.unread(c); 
        int c1;
        while((c1=push.read())!=-1) 
        { 
            System.out.print((char)c1);
            //pw.print((char)c); 
        }
      //  push.unread(b, 0, 6); 
       // System.out.print("hai");
        
        //System.out.print((push.read()));
        //System.out.print((push.read()));
       //  
        pw.println(); 
        pw.close(); 
    } 
} 

