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
public class DataOutPutEx 
{ 
    public static void main(String args[]) throws IOException  
    { 
        //writing the data. 
        try ( DataOutputStream dout = 
                    new DataOutputStream(new FileOutputStream("fops.txt")) ) 
        { 
            dout.writeDouble(1.1); 
            dout.writeInt(55); 
            dout.writeBoolean(true); 
            dout.writeChar('4'); 
        } 
          
        catch(FileNotFoundException ex) 
        { 
            System.out.println("Cannot Open the Output File"); 
            return; 
        } 
          
        // reading the data back. 
        try ( DataInputStream din = 
                    new DataInputStream(new FileInputStream("fops.txt")) ) 
        { 
   
                         //illustrating readDouble() method 
            double a = din.readDouble(); 
                         //illustrating readInt() method 
            int b = din.readInt(); 
                         //illustrating readBoolean() method 
            boolean c = din.readBoolean(); 
                         //illustrating readChar() method 
            char d=din.readChar(); 
            System.out.println("Values: " + a + " " + b + " " + c+" " + d); 
        } 
        catch(FileNotFoundException e) 
        { 
            System.out.println("Cannot Open the Input File"); 
            return; 
        } 
    } 
}  

