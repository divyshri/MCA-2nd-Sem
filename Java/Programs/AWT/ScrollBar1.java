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
class ScrollBar1 extends Frame{ 
    Scrollbar s=new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);
    Label label = new Label();
     ScrollBar1(){  
            setTitle("Scrollbar Example");  
            label.setBounds(400,100,50,100);
            //label.setAlignment(Label.CENTER);  
            label.setSize(400,100);  
              
            s.setBounds(100,100, 50,100);  
            add(s);
            add(label);   
            setSize(400,400);  
            setLayout(null);  
            setVisible(true);
            addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
            s.addAdjustmentListener(new AdjustmentListener() {  
                public void adjustmentValueChanged(AdjustmentEvent e) {  
                   label.setText("Vertical Scrollbar value is:"+ s.getValue());  
                }  
            });  
         }  
public static void main(String args[]){  
new ScrollBar1();  
}  
}  
