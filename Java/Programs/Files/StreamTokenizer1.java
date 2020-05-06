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
   
public class StreamTokenizer1{
public static int words=0;
public static int lines=0;
public static int chars=0;
public static void wc(Reader r) throws IOException {
  
StreamTokenizer tok = new StreamTokenizer(r);
tok.resetSyntax();
tok.wordChars(33, 255);
tok.whitespaceChars(0, ' ');
tok.eolIsSignificant(true);
while (tok.nextToken() != StreamTokenizer.TT_EOF) {
switch (tok.ttype) {
case StreamTokenizer.TT_EOL:
lines++;
chars++;
break;
case StreamTokenizer.TT_WORD:
words++;
default: // FALLSTHROUGH
chars += tok.sval.length();
break;
}

}
if(chars!=0)
    lines++;
chars=chars+words-lines;
}
public static void main(String args[]) {
//if (args.length == 0) { // We're working with stdin
try {
    File f=new File("file2.txt");
    FileReader f1=new FileReader(f);
    wc(f1 );
System.out.println(lines + " " + words + " " + chars);
} catch (IOException e) {};
} 
}

