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
	class DirList {
	public static void main(String args[])
	{
	String dirname="g:/p1";
	File f1=new File(dirname);
	if(f1.isDirectory()) {
	System.out.println("directory of"+ dirname);
	String s[]=f1.list();
	for(int i=0;i<s.length;i++)
	{
	File f=new File(dirname+"/"+s[i]);
	if(f.isDirectory())	{
	System.out.println(s[i]+" is a directory");
	}	else	{
	System.out.println(s[i]+" is a file");
	}
}
} else 
System.out.println(dirname+ "is not a directory");	
        }
        }



