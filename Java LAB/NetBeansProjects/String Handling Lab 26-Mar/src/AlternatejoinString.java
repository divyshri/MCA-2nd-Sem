
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVI
 */
public class AlternatejoinString {
      public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
         System.out.println("Enter first string");
        String s1=in.nextLine();
        System.out.println("Enter second string");
        String s2=in.nextLine();
        char[] a= s1.toCharArray();
        char[] b= s2.toCharArray();
        String s3="";
        int i=0,j=0;
        while(i<a.length&&j<b.length)
        {
            s3=s3+a[i];
            s3=s3+b[j];
            i++;
            j++;
        }
        while(i<a.length)
        {
            s3=s3+a[i];
            i++;
        }
         while(j<b.length)
        {
            s3=s3+b[j];
            j++;
        }
         System.out.println("Resultant string is: "+s3);
    }    
}
