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
public class ByteArrayOPStream {
        public static void main(String[] args) throws IOException 
    { 
        ByteArrayOutputStream output = new ByteArrayOutputStream(); 
  
        byte[] buffer = {'J', 'A', 'V', 'A'}; 
        byte[] buffer1={65,66,67,68,69};
  
        // Use of write(byte[] buffer, int offset, int maxlen) 
        output.write(buffer1, 0, 4); 
        //System.out.print("Use of write(buffer, offset, maxlen) by toByteArray() : "); 
        System.out.println("string is "+output.toString());
        // Use of toByteArray() : 
       /* for (byte b: output.toByteArray()) 
        { 
             System.out.print(" " + b); 
        }*/
        byte b[]=output.toByteArray();
        for(int i=0;i<b.length;i++)
        {
            System.out.print((char)b[i]);
        }
    } 

    
}

