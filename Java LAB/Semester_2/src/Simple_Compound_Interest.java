import java.util.*;
import java.math.*;

public class Simple_Compound_Interest {
   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int principle,rate;
        double simple,compound;
        int time=7;
        System.out.println("Enter Principle Amount");
        principle = scan.nextInt();
        System.out.println("Enter Rate of Interest");
        rate = scan.nextInt();
        simple = (principle*rate*time)/100;
        compound = principle * (Math.pow((1 + rate / 100), time));
        System.out.println("\nSimple Interest after 7 years will be " + simple);
        System.out.println("\n\nCompound Interest after 7 years will be " + compound);
        
        
    }
}
