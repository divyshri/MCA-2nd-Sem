import java.util.*;

public class Factorial_Recursion {
    public static int fact(int x)
    {
        if(x==1)
            return 1;
        else
            return (x * fact(x-1));
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int f;
        System.out.println("Enter any integer to calculate its falctorial");
        f = scan.nextInt();
        System.out.println("Factorial of the given number is " + fact(f));
        
    }
}
