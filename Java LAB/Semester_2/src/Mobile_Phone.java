import java.util.*;

class Model
{
    String model,color;
    int cost,camera;
    void setData(String M,String C,int price,int Pixel)
    {
            model = M;
            color = C;
            cost = price;
            camera = Pixel;
    }
    void Display()
    {
        System.out.println("Model name is " + model);
        System.out.println("Color is " + color);
        System.out.println("Cost of the phone is " + cost);
        System.out.println("Camera dimenstion is " + camera + " megapixel");   
    }
}

public class Mobile_Phone {
    public static void main(String[] args)
    {       
         Model Samsung = new Model();
         Model Apple = new Model();
         Model Vivo = new Model();
         Samsung.setData("S10+", "Space Black", 67000, 26);
         Apple.setData("10s Max", "White", 142000, 12);
         Vivo.setData("Nex", "Navy Blue", 45000, 20);
         Samsung.Display();
         Apple.Display();
         Vivo.Display();
         
    }
}
