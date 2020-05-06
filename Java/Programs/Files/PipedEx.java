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
public class PipedEx {
    public static void main(String[] args) throws IOException  { 
    PipedInputStream input = new PipedInputStream(); 
    PipedOutputStream output = new PipedOutputStream(); 
    try{
    // Use of connect() : connecting input with output 
    input.connect(output);
    // Use of read() method : 
    output.write(71); 
    System.out.println("using read() : " + (char)input.read());
    output.write(69); 
    System.out.println("using read() : " + (char)input.read()); 
    output.write(75); 
    System.out.println("using read() : " + (char)input.read()); 
    }
    catch(IOException e)
    {
        e.printStackTrace();
        
    } 
    } 
} 
