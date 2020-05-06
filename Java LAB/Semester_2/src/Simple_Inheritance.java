import java.util.*;
class A
{
    int i,j;
    void showij()
    {
        System.out.println("value of i = " + i + " and value of j = " + j);
    }
}
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("Value of k is =  " + k);
    }
    void sum()
    {
        System.out.println(" Sum of i+j+k is  = " + (i+j+k));
    }
}

public class Simple_Inheritance {
    public static void main(String[] args)
    {
        A superob = new A();
        B subob = new B();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of i and j for class A");
        superob.i = scan.nextInt();
        superob.j = scan.nextInt();
        System.out.println("Enter the value of k for class B");
        subob.k = scan.nextInt();
        superob.showij();
        subob.showk();
        subob.i=10;
        subob.j=20;
        subob.k=30;
        subob.sum();
        
    }
}
