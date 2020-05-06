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
public class DialogTest extends Frame implements ActionListener{
    public static void main(String args[])
    {
        DialogTest world=new DialogTest();
        world.show();
    }
        private TextArea display=new TextArea();
        Button b=new Button("Make Dialog");
        private Checkbox cb=new Checkbox("Modal Dialog?");
        Button b4=new Button("Hide");
                Button b1=new Button(""+1);
                Button b2=new Button(""+2);
                 Button b3=new Button(""+3);
                // Button b4=new Button("Hide");
        public DialogTest()
        {
            setTitle("Dialog Test Program");
            setSize(300,200);
            cb.setBounds(1000,700,100,50);
            add(cb);
            b.setBounds(1000,100,100,50);
            add(b);
           display.setBounds(50,50,300,300);                     
           add(display);

           
            b.addActionListener(this);
            b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
            addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e)
{
    dispose();
}});
        }
            private void makeDialog(boolean modalFlag)
            {
                
                final Dialog dlg=new Dialog(this,modalFlag);
                dlg.setSize(400,400);
                dlg.setLocation(600,600);
                dlg.add("North",b1);
                dlg.add("West",b2);
                dlg.add("East",b3);
                dlg.add("South",b4);
                dlg.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent we)
                    {
                       // dlg.setVisible(false);
                        dlg.dispose();
                    }
                });
                
               
                b4.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        
                        System.out.println("hai");
                        dlg.setVisible(false);
                    }
                });
                dlg.show();
            }
            public void actionPerformed(ActionEvent e)
            {
                Button button=(Button)e.getSource();
               
                if(e.getActionCommand().equals("Make Dialog"))
                {
                    makeDialog(cb.getState());
                }
                else 
                {
                    display.append("Button "+button.getLabel()+" pressed\n");
                }
            }     
        }
       

