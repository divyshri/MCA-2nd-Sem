import java.util.Scanner;
public class PatternWithoutLoop {
     public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
           System.out.println("Enter any number");
           int n = in.nextInt();
           int term=n;
           pattern(n,term,0);
    }
      static void pattern(int n,int term,int flag)
      {
          if(n>term)
              return;
       System.out.print(n+"\t");
       if(n>=0&&flag==0)
           pattern(n-5, term,flag);
       else
          { flag=1;
              pattern(n+5 ,term,flag);
          }
       }
}
