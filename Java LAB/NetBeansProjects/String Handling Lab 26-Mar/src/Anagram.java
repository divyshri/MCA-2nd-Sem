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
public class Anagram {
      public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
         System.out.println("Enter first string");
        String s1=in.nextLine();
        System.out.println("Enter second string");
        String s2=in.nextLine();
        char[] a= s1.toCharArray();
        char[] b= s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
        
    }
}
