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
public class CheckTest extends Frame {
    Checkbox cb=new Checkbox("the checkbox is off");
    public static void main(String args[])
    {
        CheckTest world=new CheckTest();
        world.show();
    }
    public CheckTest()
    {
        setTitle("Check Box Example");
        setSize(300,700);
        cb.addItemListener(new CheckListener());
        add("Center",cb);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
   private class CheckListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(cb.getState())
                cb.setLabel("the checkbox is on");
            else
                cb.setLabel("the checkbox is off");
        }
    }
    
    
}
