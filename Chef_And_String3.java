import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_String3
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		 while(t-->0){
		     String s = scan.next();
		     String s1 = s.substring(1)+s.substring(0,1);
		     String s2 = s.substring(s.length()-1)+s.substring(0,s.length()-1);
		     System.out.println((s1.equals(s2))?"YES":"NO");
		 }

	}
}
