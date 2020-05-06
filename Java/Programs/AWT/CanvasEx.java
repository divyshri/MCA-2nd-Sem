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
public class CanvasEx  
{  
  public CanvasEx()  
  {  
    Frame f= new Frame("Canvas Example");  
    f.add(new MyCanvas());  
    f.setLayout(null);  
    f.setSize(400, 400);  
    f.setVisible(true);  
  }  
  
  public static void main(String args[])  
  {  
    new CanvasEx();  
  }  
}  
class MyCanvas extends Canvas  
{  
        public MyCanvas() {  
        setBackground (Color.GRAY);  
        setSize(1000, 1000);  
     }  
        public void paint(Graphics g)  
  {  
    //g.setColor(Color.red);  
   // g.fillOval(75,75, 150, 75); 
   // g.drawArc(50,50,100,100,90,90);
     // Image i=getImage("LUCKY.JPG");
      Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("LUCKY.JPG");  
      //Image i=getImage(getDocumentBase(),"LUCKY.JPG");
        g.drawImage(i, 120,100,this);  

  }
  
 
}    

