/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVI
 */
import java.awt.*;
import java.awt.event.*;
public class GraphicalShapeUsingButton extends Frame implements ActionListener {
    Button b1,b2,b3,b4,b5;
    Button btn;
    GraphicalShapeUsingButton()
    {
        b1=new Button("Rectangle");
        b2=new Button("Circle");
        b3=new Button("Triangle");
        b4=new Button("Trapzoid");
        b5=new Button("Rhombus");
        btn =new Button("Rhombus");
        b1.setBounds(50, 80, 70, 30);
        b2.setBounds(140,80,70,30);
        b3.setBounds(230, 80,70,30);
        b4.setBounds(320 ,80 ,70 ,30);
        b5.setBounds(410, 80, 70, 30);
        btn.setBounds(410,80,70,30);
        add(b1);add(b2);add(b3);add(b4);
        add(b5);
        add(btn);
        setVisible(true);
        setLayout(null);
        setSize(1000,1000);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Graphics g= getGraphics();
        g.setColor(Color.blue);
        if(e.getSource()==b1)
        {
            g.drawRect(200,200, 150, 120);
        }
        if(e.getSource()==b2)
        {
            g.drawOval(400, 200, 100, 100);
        }
        if(e.getSource()==b3)
        {
            g.drawLine(520, 350, 600, 200);
            g.drawLine(600, 200, 680, 350);
            g.drawLine(520, 350, 680, 350);
        }
        if(e.getSource()==b4)
        {
            int xpoints[] = {100, 200, 250, 50};
		int ypoints[] = {400, 400, 450, 450};
		int num = 4; 
		g.drawPolygon(xpoints, ypoints, num);
        }
        if(e.getSource()==b5)
        {
            int xpoints[] = {300, 400, 430, 330};
		int ypoints[] = {450, 450, 500, 500};
		int num = 4; 
		g.drawPolygon(xpoints, ypoints, num);
        }
        
    }
    public static void main(String [] args)
    {
        new GraphicalShapeUsingButton();
    }
}
