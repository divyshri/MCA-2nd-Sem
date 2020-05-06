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
import java.lang.*;
public class PalindromeString {
    public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        StringBuffer sb=new StringBuffer(s);  
        sb.reverse();
        String s1= new String(sb);
        if(s.equals(s1))
            System.out.println("Given string is Palindrome");
        else
            System.out.println("Given String is not Palidrome");
    }
}
