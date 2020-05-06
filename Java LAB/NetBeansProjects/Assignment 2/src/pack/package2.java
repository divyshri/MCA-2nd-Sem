/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;
import java.util.Scanner;
import  mypack.add;
/**
 *
 * @author Sonali
 */
public class package2 {
    public static void main(String args[])
    {
        add obj =new add();
       Scanner in =new Scanner(System.in); 
    int x,y,z ;
    System.out.println("enter value of x");
        x=in.nextInt();
   System.out.println("enter value of y");     
         y=in.nextInt();
         obj.addvalue(x,y); 
         
    }
}
