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
class TextF extends Frame implements ActionListener,TextListener
{
    TextField t1,t2,t3,t4;
    TextF()
    {
        t1=new TextField();
        add(t1);
        t1.addActionListener((this));
        t1.addTextListener(this);
        t2=new TextField(30);
        add(t2);
        t2.addActionListener(this);
        t2.addTextListener(this);
        t3=new TextField("Hello");
        t3.addTextListener(this);
        //t3.addActionListener(this);
        add(t3);
        t4=new TextField("welcome",30);
        add(t4);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        setTitle("TextField");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
        public void actionPerformed(ActionEvent e)
        {
            
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        t3.setText(String.valueOf(c));
        }
        public void textValueChanged(TextEvent e)
        {
            TextComponent tc = (TextComponent)e.getSource();
            //TextField tc=e.getSource();
            //Object f=e.getSource();
            System.out.println("value : "+e.getSource());
	    String s = tc.getText();
            t4.setText(s);

        }
    
}
public class TextField1 {
    public static void main(String args[])
    {
        new TextF();
    }
    
}
