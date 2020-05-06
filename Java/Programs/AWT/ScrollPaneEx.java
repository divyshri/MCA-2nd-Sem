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
import java.awt.event.*;
public class ScrollPaneEx extends Frame {
    ScrollPane sp=new ScrollPane();
    Button b=new Button("ok");
    TextArea t1=new TextArea(1000,1000);
    ScrollPaneEx()
    {
        
        sp.add(b);
        sp.add(t1);
        add("Center",sp);
        setSize(200,200);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }
    public static void main(String args[])
    {
        new ScrollPaneEx();
    }
    
    
}
