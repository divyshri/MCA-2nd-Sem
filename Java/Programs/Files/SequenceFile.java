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
public class SequenceFile {
public static void main(String args[])throws IOException
{
    FileInputStream f1=new FileInputStream("file.txt");
    FileInputStream f2=new FileInputStream("file1.txt");
SequenceInputStream s=new SequenceInputStream(f1,f2);
int j;
while((j=s.read())!=-1)
{
System.out.print((char)j);	}
s.close();
f2.close();
f1.close();
}

}
