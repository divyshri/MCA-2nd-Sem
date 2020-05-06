import java.util.Scanner;

class Car
{
   Car()
   {
       System.out.println("Type : Car");
   }
   void VehicleType()
   {
       System.out.println("Vehicle Type: Car");
   }
}
class Maruti extends Car
{
    Maruti()
    {
        System.out.println("Type : Maruti");
    }
    void Brand()
    {
        System.out.println("Brand : Maruti");
    }
    void Speed()
    {
        System.out.println("Speed : 100km/hr");
    }
}
class Maruti800 extends Maruti
{
    Maruti800()
    {
        System.out.println("Type : Maruti800");
    }
    void Speed()
    {
        System.out.println("Speed of Maruti800 : 80km/hr");
    }
}
public class CarMultilevel {

    public static void main(String[] args) {
       Maruti800 Sup = new Maruti800();
       Sup.Speed();
       Maruti M = new Maruti();
       Maruti800 X = new Maruti800();
       //M=X;
       M.Speed();
    }
}
