/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVI
 */
import java.applet.*;
import java.awt.*;
public class HutDraw extends Frame{
    HutDraw()
    { 
       setForeground(Color.red); 
       setVisible(true);
       setLayout(null);
       setSize(500,500);
    }
    public void paint(Graphics g)
    {
        g.drawLine(50,300,240,300);
        g.drawLine(80,300,80,170);              
        g.drawLine(200,300,200,170); 	       
        g.drawLine(50,170,140,110); 	     		
        g.drawLine(140,110,230,170);             	
        g.drawLine(50,170,230,170);                         
        g.drawLine(110,220,110,300);	       	
        g.drawLine(170,220,170,300); 	       
        g.drawLine(110,220,170,220);
        g.drawOval(130,240, 20, 20);
        g.drawOval(130,270, 20, 20);
        
    }
    public static void main(String [] args)
    {
        new HutDraw();
    }
}
