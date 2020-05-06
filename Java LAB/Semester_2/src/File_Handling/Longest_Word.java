package File_Handling;
import java.io.*;
/**
 * @author mc18111
 */
public class Longest_Word {
    public static void main(String[] args) throws Exception
    {
        int max =0;
        BufferedReader br = new BufferedReader(new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\file1.txt"));
        String line = br.readLine();
        while(line!=null)
        {
            String[] words = line.split("\\s");
            for(String w: words)
            {
                if(w.length()>max)
                    max = w.length();
            }
            line = br.readLine();
        }
        System.out.println("The Length of Longest Word in the File is : " + max );
        br.close();
        
    }
}
