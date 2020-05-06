/*
To use bitwise operator
 */

public class BitwiseOperator {
    public static void main(String args[]){
        int a=3,b=10;
        int c;
        c=a&b;
        System.out.println("a&b "+c);
        c=a|b;
        System.out.println("a|b "+c);
        c=a^b;
        System.out.println("a^b "+c);
        c=~a;
        System.out.println("~a "+c);
        
        c=b>>2;
        System.out.println("b>>2 "+c);
        c=b<<2;
        System.out.println("b<<2 "+c);
        c=a>>>2;
        System.out.println("a>>>2 "+c);
     
        
    }
}
