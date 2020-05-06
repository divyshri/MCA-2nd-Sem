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
class Depersist{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.ser"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name);  
  
  in.close();  
 }  
}  

