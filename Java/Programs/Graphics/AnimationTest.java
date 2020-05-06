package Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class AnimationTest extends Frame {
    public static void main(String args[])
    {
        Frame world=new AnimationTest();
        world.show();
    }
    private Image[] imageArray;
    private int index=0;
    public AnimationTest(){
        setSize(800,800);
        setTitle("Simple Animation");
        imageArray=new Image[5];
        String name[]={"T1.jpg","T2.jpg","T3.jpg","T4.jpg","T5.jpg"};
        for(int i=0;i<5;i++)
        {
            //String name="T"+(i+1)+".jpg";
            try{
                             System.out.println("name: "+name[i]);
                              imageArray[i] = Toolkit.getDefaultToolkit().getImage(name[i]);
                              System.out.println("try executed");
            }
            catch(Exception e)
            {
                System.out.println("catch excecuted");
                imageArray[i]=null;
            }
        }
    }
    public void paint(Graphics g)
    {
        if(imageArray[index]!=null)
        {
            g.drawImage(imageArray[index++], 0, 0, this);
        }
        if(index>=imageArray.length)
            index=0;
        try{
            
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
           
        
        }
         repaint();
    }
    public void update(Graphics g)
    {
        paint(g);
    }
    
}
