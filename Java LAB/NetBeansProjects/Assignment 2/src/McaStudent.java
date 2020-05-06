import java.util.Scanner;
public class McaStudent {
    Scanner in =new Scanner(System.in);
    String name,address;
    int rollno;
    long mobileno;
    static String CollegeName="NITW", department="Computer Science";
    McaStudent()
    {
        System.out.println("Enter Name:");
        name=in.nextLine();
        System.out.println("Enter Rollno.:");
        rollno=in.nextInt();
        System.out.println("Enter Address:");
        address=in.nextLine();
         System.out.println("Enter Mobile Number:");
        mobileno=in.nextLong();
    }
    
    void changeAddress()
    {
         System.out.println("Enter New Address:");
         address=in.nextLine();
    }
    
    void changeMobileNumber()
    {
         System.out.println("Enter New Mobile Number:");
        mobileno=in.nextLong();
    }
    
    void disp()
    {
        System.out.println("Follwing are details of student:");
        System.out.println("Name: "+ name);
        System.out.println("Rolno.: "+ rollno);
        System.out.println("Address: "+ address);
        System.out.println("Mobile Number:"+ mobileno);
    }
    public static void main(String [] args)
    {
        McaStudent S1= new McaStudent();
        S1.disp();
        S1.changeMobileNumber();
        S1.changeAddress();
        S1.disp();
    }
}
