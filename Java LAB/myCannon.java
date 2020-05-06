import java.awt.*;
import java.awt.event.*;

public class myCannon extends Frame implements AdjustmentListener,ActionListener {
	
	final int framew=500;
	final int frameh=500;
	int angle=0;
	int x1=300,y1=frameh/2;
	double xg=20.0;
	double yg=frameh/2;
	String msg=new String();
	Scrollbar sb;
	Button b;
	Label l;
	int flag=0;
	myCannon()
	{
		setSize(framew,frameh);
		sb=new Scrollbar(Scrollbar.VERTICAL,angle,5,-180,180);
		add("East",sb);
		b=new Button("Fire");
		add("North",b);
		l=new Label("All the best for hit");
		add("South",l);
		b.addActionListener(this);
		sb.addAdjustmentListener(this);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
	}
	public void paint(Graphics g)
	{
		angle=sb.getValue();
		msg="Angle "+angle;
		double radianAngle=angle*Math.PI/180.0;
		g.drawLine(20, frameh/2, (int)(20+30*Math.cos(radianAngle)),(int)(frameh/2-30*Math.sin(radianAngle)));	
		g.drawLine(20, frameh/2+5, (int)(20+30*Math.cos(radianAngle)),(int)(frameh/2-30*Math.sin(radianAngle))+5);
		g.drawLine(20, frameh/2,20, frameh/2+5);
		g.drawLine((int)(20+30*Math.cos(radianAngle)),(int)(frameh/2-30*Math.sin(radianAngle)), 
				(int)(20+30*Math.cos(radianAngle)),(int)(frameh/2-30*Math.sin(radianAngle))+5);
		g.drawString(msg,300,100);
		g.setColor(Color.red);
		g.fillOval((int)xg, (int)yg,20,20);
		g.setColor(Color.green);
		g.fillRect(x1, y1, 100, 20);
		
		if(flag==1)
		try{
			Thread.sleep(100);
			xg=xg+10*Math.cos(radianAngle);
			yg-=10*Math.sin(radianAngle);
			if(xg>=x1 && xg<x1+100 && yg>=y1 &&yg<y1+20)
			{
				l.setText("You hit it");
				flag=0;
				xg=20;
				yg=frameh/2;
			}
			if(xg<0 || yg<0 ||xg>framew ||yg>frameh)
			{
				l.setText("Missed");
				flag=0;
				xg=20;
				yg=frameh/2;
			}
			repaint();
		}
		catch(Exception ex){
			
		}
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		flag=0;
		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		flag=1;
		repaint();
	}
	public static void main(String args[])
	{
		new myCannon();
	}
}
