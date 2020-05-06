/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mc18106
 */
import java.io.*;
import java.lang.*;
public class LongestWord {
    public static void main(String [] args) throws Exception
    {
        int max_length=0;
        BufferedReader br= new BufferedReader( new FileReader("abc.txt"));
        String str=br.readLine();
        while(str!=null)
        {
            String[] words=str.split("\\s");
            for(String s1: words)
            {
                if(s1.length()>max_length)
                    max_length=s1.length();
            }
            str=br.readLine();
        } 
        System.out.println("Longest word length is: "+max_length );
        
        br.close();
        
    }
    
 }
