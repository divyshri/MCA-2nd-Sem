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
public class PushbackInputStreamDemo {
    public static void main(String args[]) throws IOException
    {
        String s="if (a==4) a=0;\n";
        byte buff[]=s.getBytes();
        ByteArrayInputStream in=new ByteArrayInputStream(buff);
        PushbackInputStream f=new PushbackInputStream(in);
        int c;
        //byte b[]=s.getBytes();
        while((c=f.read())!=-1) {
            switch(c){
                case '=':
                            if((c=f.read())=='=')
                                System.out.print(".eq.");
                            else {
                                System.out.print("<-");
                                f.unread(c);
                            }
                            break;
                default:
                    System.out.print((char)c);
                    break;
            }
        }
       /* while((c=f.read())!=-1) {
           System.out.print((char)c);
        }
        f.unread(b);
        for(int i=0;i<b.length;i++)
        {
            System.out.println("value: "+(char)i);
        }*/
    }
}
    

