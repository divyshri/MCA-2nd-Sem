/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonali
 */
class car
{
   public void speed()
   {
       System.out.println("this is default mathod");
   }
  public  void dispaly()
   {
       System.out.println(" vehicle type is car");
   }
  public void brand(){}
  public void speed(int x){}

    void brand(String _maruti_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
class maruti extends car
{  
   public   void brand(String name)
     {
         System.out.println(" brand of speed is " +name);
     }
   public void speed(int x)
    {
        System.out.println(" speed of maruti is " +x);
    }
}
class maruti800 extends car
{
     public void brand(String name)
     {
         System.out.println(" brand of speed is " +name);
     }
   public void speed(int x)
    {
        System.out.println("speed of maruti 800 is" +x);
    }
}
public class dynamicdispatch  {
    public static void main(String args[])
    {
         car obj=new car();
         obj.speed();
         obj.dispaly();
         
        car obj1=new maruti();  
         obj1.speed(56);
         obj1.brand(" maruti +");
         car obj2=new maruti800();
         obj2.brand("maruti2000 ");
         obj.speed(78);
         
    }
}
