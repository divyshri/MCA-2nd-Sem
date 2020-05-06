package File_Handling;
import java.io.*;
import java.util.*;
/**
 * @author mc18111
 */
public class Invoice{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        double price;
        int qty;
        String prdct_name=null;
        FileWriter fr = new FileWriter("Z:\\Java\\Semester_2\\src\\File_Handling\\invoice.txt");
        boolean check = true;
        while(check)
        {            
            System.out.println("Enter Product Name : ");
            prdct_name = scan.nextLine();
            System.out.println("Enter Price : ");
            price = scan.nextDouble();
            System.out.println("Enter Quantity : ");
            qty = scan.nextInt();
            
            fr.append("Name : " + prdct_name + "\t Price : " + price + "\t Quantity : " + qty );
            
            System.out.println("\n\nDo you Want to Continue (Y/N)");
            char ch;
            ch = scan.nextLine().charAt(0);
            ch = scan.nextLine().charAt(0);
            if(ch== 'N' || ch == 'n')
                check = false;
        }
        fr.flush();
        fr.close();
                
    }
}
