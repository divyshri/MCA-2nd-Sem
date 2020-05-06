import java.util.Scanner;
public class NumberTringle {
    public static void main(String []args){
           Scanner in= new Scanner(System.in);
           System.out.println("Enter any number");
           int n = in.nextInt();
           for(int i=1;i<=n;i++)
           {
               for(int j=1;j<=(n-i);j++)
                   System.out.print("  ");
               for(int k=1;k<=(2*(i-1)+1)/2+1;k++)
               { 
                   System.out.print(k+" ");
               }
               for(int k=(2*(i-1)+1)/2;(k>=1&&i>1);k--)
               {
                   System.out.print(k+" ");
               }
               System.out.print("\n");
           } 
    
    
    
    }
}
