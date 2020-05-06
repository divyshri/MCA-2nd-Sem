package Constructor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajesh Reddy
 */
class Obj
{
    int a;
    Obj(int i)
    {
        a=i;
    }
    Obj IBTen()
    {
        Obj temp=new Obj(a+10);
        return temp;
    }
}
public class RetObj {
    public static void main(String args[])
    {
        Obj A=new Obj(2);
        Obj B=A.IBTen();
        System.out.println(" A value is "+A.a);
        System.out.println(" B value is "+B.a);
    }
    
}
