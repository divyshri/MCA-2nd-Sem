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
class CanvasEx1 extends Frame { 
      CanvasEx1() 
        { 
           super("canvas"); 
           Canvas c = new Canvas(){
    
     
            public void paint(Graphics g) 
            {
                g.setColor(Color.red); 
                g.setFont(new Font("Bold", 1, 20)); 
                g.drawString("This is a canvas", 100, 100); 
            } 
           };
        c.setBackground(Color.black); 
         add(c); 
        setSize(400, 300); 
        show(); 
    } 
    public static void main(String args[]) 
    { 
        CanvasEx1 c = new CanvasEx1(); 
    } 
} 
