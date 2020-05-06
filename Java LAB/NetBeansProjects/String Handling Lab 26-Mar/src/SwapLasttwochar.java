
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

public class SwapLasttwochar {
      public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
         System.out.println("Enter string");
        String s1=in.nextLine();
        char[] a= s1.toCharArray();
        int index=a.length-1;
        char temp=a[index];
        a[index]=a[index-1];
        a[index-1]=temp;
        for(char c: a)
        {
            System.out.print(c);
        }
            
    }
}
