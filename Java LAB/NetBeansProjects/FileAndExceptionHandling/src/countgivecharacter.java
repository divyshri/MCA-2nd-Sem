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
import java.util.*;
public class countgivecharacter {
    public static void main(String [] args) throws Exception
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter character to be found");
        char c=in.next().charAt(0);
        int count=0;
        BufferedReader br= new BufferedReader( new FileReader("abc.txt"));
         int ch=br.read();
        while(ch!=-1)
        {
            if(ch==c)
                count++;
            ch=br.read();
        }
         System.out.println("Character "+c+" found "+ count+" times in file." );
        
        br.close();
    }
}
