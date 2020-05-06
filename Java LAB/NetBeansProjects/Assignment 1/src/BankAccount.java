
 class Account {
   double amount,rate;
   Account(double a,double r)
   {
       amount=a;
       rate=r;
   }
   void withdraw(double amount)
   {
       if(amount>this.amount)
           System.out.println("Withdrawal limit exceed");
       else{
            this.amount-=amount;
            System.out.println("Remaining Balance is "+this.amount);
       }
   }
   void deposit(double amount)
   {
       this.amount+=amount;
       System.out.println(amount +" is deposited");
   }
   void calculateinterest(double time)
   {
       double interest=(amount*rate*(time/12))/100;
       System.out.println("Interest is "+ interest);
   }
}
public class BankAccount{
    public static void main( String [] args){
        Account a1= new Account(6000,5);
        a1.deposit(4000);
        a1.withdraw(11000);
        a1.withdraw(3000);
        a1.calculateinterest(6);
    }
}
