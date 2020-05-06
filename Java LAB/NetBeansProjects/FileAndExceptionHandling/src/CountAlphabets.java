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
public class CountAlphabets {
    public static void main(String [] args) throws Exception
    {
        int[] count= new int [26];
        BufferedReader br= new BufferedReader( new FileReader("abc.txt"));
        PrintWriter p=new PrintWriter("countcharacter.txt");
        int ch=br.read();
        while(ch!=-1)
        {
            if(ch>97&&ch<123)
                count[ch-97]++;
            ch=br.read();
        }
        for(int i=0;i<26;i++)
        {
            p.println("character "+ (char)(i+97)+" appears "+ count[i]+ "times" );
        }
        p.flush();
        p.close();br.close();
    }
}
