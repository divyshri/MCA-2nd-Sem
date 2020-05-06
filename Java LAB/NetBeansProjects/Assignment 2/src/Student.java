
public class Student {
    String name,collegename,department,address;
    int rollno;
    double height;
    Student()
    {
        collegename="nitw";
        department="cse";
        height=5.5;
    }
    Student(String sname,int r)
    {
        name=sname;
        rollno=r;
    }
    Student(String sname, int r, double h)
    {
        name=sname;
        rollno=r;
        height=h;
    }
    Student (String sname, int r, double h,String dept)
    {
        name=sname;
        rollno=r;
        height=h;
        department=dept;
    }
    void disp(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(collegename);
        System.out.println(department);
        System.out.println(address);
        System.out.println(height);
        
    }
    
    public static void main(String [] args)
    {
        Student S1 =new Student();
         Student S2 =new Student("Tanvi", 43);
          Student S3 =new Student("Vandita", 44,5.11);
           Student S4 =new Student("Divyanshu",11,5.11,"cse");
           S1.disp();
           S2.disp();
           S3.disp();
           S4.disp();
    }
}
