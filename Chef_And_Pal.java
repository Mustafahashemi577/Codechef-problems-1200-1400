import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Pal
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n=scan.nextInt();
		    if(n%2==0)
		        for(int i=0;i<n/2;i++)
		            System.out.print("10");
		    else
		        System.out.print("-1");
		    System.out.println();
		}
        
	}
}
