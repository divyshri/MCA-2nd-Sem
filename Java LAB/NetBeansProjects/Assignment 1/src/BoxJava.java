
import java.util.Scanner;
public class BoxJava {
     public static void main(String []args){
           Scanner in= new Scanner(System.in);
           System.out.println("Enter any String");
           String s = in.nextLine();
           int l=s.length();
           l=l+2;
           for(int i=1;i<=3;i++)
           {
               if(i==1||i==3)
               {
                   for(int j=1;j<=l;j++)
                      System.out.print("* ");
               }
               else{
                   for(int j=1;j<=l;j++)
                   {
                       if(j==1||j==l)
                         System.out.print("* ");
                       else{
                           for(int k=0;k<s.length();k++)
                              System.out.print(s.charAt(k)+" ");
                              j+=s.length()-1;
                       }
                   }
               }
               System.out.print("\n");
               
               
           }
       }
}
