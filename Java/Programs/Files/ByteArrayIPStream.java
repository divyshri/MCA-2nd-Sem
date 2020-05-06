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
public class ByteArrayIPStream {
    public static void main(String args[]) throws IOException {
            String tmp="abcdefghijklmn";
            byte b[]=tmp.getBytes();
            ByteArrayInputStream i1=new ByteArrayInputStream(b);
            ByteArrayInputStream i2=new ByteArrayInputStream(b,0,3);
            //for(int i=0;i<2;i++)
            //{
                int c;
                while((c=i2.read())!=-1) {
                //    if(i==0) {
                        System.out.print((char) c);
                }
                  //  }
                //    else {
                  //      System.out.print(Character.toUpperCase((char) c));
                    //}
           //        }
               // System.out.println();
           //         i1.reset();
                    
            //}
            /*for(int i=0;i<2;i++)
            {
                int c;
             while((c=i2.read())!=-1) {
                    if(i==0) {
                        System.out.print((char) c);
                    }
                    else {
                        System.out.print(Character.toUpperCase((char) c));
                    }
                   }
             System.out.println();
                    i2.reset();
            }*/
    }
}
