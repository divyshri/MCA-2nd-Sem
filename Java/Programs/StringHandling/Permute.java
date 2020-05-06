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
public class Permute {
public static void main(String args[])
{
    String str="ABC";
    int n=str.length();
    Permute p=new Permute();
    p.permute(str,0,n-1);
}
public void permute(String s,int l,int r)
{
    if(l==r)
    {
        System.out.println("String is: "+s);  
    }
    else
    {
        for(int i=1;i<=r;i++)
        {
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
    }
}
public String swap(String a,int i,int j)
{
    char temp;
    char[] ca=a.toCharArray();
    temp=ca[i];
    ca[i]=ca[j];
    ca[j]=temp;
    return String.valueOf(ca);
}
}
