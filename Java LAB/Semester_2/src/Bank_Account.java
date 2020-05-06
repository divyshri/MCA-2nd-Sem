import java.util.*;
public class Bank_Account 
{
    int amount,rate=10;
    void deposit(int n)
    {
        amount += n;
    }
    void withdraw(int n)
    {
        amount -=n;
    }
    double interest(int t)
    {
        double si;
        si = (amount*rate*t)/100;
        return si;
    }
    public static void main(String[] args) 
    {
        Bank_Account c1 = new Bank_Account();
        c1.deposit(500);
        c1.deposit(1500);
        c1.deposit(2500);
        c1.deposit(3500);
        c1.withdraw(1500);
        System.out.println("Interest after 3 year at 10% rate is  = " + c1.interest(3));
        
      
    }
    
}
