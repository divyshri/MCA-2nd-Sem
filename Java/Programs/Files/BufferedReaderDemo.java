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
class BufferedReaderDemo {
public static void main(String args[]) throws IOException {
FileReader f1=new FileReader("filename.txt");
BufferedReader br=new BufferedReader(f1);
int i;
System.out.print((char)br.read());
System.out.println((char)br.read());
br.mark(10);
System.out.print((char)br.read());
System.out.print((char)br.read());
System.out.println((char)br.read());
br.reset();
System.out.print((char)br.read());
System.out.println((char)br.read());
/*while((i=br.read())!=-1)
    System.out.print((char)i);*/
}
}
