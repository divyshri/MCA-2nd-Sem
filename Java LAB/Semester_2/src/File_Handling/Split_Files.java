package File_Handling;
import java.io.*;
/**
 * @author mc18111
 */
public class Split_Files {
    public static void main(String[] args) throws Exception
    {
        PrintWriter pw1 = new PrintWriter("Z:\\Java\\Semester_2\\src\\File_Handling\\demo1.txt");
        PrintWriter pw2 = new PrintWriter("Z:\\Java\\Semester_2\\src\\File_Handling\\demo2.txt");
        PrintWriter pw3 = new PrintWriter("Z:\\Java\\Semester_2\\src\\File_Handling\\demo3.txt");
        BufferedReader br = new BufferedReader(new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\file3.txt"));
        String line = br.readLine();
        while(line!=null)
            {
                pw1.println(line);
                line = br.readLine();
                pw2.println(line);
                line = br.readLine();
                pw3.println(line);
                line = br.readLine();
            }
        
        pw1.flush();
        pw2.flush();
        pw3.flush();
        br.close();
        pw1.close();
        pw2.close();
        pw3.close();
    }
}
