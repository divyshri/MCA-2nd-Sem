import java.util.Scanner;

public class CalculateInterest {
   public static void main(String [] args)
    {
        Scanner in= new Scanner(System.in);
           System.out.println("Enter Principal Amount");
           int p=in.nextInt();
           System.out.println("Enter rate of interest");
           float r=in.nextFloat();
           int t=7;
           float simple_interest=(p*r*t)/100;
           float amount,compound_interest;
           amount=(float)(p*Math.pow((1+(r/100)),t));
           compound_interest=amount-p;
           System.out.println("Simple Interest is:" +simple_interest);
           System.out.println("Compound Interest is:" +compound_interest);
    }  
}
