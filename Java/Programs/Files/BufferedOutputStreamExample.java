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
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("output.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to java";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  
