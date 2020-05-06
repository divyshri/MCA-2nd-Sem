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
public class ButtonEx1 extends Frame implements ActionListener {
    Label l=new Label();
     Button b=new Button("submit");

    ButtonEx1()
    {
        
        l.setBounds(20,20,100,100);
         add(l);
       b.setBounds(500,200,50,50);
        add(b);
        //setLayout(null);
        //b.addActionListener(new ButtonEx1());
        b.addActionListener(this);
        setTitle("Button Example");
        
        setSize(300,300);
        setVisible(true);
    b.setLabel("ok");
    }
     public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getActionCommand());
       // l.setText("action performed successfully");
         l.setText(b.getLabel());
     }
   
   public static void main(String srgs[])
    {
       ButtonEx1 B=new ButtonEx1(); 
    }

}

    

