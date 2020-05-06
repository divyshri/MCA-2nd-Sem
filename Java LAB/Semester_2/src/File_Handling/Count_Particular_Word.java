package File_Handling;
import java.io.*;
import java.util.*;
/**
 * @author mc18111
 */
public class Count_Particular_Word {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int count=0;
        char s;
        System.out.println("Enter the Character you want to count");
        s = scan.nextLine().charAt(0);
        FileReader fr = new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\file1.txt");
        int i = fr.read();
        while(i!=-1)
        {
           
           if(s == (char)i)
               count++;
           i=fr.read();
        }
        System.out.println("The Entered character occurs : " + count + " times in the file");
        fr.close();
        
    }
}
