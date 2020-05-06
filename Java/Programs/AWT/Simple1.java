/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
public class Simple1 extends Frame{
    Simple1()
    {
        setTitle("First Example");
        setSize(300,300);//frame size 300 width and 300 height  
        //setResizable(false);
        setLayout(null);//no layout manager  
        setVisible(true);//now frame will be visible, by default not visible  
    }
    public static void main(String [] args)
   {
       Simple1 s=new Simple1();
   }
}

