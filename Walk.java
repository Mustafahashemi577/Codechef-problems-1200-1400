import java.util.*;
import java.lang.*;
import java.io.*;

class Walk
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int a [] = new int [n];
	        long max = Integer.MIN_VALUE;
	        for(int i = 0;i<n;i++){
	            a[i]=scan.nextInt();
	            max = Math.max(a[i]+i,max);
	            
	        }
	        System.out.println(max);
	    }
	}
}
