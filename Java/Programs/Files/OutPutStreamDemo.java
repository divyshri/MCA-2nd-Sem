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
//Java program to demonstrate OutputStream 
class OutputStreamDemo1
{ 
    public static void main(String args[])throws Exception 
    { 
        OutputStream os = new FileOutputStream("output.txt"); 
        byte b[] = {65, 66, 67, 68, 69, 70}; 
          
        //illustrating write(byte[] b) method 
         os.write(b,3,3); 
          
        //illustrating flush() method 
        //os.flush(); 
  
        //illustrating write(int b) method 
       /*for (int i = 71; i <75 ; i++)  
        { 
            os.write(i); 
        } */
          
       os.flush(); 
          
        //close the stream 
        os.close(); 
    } 
} 

