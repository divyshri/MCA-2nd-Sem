import java.util.Scanner;

class student
{
    String name,address,collegeName,department;
    int rollno;
    double height;
    student()
    {
        System.out.println("\n\nNo Argument Constructor Called");
        collegeName = "NITW";
        department = "CSE";
        height = 5.5;
    }
    student(String N,int roll)
    {
        System.out.println("\n\nTwo Argument Constructor Called");
        name = N;
        rollno = roll;
    }
    student(String N,int roll,double H)
    {
        System.out.println("\n\nThree Argument Constructor Called");
        name = N;
        rollno = roll;
        height = H;
    }
    student(String N,int roll,double H,String D)
    {
        System.out.println("\n\nFour Argument Constructor Called");
        name = N;
        rollno = roll;
        height = H;
        department = D;
    }
    void display()
    {
        System.out.println("\n\nDetails of the " + name + " is as follows");
        System.out.println("Name\t\t : " + name);
        System.out.println("Roll No. \t : " + rollno);
        System.out.println("Height \t\t : " + height);
        System.out.println("Adress \t\t : " + address);
        System.out.println("Department\t : " + department);
        System.out.println("College Name\t : " + collegeName);
    }
}
public class StudentByConstructor {

    public static void main(String[] args) {
       student A = new student();
       student B = new student("Divyanshu", 187909);
       student C = new student("Sudhir", 187909, 5.11);
       student D = new student("Sumit", 187909, 5.11, "Metullurgy");
       A.display();
       B.display();
       C.display();
       D.display();
    }
}
