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
public class DataInputStreamEx {
  public static void main(String[] args) throws IOException {  
    InputStream input = new FileInputStream("filename.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();
    System.out.println("count "+count);
    byte[] ary = new byte[count];  
    //System.out.println("no of reads are: "+inst.read(ary));  
    
    System.out.println("read int: "+inst.read());
    //inst.readFully(ary);
   /* for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.print(k+"-");  
    }*/ 
    int count1 = input.available();
    System.out.println("count "+count1);
    
  }  
}      

