

import java.util.Scanner;
public class BitwiseOperators {
    
    public static void main(String[] E) {
       
       System.out.println("Enter Any Numerical Values");
       Scanner scan=new Scanner (System.in);
       int a=scan.nextInt();
       int b=scan.nextInt();
       System.out.println("& operation (a&b) = "+(a&b));
       System.out.println("| operation (a|b) = "+(a|b));
       System.out.println("^ operation (a^b) = "+(a^b));
       System.out.println("~ operation  (~b) = "+(~b));
       System.out.println("left Shift (2>>a) = "+ (2>>a));
       System.out.println("Right Shift(b<<2) = "+(b<<2));
    }
    
}
