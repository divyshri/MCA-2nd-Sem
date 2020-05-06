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
public class CharArrayWriterDemo {
public static void main(String args[]) throws IOException {
CharArrayWriter f = new CharArrayWriter();
String s = "This should end up in the array";
char buf[] = new char[s.length()];
s.getChars(0, s.length(), buf, 0);
f.write(buf);
System.out.println("Buffer as a string");
System.out.println(f.toString());
System.out.println("Into array");
char c[] = f.toCharArray();
for (int i=0; i<c.length; i++) {
System.out.print(c[i]);
}
System.out.println("\nTo a FileWriter()");
FileWriter f2 = new FileWriter("test.txt");
f.writeTo(f2);
f2.close();
System.out.println("Doing a reset");
f.reset();
for (int i=0; i<3; i++)
f.write('A');
System.out.println(f.toString());
}
}  

