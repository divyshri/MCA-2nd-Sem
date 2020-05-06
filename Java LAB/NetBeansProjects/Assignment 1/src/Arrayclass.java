import java.util.Scanner;
class Array {
        int[] outer =new int[5];
        int [] inner=new int [3];
        Scanner in =new Scanner(System.in);
        Array(){
        System.out.println("Enter 5 element of outer array");
        for(int i=0;i<5;i++)
        {
            outer[i]=in.nextInt();
        }
        System.out.println("Enter 3 element of inner array");
        for(int i=0;i<3;i++)
        {
            inner[i]=in.nextInt();
        }
        }
        boolean Check()
        {   boolean flag=true;
            for(int i=0;i<3;i++)
                for(int j=0;j<5;j++)
                    if(inner[i]==outer[j])
                    {
                        inner[i]=0;
                        break;
                    }
            for(int i=0;i<3;i++)
                if(inner[i]!=0)
                    flag=false;
            return flag;
        }
  }
public class Arrayclass{

    public static void main(String [] args)
    {
        Array a1 =new Array();
        System.out.println(a1.Check());
        Array a2 =new Array();
        System.out.println(a2.Check());
        Array a3 =new Array();
        System.out.println(a3.Check());
        
    }
}