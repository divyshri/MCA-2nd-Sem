import java.util.Scanner;
public class BoxNumber {
    public static void main(String []args){
           Scanner in= new Scanner(System.in);
           System.out.println("Enter any number");
           int n = in.nextInt();
           for(int i=1;i<=n;i++)
           {
               for(int j=1;j<=(n-i);j++)
                   System.out.print("  ");
               for(int k=1;k<=i;k++)
                   System.out.print(k+"   ");
               System.out.print("\n");
           }
           for(int i=n-1;i>=1;i--)
           {
               for(int j=n-i;j>=1;j--)
                   System.out.print("  ");
               for(int k=1;k<=i;k++)
                   System.out.print(k+"   ");
               System.out.print("\n");
           }
    }
}
