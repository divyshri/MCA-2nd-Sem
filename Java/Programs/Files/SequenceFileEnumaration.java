/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files;

/**
 *
 * @author Rajesh Reddy
 */
import java.io.*;
import java.util.*;
public class SequenceFileEnumaration {
    public static void main(String args[]) throws Exception
    {
        FileInputStream f1=new FileInputStream("file.txt");
        FileInputStream f2=new FileInputStream("file1.txt");
        FileInputStream f3=new FileInputStream("file2.txt");
        FileInputStream f4=new FileInputStream("test.txt");
        Vector v=new Vector();
        v.add(f1);
        v.add(f2);
        v.add(f3);
        v.add(f4);
        Enumeration e=v.elements();
        SequenceInputStream s=new SequenceInputStream(e);
        int i=0;
        while((i=s.read())!=-1)
        {
            System.out.print((char)i);
        }
        s.close();
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        
    }
    
}
