import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Demonetisation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int s = scan.nextInt();
		    int n = scan.nextInt();
		    if(s==1 || n==s || s<n&&s%2==0)
		    System.out.println(1);
		    else if (s<n && n%2==1)
		    System.out.println(2);
		    else{
		        int r = s%n;
		        if (r==0)
		        System.out.println(s/n);
		        else if(r==1)
		        System.out.println((s/n)+1);
		        else 
		        System.out.println(r%2==1?(s/n)+2:(s/n)+1);
		    }
		}    
		 

	}
}
