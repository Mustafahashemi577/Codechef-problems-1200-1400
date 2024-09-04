import java.util.*;
import java.lang.*;
import java.io.*;

class Avoid_Fixed_Points
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int count = 0;
		    int p = 1;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    for(int i = 0;i<n;i++){
		        if(a[i]==p+count)
		        count++;
		        
		        p++;
		    }
		    System.out.println(count);
		} 

	}
}
