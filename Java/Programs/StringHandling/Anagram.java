/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

import java.util.Scanner;

/**
 *
 * @author Rajesh Reddy
 */
class A
{
    String anagram(String s1,String s2)
    {
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();
        s3=sort(s3);
        s4=sort(s4);
       if(s1.length()!=s2.length())
           return "not anagrams";
       else
       {
           for(int i=0;i<s1.length();i++)
           {
               if(s3.charAt(i)==s4.charAt(i))
                   continue;
               else
                   return "not anagrams";
                   
           }
       }
       return "anagrams";
    }
    String sort(String s1)
    {
        char a[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
           {
               for(int j=i;j<s1.length();j++)
               {
                   if(a[i]>a[j])
                   {
                       char temp=a[i];
                       a[i]=a[j];
                       a[j]=temp;
                   }
               }
           }
        String s=new String(a);
        return s;
    }
}
public class Anagram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        A A1=new A();
        System.out.println("2 strings are "+A1.anagram(s1,s2));
        
    }
    
}
