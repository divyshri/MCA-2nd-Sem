import java.util.Scanner;
public class MobilePhone {
    Scanner in =new Scanner(System.in);
    String phonemodel,phonecolor;
    int cost, camerapixel;
    MobilePhone(){
        System.out.println("Enter phone details: ");
        System.out.println("Enter phone Model: ");
        phonemodel=in.nextLine();
        System.out.println("Enter phone Color: ");
        phonecolor=in.nextLine();
        System.out.println("Enter phone's Cost: ");
        cost=in.nextInt();
        System.out.println("Enter phone's Camera Pixel: ");
        camerapixel=in.nextInt();
    }
    
    void Disp()
    {
        System.out.println("Phone has following details");
        System.out.println("Phone Model: "+ phonemodel);
        System.out.println("Phone Color: "+ phonecolor);
        System.out.println("Phone Cost: "+ cost);
        System.out.println("Phone Camerapixel: "+ camerapixel);
        
    }
    
    public static void main(String [] args)
    {
        MobilePhone Samsung =new MobilePhone();
        MobilePhone Redmi = new MobilePhone();
        Samsung.Disp();
        Redmi.Disp();
    }
}
