import java.util.*;
import java.lang.*;
import java.io.*;

class Split_The_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while (t-->0){
	        int n = scan.nextInt();
	        String s = scan.next();
	        String temp1 = s.substring(0,n-1);
	        String temp2 = s.substring(n-1,n);
	        
	        System.out.println(temp1.contains(temp2)?"YES":"NO");
	    } 

	}
}
