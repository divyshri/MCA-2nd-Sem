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
import java.io.FileInputStream;
public class ReadFileUsingInputStream {

	public static void main(String[] args) {
		File file = null;
		FileInputStream fileInputStream = null;
		try {
			file = new File("filename.txt");
			fileInputStream = new FileInputStream(file);
 			System.out.println("Available bytes in file: "+fileInputStream.available());
			int line;
                        System.out.println("no of characters skipped are "+fileInputStream.skip(2));
			while ((line=fileInputStream.read()) != -1) {
				System.out.print((char)line);
			}
		} catch (Exception e) {
 			e.printStackTrace();
		}finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

