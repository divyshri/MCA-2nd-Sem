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
public class SearchagivenString {
    public static void main(String [] args) throws Exception
    {
        
        File f=new File("abc.txt");
       
        PrintWriter pw= new PrintWriter(f);
        
        pw.println("First");
        pw.println("String");
        pw.println("Second");
        pw.println("String");
        pw.flush();
        pw.close();
        BufferedReader br= new BufferedReader( new FileReader(f));
        String str=br.readLine();
        //System.out.println(str);
        int count=0;
        String s1="String";
        while(str!=null)
        {    //System.out.println(str);
            if(str.equals(s1))
                count++;
            str=br.readLine();
        }
        System.out.println("String appears "+ count+" times in file.");
        br.close();
       
    }
}
