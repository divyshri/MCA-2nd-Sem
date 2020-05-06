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
public class DataOut {
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("file.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65); 
        //data.writeBoolean(true);
        data.writeChars(new String("Hai"));
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}   

