package semester_2;


public class Test2 extends Test1
{
    int c,d;
    Test2(int i,int j)
    {
        c=i;
        d=j;
    }
    void show2()
    {
        System.out.println("Value of c = " + c + " value of d = " + d);
    }
    void sum()
    {
        System.out.println("Sum is = " + (a+b+c+d));
    }
}
