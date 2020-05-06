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
public class SwapTwoString {
      public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
         System.out.println("Enter first string");
        String s1=in.nextLine();
        System.out.println("Enter second string");
        String s2=in.nextLine();
        String s3="";
        s3=s1;
        s1=s2;
        s2=s3;
        System.out.println("After swaping strings are:" + s1+ " "+s2);
    }
}
