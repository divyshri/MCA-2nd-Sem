package File_Handling;
import java.io.*;
/**
 * @author mc18111
 */
public class Two_File_Into_One {
    public static void main(String[] args) throws Exception
    {
        PrintWriter pw = new PrintWriter("Z:\\Java\\Semester_2\\src\\File_Handling\\file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\file1.txt"));
        String line = br.readLine();
        while(line!=null)
            {
                pw.println(line);
                line = br.readLine();
            }
        br = new BufferedReader(new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\file2.txt"));
        line = br.readLine();
        while(line!=null)
            {
                pw.println(line);
                line = br.readLine();
            }
        pw.flush();
        br.close();
        pw.close();
    }
}
