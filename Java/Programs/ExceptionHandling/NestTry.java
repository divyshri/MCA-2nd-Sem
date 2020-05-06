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
class NestTry {
public static void main(String args[]) {
try {
int a = args.length;
/* If no command-line args are present,
the following statement will generate
a divide-by-zero exception. */
int b = 42 / a;
System.out.println("a = " + a);
try { // nested try block
if(a==1) a = a/(a-a); // division by zero
if(a==2) {
int c[] = { 1 };
c[42] = 99;
}
}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out-of-bounds: " + e);	}
} catch(ArithmeticException e) {
System.out.println("Divide by 0: " + e);
}
}
}


