import java.util.*;
import java.lang.*;
import java.io.*;

class Maximum_Score
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int zeros = 0;
		    int ones = 0;
		    for(int i = 0;i<n;i++){
		        a[i] = scan.nextInt();
		        if(a[i]==1)
		        ones++;
		        else
		        zeros++;
		    }
		    if(zeros<ones)
		    System.out.println(zeros);
		    else
		    System.out.println(ones);
		}

	}
}
