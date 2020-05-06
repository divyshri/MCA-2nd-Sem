/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Rajesh Reddy
 */
class E
{
    E()
    {
        System.out.println("Insides E's Constructor");
    }
}
class F extends E
{
    F()
    {
        System.out.println("Insides F's Constructor");
    }
}
class G extends F
{
    G()
    {
        System.out.println("Insides G's Constructor");
    }
   /* public String toString(){
        return "Dimensions are";
    }*/
}
public class CallingCons {
    public static void main(String args[])
    {
      // Object t =Object clone();
        G g=new G();
        //int n=g.hashCode();
       
       // G g1=new G();
       //boolean t= g1.equals(g1);
     // System.out.println(g);
       // g.getClass();
    }
}
