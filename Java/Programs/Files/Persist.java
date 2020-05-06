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
class Persist{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("f.ser");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  

