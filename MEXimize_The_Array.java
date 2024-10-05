import java.util.*;
import java.lang.*;
import java.io.*;

class MEXimize_The_Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int[n];
		    for(int i = 0;i<n;i++)
		        a[i]=scan.nextInt();
		    
		    long ops = 0L;
		    Arrays.sort(a);
		    for(int i = 0;i<n;i++){
		        if(a[i]!=i)
		            ops+=Math.abs(a[i]-i);
		    }
		    System.out.println(ops);
		}
	}
}
