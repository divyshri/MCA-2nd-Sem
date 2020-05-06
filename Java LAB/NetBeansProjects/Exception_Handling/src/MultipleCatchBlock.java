import java.io.*;
/**
 *
 * @author Divyanshu
 */

public class MultipleCatchBlock {  

    public static void main(String[] args) {  

            try{    
                int a=30/0;
                FileReader file = new FileReader("test.txt");
                    
                }    
            catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
            catch(IOException K){			
                System.out.println("Input/Output Exception occurs");  
            }
               
    }  
}  