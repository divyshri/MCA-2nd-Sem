/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author Rajesh Reddy
 */
public class Palindrome {
public static void main(String[] args)	{ 
check("abc");
check("abcba");
check("abbc");
}
public static void check(String input)
{
boolean result=true;
int length=input.length();
for(int i=0;i<length/2;i++)
{
	if(input.charAt(i)!=input.charAt(length-i-1))
	{
		result=false;	
break;
	}
}
System.out.println(input+" is palindrome= "+result);
}

    
}
