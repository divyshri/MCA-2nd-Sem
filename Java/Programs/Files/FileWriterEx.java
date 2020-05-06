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
public class FileWriterEx {
public static void main(String args[]) throws Exception {
String source = "Now is the time for all good men\n"
+ " to come to the aid of their country\n"
+ " and pay their due taxes.";
char buffer[] = new char[source.length()];
source.getChars(0, source.length(), buffer, 0);
FileWriter f0 = new FileWriter("file1.txt");
for (int i=0; i < buffer.length; i += 1) {
f0.write(buffer[i]);
}
f0.close();
FileWriter f1 = new FileWriter("file2.txt");
f1.write(buffer);
f1.close();
FileWriter f2 = new FileWriter("file3.txt");
f2.write(buffer,buffer.length-buffer.length/4,buffer.length/4);
f2.close();
}
}
