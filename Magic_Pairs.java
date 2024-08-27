import java.util.*;
import java.lang.*;
import java.io.*;

class Magic_Pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    long nums = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        nums+=i;   
		    }
		    
		    System.out.println(nums);
		    
		}
	}
}
