package File_Handling;
import java.io.*;
/**
 * @author mc18111
 */
public class Topper {
    public static void main(String[] args) throws Exception
    {
        int sum=0,count=0;
        double max=0,temp=0;
        String str=null;
        BufferedReader br = new BufferedReader(new FileReader("Z:\\Java\\Semester_2\\src\\File_Handling\\topper.txt"));
        String line = br.readLine();
        while(line!=null)
        {
            String[] s = line.split(" ");
            sum=0;
            for(int i=1;i<s.length;i++)
            {
                sum+=Integer.parseInt(s[i]);
                count++;
            }
            temp = sum/count;
            if(temp>max){
                max = temp;
                str = s[0];
            }
            line = br.readLine();
        }
        System.out.println("The Student  " + str + " is having maximum average of :  " + max );
        br.close();
        
    }
}
