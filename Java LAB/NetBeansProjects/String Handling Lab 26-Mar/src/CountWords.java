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
public class CountWords {
    public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
         System.out.println("Enter a string");
        String s=in.nextLine();
        String[] words=s.split("\\s");
        System.out.println("No. of words in string are:"+ words.length);
    }
}
