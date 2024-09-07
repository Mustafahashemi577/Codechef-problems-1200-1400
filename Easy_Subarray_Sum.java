import java.util.*;
import java.lang.*;
import java.io.*;

class Easy_Subarray_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int count = 0, start =-1, end = 0;
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    for(int i = 0;i<n;i++)
		        if(a[i]>0){
		            start=i;
		            break;
		        }
		    for(int i =0;i<n;i++)
		        if(a[i]>0)
		        end=i;
		    if(start==-1)
		    System.out.println(0);
		    else{
		        for(int i = start;i<=end;i++)
		            if(a[i]<0)
		            count++;
		        System.out.println(count);
		    }
		} 
	}
}
