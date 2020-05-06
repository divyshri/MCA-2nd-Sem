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
public class RemoveCharacter {
    public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any string");
        String s=in.nextLine();
        System.out.println("Enter character to remove");
        char ch=in.next().charAt(0);
        System.out.println(charRemoveAt(s,s.indexOf(ch)));
    }
    public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
    
}
