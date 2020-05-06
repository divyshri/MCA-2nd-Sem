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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamEx {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String fileName = "fops.txt";
        String fileName1= "filename1.txt";
        
        try {
           /* FileOutputStream fos = new FileOutputStream(fileName,true); 
            
            String text = "Today is a beautiful day";
            byte[] mybytes = text.getBytes();
            
            fos.write(mybytes);*/
           FileOutputStream cfos = new FileOutputStream(fileName1);
            
            String text1 = "Today is a beautiful day";
            byte[] mybytes1 = text1.getBytes();
            
            cfos.write(mybytes1);
            cfos.close();

        }
           catch(Exception e){System.out.println(e);}    

    }
}
