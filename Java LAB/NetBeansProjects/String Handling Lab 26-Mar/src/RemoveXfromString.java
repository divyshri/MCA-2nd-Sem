

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TANVI
 */
import java.util.Scanner;

public class RemoveXfromString {
    public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter any string");
        String s=in.nextLine();
        s=s.toLowerCase();
        System.out.println(charRemoveAt(s,s.indexOf('x')));
    }
    public static String charRemoveAt(String str, int p) { 
            if(p==0||p==1||p==2)
              return str.substring(0, p) + str.substring(p + 1);
            else
                return str;
           } 
}
