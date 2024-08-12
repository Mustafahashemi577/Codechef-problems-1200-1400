import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Mean
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    long sum = 0;
		    double ave = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        sum+=a[i];
		    }
		    ave = (double)(sum)/n;
		    int i = 0;
		    for(;i<n;i++){
		        long c = sum-a[i];
		        if((double)c/(n-1)==ave){
		            System.out.println(i+1);
		            break;
		        }
		    }
		    if(i==n)
		    System.out.println("Impossible");
		    
		}

	}
}
