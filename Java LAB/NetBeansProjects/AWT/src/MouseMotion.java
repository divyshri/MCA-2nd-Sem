import java.awt.*;
import java.awt.event.*;
public class MouseMotion extends Frame implements MouseMotionListener {
    MouseMotion()
    {
        addMouseMotionListener(this);
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseDragged(MouseEvent e)
    {
        Graphics g= getGraphics();
        g.setColor(Color.red);
        g.fillOval(e.getX(),e.getY(), 10, 10);
    }
    public void mouseMoved(MouseEvent e){}
    
    public static void main(String [] args)
    {
        new MouseMotion();
    }
            
}
