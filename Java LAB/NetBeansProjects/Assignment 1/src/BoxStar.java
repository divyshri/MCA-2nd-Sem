import java.util.Scanner;
public class BoxStar {
     public static void main(String []args){
           Scanner in= new Scanner(System.in);
           System.out.println("Enter any number");
           int n = in.nextInt();
           n=n/2;
            for(int i=1;i<=n+1;i++)
           {
               for(int j=1;j<=(n+1-i);j++)
                   System.out.print("  ");
               for(int k=1;k<=i;k++)
               {
                   if(k==1||k==i)
                       System.out.print("*   ");
                   else
                       System.out.print("    ");
               }
               System.out.print("\n");
            }
            for(int i=n;i>=1;i--)
           {
               for(int j=n+1-i;j>=1;j--)
                   System.out.print("  ");
               for(int k=i;k>=1;k--)
               {
                   if(k==1||k==i)
                       System.out.print("*   ");
                   else
                       System.out.print("    ");
               }
               System.out.print("\n");
            }
    }
}
