import java.util.Scanner;
public class PalindromeNumber {
   public static void main(String[] args) 
           {
              Scanner in= new Scanner(System.in);
              System.out.println("Enter any number");
              int n = in.nextInt();
              int rev=0,num=n;
              while(n!=0)
              {
                  int rem=n%10;
                  rev=(rev*10)+rem;
                  n=n/10;
              }
              if(rev==num)
                  System.out.println("Palindrome Number");
              else
                  System.out.println("Not a Palindrome Number");
           }
}
