import java.awt.*;
import java.awt.event.*;
public class CreatingButton extends Frame{
    String msg="";
     TextField tf=new TextField("hello"); 
   CreatingButton(){
        
        Frame f= new Frame("Button Example");
        Button b= new Button("ok");
        
        b.setBounds(50,50,40,30);
        b.setSize(50,50);
         
        tf.setBounds(100,50,170,20);  
        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
        f.add(tf);
       b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEve
        nt ae){  
tf.setText("ok");  
}  
});
   } 
    
    
    public static void main (String [] args)
    {
        CreatingButton b1= new CreatingButton();
    }
}
