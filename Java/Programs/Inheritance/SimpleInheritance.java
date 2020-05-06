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

class A
{
	int i,j;
	void showij() {
	System.out.println("i and j:"+i+" "+j);
	}
        public String toString()
        {
            return getClass().getName();
        }
}
class B extends A
{
	int k;
	void showk() {
	System.out.println("k:"+k);
	}
	void sum(A A1) {
	System.out.println("i+j+k: "+ (A1.i+A1.j+k));
    }
}
public class SimpleInheritance 
{
 public static void main(String args[])
 {
	A superob=new A();
	B subob=new B();
        System.out.println(subob);
	/*superob.i=10;
	superob.j=20;
	System.out.println("Contents of superob:");
	//superob.showij();
	System.out.println();
	//subob.i=7;
	//subob.j=8;
	subob.k=9;
	System.out.println("Contents of subob: ");
	//subob.showij();
	subob.showk();
	System.out.println();
	System.out.println("sum of i,j and k in subob:");
	subob.sum(superob);*/
	}
}
