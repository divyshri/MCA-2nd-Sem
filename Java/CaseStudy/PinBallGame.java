/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaseStudy;

/**
 *
 * @author Rajesh Reddy
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class PinBallGame extends Frame{
    public static void main(String args[])
    {
       world=new PinBallGame();
       world.show();
    }
    private int score;
    private Label scoreLabel;
    public static final int FrameWidth=400;
    public static final int FrameHeight=400;
    public static PinBallGame world;
    private Vector balls;
    private Vector targets;
    public PinBallGame()
    {
        setTitle("PinBall Construction kit");
        setSize(FrameWidth,FrameHeight);
        balls=new Vector();
        addMouseListener(new MouseKeeper());
        score=0;
        scoreLabel=new Label("Score=0");
        add("North",scoreLabel);
        targets=new Vector();
        targets.addElement(new Wall(30,50,2,350));
        targets.addElement(new Wall(30,50,360,2));
        targets.addElement(new Wall(390,50,2,380));
        targets.addElement(new Hole(100,100));
        targets.addElement(new ScorePad(150,220,100));
        targets.addElement(new Peg(300,140,200));
        targets.addElement(new Spring(120,350));
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }
    private class MouseKeeper extends MouseAdapter{
        private PinBallTarget element;
        public void mousePressed(MouseEvent e){
            int x=e.getX();
            int y=e.getY();
            if((x>FrameWidth-40)&&(y>FrameHeight-40)){
                PinBall newBall=new PinBall(x,y);
                balls.addElement(newBall);
                Thread newThread=new PinBallThread(newBall);
                newThread.start();    
            }
            if(x<40)
            {
                switch(y/40){
                    case 2: 
                        element=new Hole(0,0);
                            break;
                    case 3: element=new Peg(0,0,100);
                            break;
                    case 4: element=new Peg(0,0,200);
                            break;
                    case 5: element=new ScorePad(0,0,100);
                            break;
                    case 6: element=new ScorePad(0,0,100);
                            break;
                    case 7: element=new Spring(0,0);
                            break;
                    case 8: element=new Wall(0,0,2,15);
                            break;
                }
            }
        }
        public void mouseReleased(MouseEvent e)
        {
            int x=e.getX();
            int y=e.getY();
            if((element!=null)&&(x>50))
            {
                element.moveTo(x, y);
                targets.addElement(element);
                repaint();
            }
        }
    }
    private class PinBallThread extends Thread{
            private Ball theBall;
            public PinBallThread(Ball aBall)
            {
                theBall=aBall;
            }
            public void run(){
                while(theBall.y()<FrameHeight){
                    theBall.move();
                    for(int j=0;j<targets.size();j++)
                    {
                        PinBallTarget target=(PinBallTarget)targets.elementAt(j);
                        if(target.intersects(theBall))
                            target.hitBy(theBall);
                    }
                    repaint();
                    try{
                        sleep(100);
                    }
                    catch(InterruptedException e)
                    {
                        System.exit(0);
                    }
                }
            }
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(FrameWidth-40, FrameHeight-40, 30,30);
        g.setColor(Color.red);
        g.fillOval(FrameWidth-40,FrameHeight-40, 30, 30);
        for(int i=0;i<balls.size();i++)
        {
            PinBall aBall=(PinBall)balls.elementAt(i);
            aBall.paint(g);
        }
        for(int j=0;j<targets.size();j++)
        {
            PinBallTarget target=(PinBallTarget)targets.elementAt(j);
            target.paint(g);
        }
    }
    synchronized public void addScore(int v)
    {
        score =score+v;
        scoreLabel.setText("Score = "+score);
    }
    
}
    

