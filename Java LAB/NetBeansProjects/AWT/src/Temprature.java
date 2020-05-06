import java.awt.*;
import java.awt.event.*;
public class Temprature extends Frame implements ActionListener{
    TextField tf1,tf2;  
    Button b1,b2; 
    Label l,l2;
    Temprature()
           
    {   tf2=new TextField();
        l=new Label("Degrees");
        l.setBounds(50, 100,70, 30);
        tf1=new TextField();
        tf1.setBounds(150,100,100,30);
        b1=new Button("To Celcius");
        b1.setBounds(80,200,100,30);
        b2=new Button("To Fahrenheit");
        b2.setBounds(200,200,100,30);
        l2=new Label("Result:");
        l2.setBounds(150,240,100,30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l);
        add(tf1);
        add(b1);
        add(b2);
        add(l2);
        add(tf2);
        
        setVisible(true);
        setLayout(null);
        setSize(600,600);
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String s=tf1.getText();
            int tf=Integer.parseInt(s);
            double tc=(tf-32)*(5/9);
            l2.setText("Result: "+tc);
        }
        if(e.getSource()==b2)
        {
            String s=tf1.getText();
            int tc=Integer.parseInt(s);
            double tf=tc*(9/5)+32;
            l2.setText("Result: "+tf);
        }

    }
    public static void main(String [] args)
    {
        new Temprature();
    }
}
