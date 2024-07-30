import java.util.*;
import java.lang.*;
import java.io.*;

class Broken_Telephone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    int missed =0;
            if(a[0]!=a[1])
            missed++;
            if(a[n-1]!=a[n-2])
            missed++;
		    for(int i = 1;i<n-1;i++){
		        if(a[i]!=a[i-1] || a[i]!=a[i+1]){
		            missed++;
		        }
		    }
		    System.out.println(missed);
		}

	}
}
