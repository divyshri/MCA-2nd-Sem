import java.util.Scanner;

class MCA_Student
{
    String name,address;
    int rollno,age;
    long number;
    static String collegeName = "NITW";
    static String department = "CSE";
    
    void setData(String N,String A,int R,int Age,long contact)
    {
        name  = N;
        address = A;
        rollno = R;
        age = Age;
        number = contact;
    }
    void changeAdress(String A)
    {
        address = A;
    }
    void changeMobileNumber(long i)
    {
        number = i;
    }
    void display()
    {
        System.out.println("\n\nDetails of the " + name + " is as follows");
        System.out.println("Name\t\t : " + name);
        System.out.println("Roll No. \t : " + rollno);
        System.out.println("Number \t\t : " + number);
        System.out.println("Age \t\t : " + age);
        System.out.println("Adress \t\t : " + address);
        System.out.println("Department\t : " + department);
        System.out.println("College Name\t : " + collegeName);
    }
}
public class Student {

    public static void main(String[] args) {
        MCA_Student A = new MCA_Student();
        MCA_Student B = new MCA_Student();
        MCA_Student C = new MCA_Student();
        A.setData("Divyanshu", "Indore", 187909, 21, 8602649349l);
        B.setData("Sudhir", "Indore", 187937, 21, 9926025656l);
        C.setData("Sumit", "Indore", 187938, 22, 7697656454l);
        B.changeAdress("Vijay Nagar, Indore");
        C.changeAdress("Mhow, Indore");
        B.changeMobileNumber(8822667799l);
        C.changeMobileNumber(8899779988l);
        A.display();
        B.display();
        C.display();
    }
}
