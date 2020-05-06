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
public class DialogExample {  
    private static Dialog d;  
    DialogExample() {  
        Frame f= new Frame();  
        d = new Dialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                d.setVisible(false);  
            }  
        });  
        d.add( new Label ("Click button to continue.")); 
        d.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                d.dispose();
            }
        });
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new DialogExample();  
    }  
}  
    
