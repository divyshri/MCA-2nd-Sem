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
public class ChoiceTest extends Frame{
    public static void main(String args[])
    {
        ChoiceTest world=new ChoiceTest();
        world.show();
    }
     private String choices[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        private Label display=new Label();
        private Choice theChoice=new Choice();
        private List theList=new List();
        private CheckboxGroup theGroup=new CheckboxGroup();
        private ItemListener theListener=new ChoiceListener();
        public ChoiceTest(){
            setTitle("selection example");
            setSize(300,300);
            for(int i=0;i<10;i++)
            {
                theChoice.addItem(choices[i]);
                theList.addItem(choices[i]);
            }
            theChoice.addItemListener(theListener);
            theList.addItemListener(theListener);
            add("West",makeCheckBoxes());
            add("North",theChoice);
            add("East",theList);
            add("South",display);
            addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        }
   private class ChoiceListener implements ItemListener{
       public void itemStateChanged(ItemEvent e){
           display.setText(theGroup.getSelectedCheckbox().getLabel()+theList.getSelectedItem()+theChoice.getSelectedItem());
   }
}
   private Panel makeCheckBoxes()
   {
       Panel p=new Panel(new GridLayout(5,2));
       for(int i=0;i<10;i++)
       {
           Checkbox cb=new Checkbox(choices[i],theGroup,false);
           cb.addItemListener(theListener);
           p.add(cb);
       }
           return p;
       }
}
   
