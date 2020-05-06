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
class StreamTokenizer2 {
public static int words = 0;
public static int lines = 0;
public static int chars = 0;
public static void wc(InputStreamReader isr)
throws IOException {
int c = 0;
boolean lastWhite = true;
String whiteSpace = " \t\n\r";
while ((c = isr.read()) != -1) {
// Count characters
chars++;
// Count lines
if (c == '\n') {
lines++;
}
// Count words by detecting the start of a word
int index = whiteSpace.indexOf(c);
if(index == -1) {
if(lastWhite == true) {
++words;
}
lastWhite = false;
}
else {
lastWhite = true;
}
}
if(chars != 0) {
++lines;
}
}
public static void main(String args[]) {
FileReader fr;
try {
if (args.length == 0) { // We're working with stdin
wc(new InputStreamReader(System.in));
}
else { // We're working with a list of files
for (int i = 0; i < args.length; i++) {
fr = new FileReader(args[i]);
wc(fr);
}
}
}
catch (IOException e) {
return;
}
System.out.println(lines + " " + words + " " + chars);
}
}
