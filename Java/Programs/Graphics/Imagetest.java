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
import java.net.*;
import java.awt.event.*;
//import javax.imageio.ImageIO;
public class Imagetest extends Frame {
    public static void main(String args[])
    {
        Frame world=new Imagetest("Ricky.gif");
        world.show();
    }
    private Image img=null;
    public Imagetest(String filename)
    {
        setSize(600,600);
        setTitle("Image Test");
       // BufferedImage img=ImageIO.read(new File("LUCKY.jpg"));
     //   Image picture;  
   // picture = getImage(getDocumentBase(),"sonoo.jpg");  
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        try{
           // System.out.println("filename"+filename);
            //URL imageAddress=new URL(filename);
            //image=getToolkit().getImage(imageAddress);
           // System.out.println("filename"+image);
              img = Toolkit.getDefaultToolkit().getImage("Room.jpg");

        }
        catch(Exception e)
        {
            img=null;
            System.out.println("filename"+img);
        }
    }
    public void paint(Graphics g)
    {
        if(img!=null)
        g.drawImage(img, 100, 100, this);
        else
            System.out.println("Hi");
    }
    
}
