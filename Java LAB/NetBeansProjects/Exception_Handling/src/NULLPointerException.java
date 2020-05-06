/**
 *
 * @author Divyanshu
 */

class Tester {
   Tester()
   {
       System.out.println("This is the constructor of Tester Class");
   }
}

public class NULLPointerException {
    public static void main(String[] args) {
      Tester ref = null;
      try
      {
        ref.toString(); 
      }
      catch(NullPointerException e){
          System.out.println("NullPointerException Caught");
      }
   }
}
