/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;
import java.io.*;

/**
 *
 * @author Rajesh Reddy
 */
public class FileDemo {
    static void p(String s)
    {
        System.out.println(s);
    }
    public static void main(String args[]) throws IOException
    {
        //File f1=new File("g:/P1/Assignment.txt");
     /*   File f1=new File("A1.doc");
       //  File f1=new File("g:/p1");
      p(f1.exists() ? "exists":"does not exists");
      if(f1.createNewFile())
      {
          System.out.println("file is created");
      }
      else
      {
          System.out.println("file is existed");
      }
       //f1=new File("file.txt");
       //File f1=new File("G:/P1","A.java");
      //  boolean c=f1.createNewFile();
        p("Filename: "+f1.getName());
        p("path: "+f1.getPath()); 
        p(f1.isFile()?" is normal file":" might be a directory");
        p("Abs path: "+f1.getAbsolutePath());
        p("parent "+f1.getParent());
        p(f1.canWrite()?"is wrirtable":" is not writable");
        p(f1.canRead()?"is readable":" is not readable");
        p("file size: "+f1.length());*/
        File f2=new File("p1");
        File f3=new File("p5");
       // p("make directory: "+f2.mkdir());
        p("make directory: "+f2.mkdirs());
       // p("make directory: "+f2.mkdirs());
        //p("delete file:"+f1.delete());
       // p(f1.exists() ? "exists":"does not exists");
        p("file renamed to: "+f2.renameTo(f3));
         p("file new name "+f2.getName());
        //f1.mark(10);
    }
    
}
