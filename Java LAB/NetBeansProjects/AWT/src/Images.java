/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVI
 */
import java.awt.*;  
import java.applet.*;  
  
public class Images extends Applet{
    Image picture;  
  
  public void init() {  
    picture = getImage(getDocumentBase(),"IMG-20190417-WA0000.jpg");  
  }  
    
  public void paint(Graphics g) {  
    g.drawImage(picture, 1000,1000, this);  
  }  
}
