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
public class CharArrayReaderEx {
public static void main(String args[]) throws IOException {
String tmp = "abcdefghijklmnopqrstuvwxyz";
int length = tmp.length();
//char c[] = new char[length];
//tmp.getChars(0, length, c, 0);
char c[]=tmp.toCharArray();
CharArrayReader input1 = new CharArrayReader(c);
CharArrayReader input2 = new CharArrayReader(c, 0, 5);
int i;
System.out.println("input1 is:");
while((i = input1.read()) != -1) {
System.out.print((char)i);
}
System.out.println();
System.out.println("input2 is:");
while((i = input2.read()) != -1) {
System.out.print((char)i);
}
System.out.println();
}
}

