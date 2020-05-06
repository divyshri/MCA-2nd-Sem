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
class ButtonEx extends Frame
{
    
    Label l=new Label();
     Button b=new Button("submit");
    /* public void rePaint(Graphics g)  
  {  
    g.setColor(Color.red);  
    g.drawString("welcome to nitw",500, 100);
  }*/

    ButtonEx()
    {
        setLayout(null);
        l.setBounds(50,50,100,100);
         add(l);
       b.setBounds(200,50,50,50);
        add(b);
        b.addActionListener(new A());
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setTitle("Button Example");
        setSize(300,300);
        setVisible(true);
    
    }
    private class A implements ActionListener{
         public void actionPerformed(ActionEvent e) {
        l.setText("action performed successfully");
        
    }
    }
   public static void main(String srgs[])
    {
       ButtonEx B=new ButtonEx(); 
    }

}

