/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Divyanshu
 */
public class MultipleCatchBlock2 {  
  
    public static void main(String[] args) {  
          
           try{    
                String a = "DIVYANSHU";    
                char f = a.charAt(11);    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(StringIndexOutOfBoundsException e)  
                  {  
                   System.out.println("StringIndexOutOfBounds Exception occurs");  
                  }    
    }  
} 