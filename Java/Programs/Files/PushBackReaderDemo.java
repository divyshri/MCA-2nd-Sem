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
class PushBackReaderDemo {
public static void main(String args[]) throws IOException {
String s = "if (a == 4) a = 0;\n";
char buf[] = new char[s.length()];
s.getChars(0, s.length(), buf, 0);
CharArrayReader in = new CharArrayReader(buf);
PushbackReader f = new PushbackReader(in);
int c;
while ((c = f.read()) != -1) {
switch(c) {
case '=':
if ((c = f.read()) == '=')
System.out.print(".eq.");
else {
System.out.print("<-");
f.unread(c);
}
break;
default:
System.out.print((char) c);
break;
}
}
}
}

