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
public class Simple extends Frame
{
    Simple()
    {
       Label l=new Label("enter your name");
        //l.setLocation(100,200);
        //add(l);
        
        add("East",l);
       // setLocation(400,0);
        Label l1=new Label();
        l1.setText("Enter clg name");
        //l1.setLocation(0,200);
        //l1.setForeground(Color.RED);
        //l1.setBackground(Color.GREEN);
        //add(l1);
       add("West",l1);
       //setBackground(Color.YELLOW);
       setTitle("First Example");
      // setLayout(null);
       setResizable(false);
       System.out.println("Label Name is: "+l.getText());
        setSize(600,600);
        setVisible(true);
    }           
    public static void main(String [] args)
    {
       Simple s=new Simple();
    }
}
/*Frame f=new Frame("Example");
       Panel p=new Panel();
       p.setLayout(new GridLayout(4,4,3,3));
   // Button b=new Button("submit");
     p.add(new Button("1"));
     p.add(new Button("2"));
     p.add(new Button("3"));
     p.add(new Button("4"));
     p.add(new Button("5"));
     p.add(new Button("6"));
     p.add(new Button("7"));
     p.add(new Button("8"));
     p.add(new Button("9"));
     p.add(new Button("10"));
     p.add(new Button("11"));
     p.add(new Button("12"));
     p.add(new Button("13"));
     p.add(new Button("14"));
     p.add(new Button("15"));
     p.add(new Button("submit"));
     p.add(new Button("clear"));
     f.add(p);
    // f.setTitle("Example");
     f.setSize(500,500);
     f.show();
     //f.toFront();
    // f.toBack();
      //f.setVisible(true);
      System.out.println("size of window is "+f.getSize());*/
       //Button b=new Button("submit");
       //Label l=new Label("name");
      /* Frame f=new Frame("Ex");
       Frame f1=new Frame("Ex1");
       f.setSize(500,500);
         f.setVisible(true);
       f1.setSize(500,500);
         f1.setVisible(true);
       f1.add(f);*/
       
      // CardLayout lm=new CardLayout();
   // Panel p=new Panel(lm);
    //f.add(p);
    //p.add("one",new Label("Number one"));
    //p.add("Two",new Label("Number Two"));
    //p.add("Three",new Label("Number Three"));
    //lm.show(p,"Two");
        // f.setSize(500,500);
         //.setVisible(true);

    

   //}

    
//}
   
