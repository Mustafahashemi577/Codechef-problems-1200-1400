import java.util.*;
import java.lang.*;
import java.io.*;

class Little_Chef_And_Sums
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    int res=0,c=0,sum=0;
	        int k=Integer.MAX_VALUE;
	        
	        for(int i=0;i<n;i++)
	        {
	            res=a[i]+sum;
	            if(k>res)
	            {
	                k=res;
	                c=i;
	            }
	        }
	        System.out.println(c+1);
		}
	}
}
