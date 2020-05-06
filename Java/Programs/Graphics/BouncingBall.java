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
import java.awt.event.*;
public class BouncingBall extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    static int a=200,b=200; 
    BouncingBall()
    {
        setLayout(new FlowLayout());
        b1=new Button("up");
        b2=new Button("down");
        b3=new Button("left");
        b4=new Button("right");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(600,600);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(a, b, 50, 50);
    }
    public static void main(String args[])
    {
        new BouncingBall();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("up"))
        {
           b=b-120;
           repaint();
        }
        else if(e.getActionCommand().equals("down"))
        {
           b=b+120; 
           repaint();
        }
        else if(e.getActionCommand().equals("left"))
        {
           a=a-120; 
           repaint();
        }
        else if(e.getActionCommand().equals("right"))
        {
           a=a+120; 
           repaint();
        }
    }
}
