import java.util.Scanner;

class Area
{
   Area(int a)
   {
       System.out.println("Area of the Square is : " + (a*a));
   }
   Area(int a,int b)
   {
       System.out.println("Area of the Rectangle is : " + (a*b));
   }
   Area(int a,int b,int c)
   {
       System.out.println("Area of the Trapezoid is : " + (((a+b)*c)/2));
   }
}
public class AreaWithParameter {

    public static void main(String[] args) 
    {
        Area A = new Area(10);
        Area B = new Area(10,20);
        Area C = new Area(10,20,30);
    }
}
