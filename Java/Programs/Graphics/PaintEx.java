/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
public class PaintEx extends Panel
{
    public void paint(Graphics g)
    {
        //g.setXORMode(Color.GRAY);
		g.fillRect(10,10,50,50);
		g.fillRect(20,30,50,50);
		
		/*
		 * To set overwrite mode, use
		 * void setPaintMode()
		 * method of Graphics class.
		 */
		//g.setPaintMode();

        /*int w=getSize().width;
        int midw=w/2;
        g.drawString("XOR Mode", 0, 30);
       
        g.drawOval(7, 37, 50, 50);
        g.setXORMode(Color.blue);
        g.drawOval(17,77,50,50);*/
       // g.setXORMode(Color.blue);
       //for(int i=0;i<15;i+=3)
     //     g.drawOval(10+i,40+i,50,50);
    }
    public static void main(String args[])
    {
        Frame f=new Frame();
        f.add(new PaintEx());
        f.setSize(800,800);
        f.setVisible(true);
        
            
    }
    
}
