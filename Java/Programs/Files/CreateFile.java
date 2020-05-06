/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;
 import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

/**
 *
 * @author Rajesh Reddy
 */
public class CreateFile { 
  public static void main(String[] args) { 
    try { 
     // File myObj = new File(" "); 
         File myObj = new File("file.txt "); 
      if (myObj.createNewFile()) { 
        System.out.println("File created: " + myObj.getName()); 
      } else { 
        System.out.println("File already exists."); 
      } 
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    } 
  } 
}
    
