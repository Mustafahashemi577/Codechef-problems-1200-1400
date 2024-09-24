import java.util.*;
import java.lang.*;
import java.io.*;

class Nahaane_Jaa
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while (t-->0){
	        int n = scan.nextInt();
	        int a [] = new int [n];
	        boolean result = false;
	        int k = scan.nextInt();
	        for(int i = 0;i<n;i++) a[i]=scan.nextInt();
	        for(int i = 0;i<n-1;i++)
	            if(a[i]==k){
	                result =true;
	                break;
	            }
	        if(a[0]==k&&n==1)
	        System.out.println("Yes");
	        else
	        System.out.println(result==false?"No":"Yes");
	    } 
	}
}
