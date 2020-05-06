package File_Handling;
import java.io.*;
import java.lang.*;
public class CountWords {
    
    public static void main(String[] args) throws Exception
    {
        int count=0;
        File f = new File("file1.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();
        String s = "Divy";
        while(line!=null)
        {
            
            if(line.equals(s))
                count++;
            line = br.readLine();
        }
        System.out.println("The Specified String occurs : " + count + " times in the file");
        br.close();
        
    }
}
