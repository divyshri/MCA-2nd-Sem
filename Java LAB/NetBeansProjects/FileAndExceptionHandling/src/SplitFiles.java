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
public class SplitFiles {
    public static void main(String [] args) throws Exception
    {
        File f =new File("abc.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        PrintWriter fw1=new PrintWriter("f1.txt");
         PrintWriter fw2=new PrintWriter("f2.txt");
          PrintWriter fw3=new PrintWriter("f3.txt");
          PrintWriter fw4=new PrintWriter ("f4.txt");
        int length=(int)f.length();
        int[] part=new int[3];
        int j=3;
        for(int i=0;i<3;i++)
        {
            
            part[i]=length/j;
            System.out.println(part[i]);
            length=length-part[i];
            j--;
        }
       int str =br.read();
      //int count=0;
       while(str!=-1)
       {
           while(part[0]>0)
           {
               fw1.print((char)str);
               part[0]--;
               str=br.read();
           }
           while(part[1]>0)
           {
               fw2.print((char)str);
               part[1]--;
               str=br.read();
           }
           while(part[2]>0)
           {   fw3.print((char)str);
               part[2]--;
                str=br.read();
           }
          
       }
       fw1.flush();
       fw2.flush();
       fw3.flush();
       fw1.close();
       fw2.close();
       fw3.close();
       br=new BufferedReader(new FileReader ("f2.txt"));
       String st=br.readLine();
       while(st!=null)
       {
           fw4.println(st);
           st=br.readLine();
       }
       br=new BufferedReader(new FileReader ("f3.txt"));
       st=br.readLine();
       while(st!=null)
       {
           fw4.println(st);
           st=br.readLine();
       }
       fw4.flush();
       fw4.close();
       br.close();
    }
}
