


public class Conversion {

    public static void main(String[] args) {
       byte b;
       int i=257;
       double d = 323.42;
       System.out.println("Conversion of int to byte");
       b = (byte)i;
       System.out.println("i  = " + i + " and b = " + b);
       System.out.println("Conversion double to int");
       i = (int)d;
       System.out.println("d  = " + d + " and i = " + i);
       System.out.println("Conversion of double to byte");
       b = (byte)d;
       System.out.println("d  = " + d + " and b = " + b);
       
    }
    
}
