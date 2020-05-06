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
class QuitItem implements ActionListener{
    public QuitItem(Frame application)
    {
        MenuBar mBar=new MenuBar();
        application.setMenuBar(mBar);
        Menu menu=new Menu("Quit");
        mBar.add(menu);
        MenuItem mItem=new MenuItem("Quit");
        mItem.addActionListener(this);
        menu.add(mItem);
    }
    public QuitItem(Menu menu)
    {
        MenuItem mItem=new MenuItem("Quit");
        mItem.addActionListener(this);
        menu.add(mItem);
    }
    public QuitItem(MenuBar mBar)
    {
        Menu menu=new Menu("Quit");
        mBar.add(menu);
        MenuItem mItem=new MenuItem("Quit");
        mItem.addActionListener(this);
        menu.add(mItem);
    }
    public QuitItem(MenuItem mItem)
    {
        mItem.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
public class ColorTest1 extends Frame{
    
    public ColorTest1()
    {
        MenuBar m=new MenuBar();
        setMenuBar(m);
        Menu menu=new Menu("Quit");
        m.add(menu);
        MenuItem mItem=new MenuItem("Quit");
        menu.add(mItem);
        setVisible(true);
        setSize(600,600);
        //new QuitItem(m);
        //new QuitItem(this);
       // new QuitItem(menu);
        new QuitItem(mItem);
    }
    public static void main(String args[])
    {
        new ColorTest1();
    }
    
}
