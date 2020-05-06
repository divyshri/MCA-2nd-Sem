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
public class FontTest  extends Frame{
    public static void main(String args[])
    {
        Frame window=new FontTest();
        window.show();
        //System.out.println(Font.BOLD);
    }
    private int style=0;
    private int size=15;
    private String fontName="Helvetica";
    public FontTest()
    {
        setTitle("Font Test");
        setSize(600,150);
        add("East",makeStyles());
        add("South",makeNames());
        //add("Center",new SizeBox());
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        
    }
    private void display()
    {
        repaint();
    }
    public void paint(Graphics g)
    {
        Font f=new Font(fontName,style,size);
        g.setFont(f);
        FontMetrics fm=g.getFontMetrics();
        g.drawString(f.toString(), 5, 10+2*fm.getHeight());
    }
    private Panel makeStyles(){
        Button b=new Button("Quit");
        Panel p=new Panel();
        p.setLayout(new GridLayout(4,1));
        p.add(new StyleBox(Font.ITALIC,"italic"));
        p.add(new StyleBox(Font.BOLD,"bold"));
        p.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
             System.exit(0);
            }
        });
        return p;
            }
    private class StyleBox extends Checkbox implements ItemListener
            {
                private int modifiers;
                public StyleBox(int m,String name)
                {
                    super(name);
                    addItemListener(this);
                    modifiers=m;
                }
                public void itemStateChanged(ItemEvent e)
                {
                    if(getState())
                        style|=modifiers;
                    else
                        style&=~modifiers;
                    display();
                  }
    }
    private class SizeBox extends TextField implements ActionListener
    {
    public SizeBox()
    {
        super(""+size);
        
        addActionListener(this);
    }
        public void actionPerformed(ActionEvent e)
        {
            String sz=getText();
            size=(new Integer(sz).intValue());
            display();
        }
    }
    private class NameBox extends Checkbox implements ItemListener{
        public NameBox (String name, CheckboxGroup cg)
        {
            super (name, cg, false);
            addItemListener(this);
        }
        public void itemStateChanged(ItemEvent e)
        {
            fontName=getLabel();
            display();
            
            
        }
    }
    private Panel makeNames()
    {
        Panel p=new Panel();
        p.setLayout(new GridLayout(1,6));
        CheckboxGroup cg=new CheckboxGroup();
        p.add(new NameBox("Courier",cg));
        p.add(new NameBox("Dialog",cg));
        p.add(new NameBox("DialogInput",cg));
        p.add(new NameBox("Helvetica",cg));
        p.add(new NameBox("TimesRoman",cg));
        p.add(new NameBox("Symbol",cg));
        return p;
        
    }
}
