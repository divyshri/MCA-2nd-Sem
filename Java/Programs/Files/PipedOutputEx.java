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
public class PipedOutputEx { 
    public static void main(String[] args) throws IOException 
    { 
        PipedInputStream input = new PipedInputStream(); 
        PipedOutputStream output = new PipedOutputStream(); 
  
        // Use of connect() : connecting geek_input with geek_output 
        input.connect(output); 
  
        byte[] buffer = {'J', 'A', 'V', 'A','2'}; 
  
        // Use of write(byte[] buffer, int offset, int maxlen) 
        output.write(buffer, 0, 5); 
        int a = 1; 
        int i=0;
        System.out.print("Use of write(buffer, offset, maxlen) : "); 
        while(a>0) 
        { 
           // i++;
            //System.out.print(" i value is: " + i); 
            System.out.print(" " + (char) input.read()); 
        } 
        
    } 
} 

 

