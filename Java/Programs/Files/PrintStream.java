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
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.PrintStream; 
import java.util.Locale; 
//Java program to demonstrate PrintStream methods 
class PrintSream 
{ 
    public static void main(String args[]) throws FileNotFoundException 
    { 
        FileOutputStream fout=new FileOutputStream("file.txt");  
        //creating Printstream obj 
        PrintStream out=new PrintStream(fout); 
        //PrintStream out=new PrintStream(System.out); 
        String s="last"; 
  
        //writing to file.txt 
        char c[]={'G','E','E','K'}; 
          
        //illustrating print(boolean b) method 
        out.print(false); 
          
        //illustrating print(int i) method 
        out.print(c); 
          
        //illustrating print(float f) method 
        out.print(4.533f); 
          
        //illustrating print(String s) method 
        out.print("GeeksforGeeks"); 
        out.println(); 
          
        //illustrating print(Object Obj) method 
        out.print(fout); 
        out.println(); 
          
        //illustrating append(CharSequence csq) method 
        out.append("Geek"); 
        out.println(); 
          
        //illustrating checkError() method 
        out.println(out.checkError()); 
          
        //illustrating format() method 
        out.format( "Welcome to my %s program", s); 
          
        //illustrating flush method 
        out.flush(); 
          
        //illustrating close method 
        out.close(); 
    } 
} 

