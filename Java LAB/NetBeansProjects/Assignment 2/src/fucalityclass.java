/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sonali
 */
import java.util.*;
 class faculty
 {
     String name, desgination;
     faculty(String name ,String desgination)
     {
         this.name=name;
         this.desgination=desgination;
     }
     
 }
class computerscience extends faculty
{
     String subject;
     computerscience(String name ,String desgination,String subject )
     {
         super(name ,desgination);
         this.subject=subject;  
         System.out.println("name of faculty is ::" +name);
        System.out.println("designaton of faculty isb ::" +desgination);
       System.out.println("subject of faculty is ::" +subject);
        
     }
    
}
 public class fucalityclass 
{ 
    public static void main(String args[])
    { Scanner in =new Scanner (System.in);
    System.out.println("enter name");
        String  name =in.nextLine();
         System.out.println("enter desgination");
    String designation=in.nextLine();
     System.out.println("enter subject");
      String subject =in.nextLine();
    computerscience ch= new computerscience(name ,designation,subject);
    
    }
     
}
