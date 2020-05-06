import java.util.*;
public class Patten_Without_loop 
{
    static void pattern(int x)
    {
        System.out.print( x + " ");
        if(x<0)
            return;
        pattern(x-5);
        System.out.print( x + " ");  
    }
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);
        int limit;
        System.out.println("Enter the limit");
        limit = scan.nextInt();
        pattern(limit);
    }
    
}
