package File_Handling;
import java.io.*;
/**
 * @author mc18111
 */
public class Alphabetical_List {
    public static void main(String[] args) throws Exception
    {
        int[] alpha =new int[200];
        FileReader fr = new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\file1.txt");
        PrintWriter pw = new PrintWriter("Z:\\Java\\Semester_2\\src\\File_Handling\\table.txt");
        int i = fr.read();
        while(i!=-1)
        {
           char a = (char)i;
           alpha[a]++;
           i=fr.read();
        }
        for(int k=97;k<123;k++)
        {
            pw.println("charater : " + (char)k + " No. of Counts : " + alpha[k]);
        }
        fr.close();
        pw.flush();
        pw.close();
    }
}
