


import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int a=0,b=1,start=0,temp=0;
        System.out.println("Enter the number of term in the fibonacci series");
        Scanner scan = new Scanner(System.in);
        start = scan.nextInt();
        System.out.print("Elements of the fibonacci series are \n" + a + " " + b + " ");
        while(temp <start)
        {
            temp = a+b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }   
    }
    
}
