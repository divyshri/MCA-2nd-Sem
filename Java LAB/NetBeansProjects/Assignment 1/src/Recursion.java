import java.util.Scanner;
public class Recursion {
    public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
           System.out.println("Enter any number");
           int n = in.nextInt();
           int f=fact(n);
           System.out.println("Factorial of given no. is: "+ f);
    }
    static int fact(int n)
    {
        if(n==0||n==1)
            return 1;
        else
            return(n*fact(n-1));
    }
}
