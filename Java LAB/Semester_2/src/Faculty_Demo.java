import java.util.Scanner;

class Faculty
{
    String Name,designation;
    Faculty(String N,String D)
    {
        Name = N;
        designation = D;
    }
}
class ComputerScienceFaculty extends Faculty
{
    String Subject;
    ComputerScienceFaculty(String A, String B, String C)
    {
        super(A,B);
        Subject = C;
    }
    void display()
    {
        System.out.println("\n\nDetails of the " + Name + " are as follows");
        System.out.println("Name \t\t : " + Name);
        System.out.println("Designation \t : " + designation);
        System.out.println("Subject \t : " + Subject);
    }
}
public class Faculty_Demo {

    public static void main(String[] args) 
    {
        ComputerScienceFaculty A = new ComputerScienceFaculty("Mr. Sushil", "Lecturer", "Data Structure");
        ComputerScienceFaculty B = new ComputerScienceFaculty("Mr. Srinivas", "Lecturer", "Machine Learning");
        A.display();
        B.display();
        
    }
}
