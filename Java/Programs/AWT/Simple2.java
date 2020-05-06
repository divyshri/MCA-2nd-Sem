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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Simple2{
    Simple2()
    {
        final Frame f=new Frame();
        f.setTitle("First Example");
        f.setSize(300,300);//frame size 300 width and 300 height  
        //setResizable(false);
       // f.setLayout(new FlowLayout());//no layout manager  
        f.setVisible(true);//now frame will be visible, by default not visible 
        Button b=new Button("ok");
        f.setLocation(500,500);
        f.add(b);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w)
            {
                f.dispose();
            }});
    }
    public static void main(String [] args)
   {
       Simple2 s=new Simple2();
   }
}


