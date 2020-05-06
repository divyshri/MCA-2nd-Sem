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
public class FocusEx extends Frame implements FocusListener {
    Label l1=new Label("Listener in action: FocusListener");
    Label l2=new Label();
    
   
    TextField t1=new TextField("Hello");
     Button b1=new Button("ok");
   // Button b2=new Button("Cancel");
    FocusEx()
    {
    add("North",l1);
    
    add("West",t1);
    add("Center",l2);
    add("East",b1);
    
    t1.addFocusListener(this);
    b1.addFocusListener(this);
    addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
    //setLayout(null);
    setVisible(true);
    setSize(800,800);
    }
    public void focusGained(FocusEvent e) {
        //System.out.println("Hai");
       /* if(e.getSource()==b1)
         l2.setText(b1.getLabel()+ " gained focus. ");
        if(e.getSource()==b2)
            l2.setText(b1.getLabel()+ " gained focus. ");*/
                         l2.setText(l2.getText() 
         +e.getComponent().getClass().getSimpleName() + " gained focus. ");
            
        
    }
    public void focusLost(FocusEvent e) {
        /*if(e.getSource()==b1)
         l2.setText(b1.getLabel()+ " lost focuss ");
        if(e.getSource()==b2)
            l2.setText(b1.getLabel()+ " lost focus. ");*/
          
                
       // System.out.println("Hello");
                 l2.setText(l2.getText() 
         +e.getComponent().getClass().getSimpleName() + " lost focus. ");


    }
    public static void main(String args[])
    {
        new FocusEx();
    }
    
}
