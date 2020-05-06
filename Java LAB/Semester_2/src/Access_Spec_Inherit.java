import java.util.*;
class A1       
{
    int i;
    private int j;
    void setij(int x, int y)
    {
        i=x;
        j=y;
    }
    int getj()
    {
        return j;
    }
}
class B1 extends A1
{
    int k;
    void showk()
    {
        System.out.println("Value of k is =  " + k);
    }
    void sum()
    {
        int a;
        a = getj();
        System.out.println(" value of j is  " + a);
        System.out.println(" Sum of i+j+k is  = " + ((i+k)+getj()));
    }
}

public class Access_Spec_Inherit {
    public static void main(String[] args)
    {
        A1 superob = new A1();
        B1 subob = new B1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of i and j for class A");
        int a,b;
        a= scan.nextInt();
        b= scan.nextInt();
        superob.setij(a, b);
        System.out.println("Enter the value of k for class B");
        subob.k = scan.nextInt();
        //subob.showk();
        //subob.i=10;
        //subob.k=30;
        subob.sum();
        
    }
}
