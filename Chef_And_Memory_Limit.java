import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Memory_Limit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    long a [] = new long [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextLong();
		    }
		    long current = 0L;
		    long total = 0L;
		    for(int i = 0;i<n;i++){
		        if(a[i]>current)
		        total+=(a[i]-current);
		        current=a[i];
		    }
		    System.out.println(total);
		} 
	}
}
