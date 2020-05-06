import java.util.*;
/**
 *
 * @author Divyanshu
 */
class InvalidAgeException extends Exception{  
    InvalidAgeException(String s){  
        super(s);  
    }  
}  
class TestCustomException{  

    static void validate(int age, String name)throws InvalidAgeException{  
    if(age==40 && name.equals("Ramu"))  
        System.out.println("You Are Ramu");  
    else  
        throw new InvalidAgeException("There is An Error");  
        
    }  

    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);
        String str;
        int age;
        System.out.println("Enter Name");  
        str = scan.nextLine();
        System.out.println("Enter age");  
        age = scan.nextInt();
        try{  
          validate(age,str);  
        }
        catch(Exception m){
            System.out.println("Exception occured: "+m);
        }  
      
  }  
}  