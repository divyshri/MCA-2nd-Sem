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
	class OnlyExt implements FilenameFilter		{
	String ext;
	OnlyExt(String ext) {
	this.ext=ext;
	}
	public boolean accept(File dir, String name) {
	return name.endsWith(ext);
}
}
public class DirListOnly	{
	public static void main(String str[])
	{
	String dirname="g:/P1";
	File f1=new File(dirname);
	FilenameFilter only=new OnlyExt("java");
	String s[]=f1.list(only);
	for(int i=0;i<s.length;i++)	{
	System.out.println(s[i]);
}	} 
}



