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
public class PipedExUsingThread {
public static void main(String args[])throws Exception{  
final PipedOutputStream pout=new PipedOutputStream();  
final PipedInputStream pin=new PipedInputStream(pout,3);  
  
//pout.connect(pin);//connecting the streams  
//creating one thread t1 which writes the data  
Thread t1=new Thread(){  
public void run(){  
for(int i=65;i<=90;i++){  
try{  
pout.write(i);  
Thread.sleep(500);  
}catch(Exception e){}  
}  
}  
};  
//creating another thread t2 which reads the data  
Thread t2=new Thread(){  
public void run(){  
try{   
for(int i=65;i<=90;i++)  
System.out.println(pin.read());  
}catch(Exception e){}  
}  
};  
//starting both threads  
t1.start();  
t2.start();  
}}  

   
