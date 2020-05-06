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
// This program contains an error and will not compile.
class ThrowsDemo {
static void throwOne() throws IllegalAccessException {
System.out.println("Inside throwOne.");
throw new IllegalAccessException("demo");
}
public static void main(String args[]){
    try {
throwOne();
} catch (IllegalAccessException e) {
System.out.println("Caught " + e);
}

}
}

