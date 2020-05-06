package Files;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh Reddy
 */
import java.io.*;
public class FileReaderEx {
public static void main(String args[]) throws Exception {
FileReader fr = new FileReader("output.txt");
//BufferedReader br = new BufferedReader(fr);
//String s;
int ch;
while((ch = fr.read()) != -1) {
System.out.print((char)ch);
}
fr.close();
}
}
