package File_Handling;
import java.io.*;
import java.util.*;
/**
 * @author mc18111
 */
public class Average {
    public static void main(String[] args) throws Exception
    {
       Scanner scan = new Scanner(System.in);
       int a,count=1,sum=0;
       double d;
       System.out.println("Enter values to calculate average and zero to stop");
       a = scan.nextInt();
       while(a!=0)
       {
           sum+=a;
           count++;
           a = scan.nextInt();
       }
       d = sum/count;
       System.out.println("Average of given values are : " + d);
    }
}
