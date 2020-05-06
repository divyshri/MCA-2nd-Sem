import java.util.*;

public class Palindrome {
    public static void main(String[] args)
    {
        int num,temp,new_num=0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number to check whether its a palindrome or not");
	num  = scan.nextInt();
        temp = num;
	while(num>0)
	{
		int t = num% 10;
		new_num = (new_num * 10) + t;
		num /= 10;
	}
	if(new_num==temp)
		System.out.println("Entered number is a palindrome");	
	else
		System.out.println("Entered number is not a palindrome");
    }
}
