/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Rajesh Reddy
 */
    import java.util.Random;
public class HandleError {


public static void main(String args[]) {
int a=0, b=0, c=0;
Random r = new Random();
for(int i=0; i<10; i++) {
try {
b = r.nextInt();
c = r.nextInt();
a = 12345 / (b/c);
} catch (ArithmeticException e) {
//System.out.println("Division by zero.");
    System.out.println("Exception occured: "+e);
a = 0; // set a to zero and continue
}
System.out.println("a: " + a);
}
}
}


