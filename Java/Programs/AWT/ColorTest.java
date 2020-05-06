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
public class ColorTest extends Frame {
static public void main(String args[])
{
    ColorTest world=new ColorTest();
    world.show();
}
	private TextField colorDescription=new TextField();
	private Panel colorField=new Panel();
	private Color current=Color.black;
	private Scrollbar redBar=new ColorBar(Color.red);
        private Scrollbar greenBar=new ColorBar(Color.green);
        private Scrollbar blueBar=new ColorBar(Color.blue);
        public ColorTest(){
            setTitle("colr tesr");
            setSize(400,600);
            add("North",colorDescription);
            add("East",makeColorButtons());
            add("Center",colorField);
            add("West",makeScrollBars());
            setFromColor(current);
             addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        }
        private void setFromColor(Color c)
        {
            current =c;
            colorField.setBackground(c);
            redBar.setValue(c.getRed());
            greenBar.setValue(c.getGreen());
            blueBar.setValue(c.getBlue());
            colorDescription.setText(c.toString());
                //int n1=redBar.getValue();
                //int n2=greenBar.getValue();
                //int n3=blueBar.getValue();
           //     setBackground(new Color(i,j,k));

        }
        private void setFromBar(){
            int r=redBar.getValue();
            int g=greenBar.getValue();
            int b=blueBar.getValue();
            setFromColor(new Color(r,g,b));
        }
        private Panel makeColorButtons(){  
        Panel p=new Panel();
        p.setLayout(new GridLayout(4,4,3,3));
        p.add(new ColorButton(Color.black,"black"));
        p.add(new ColorButton(Color.blue,"blue"));
        p.add(new ColorButton(Color.cyan,"cyan"));
        p.add(new ColorButton(Color.darkGray,"darkGray"));
        p.add(new ColorButton(Color.gray,"gray"));
        p.add(new ColorButton(Color.green,"green"));
        p.add(new ColorButton(Color.lightGray,"lightGray"));
        p.add(new ColorButton(Color.magenta,"magenta"));
        p.add(new ColorButton(Color.orange,"orange"));
        p.add(new ColorButton(Color.pink,"pink"));
        p.add(new ColorButton(Color.red,"red"));
        p.add(new ColorButton(Color.white,"white"));
        p.add(new ColorButton(Color.yellow,"yellow"));
        p.add(new BrighterButton(0));
        p.add(new BrighterButton(1));
        Button Quit=new Button("Quit");
        p.add(Quit);
        Quit.addActionListener(new BListener());
        return p;
        }
        private class BListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getActionCommand()=="Quit")
                     System.exit(0);   
            }
                    
         }
        private Panel makeScrollBars()
        {
            Panel p=new Panel();
            p.setLayout(new BorderLayout());
            p.add("West",redBar);
            p.add("Center",greenBar);
            p.add("East",blueBar);
            return p;
         }
        private class BrighterButton extends Button implements ActionListener
        {
            private int index;
            public BrighterButton(int i)
            {
                super(i==0?"brighter": "darker");
                index=i;
                addActionListener(this);
            }
            public void actionPerformed(ActionEvent e)
            {
                if(index==0)
                    setFromColor(current.brighter());
                else
                    setFromColor(current.darker());
                
                
            }
        }
        private class ColorButton extends Button implements ActionListener
        {
            private Color ourColor;
            public ColorButton(Color c,String name)
            {
                super(name);
                ourColor=c;
                addActionListener(this);
            }
            public void actionPerformed(ActionEvent e)
            {
                setFromColor(ourColor);                  
            }
        }
        private class ColorBar extends Scrollbar implements AdjustmentListener
        {
            public ColorBar(Color c)
            {
                super(Scrollbar.VERTICAL,40,0,0,255);
                super.setBackground(c);
                addAdjustmentListener(this);
            }
            public void adjustmentValueChanged(AdjustmentEvent e)
            {
                setFromBar();
                
            }
        }    
}
