/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVI
 */
import java.util.*;
public class SubString {
     public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        System.out.println("Enter no. of splits");
        int n=in.nextInt();
        String[] words=s.split("\\s",n);
        for(String w:words)
        {
            System.out.println(w);
        }
        
    }
     
}
