import java.util.*;
import java.lang.*;
import java.io.*;

class Two_Trains
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n-1];
		    int sum = 0;
		    int max = 0;
		    for(int i = 0;i<n-1;i++){
		        a[i]=scan.nextInt();
		        sum+=a[i];
		        max = Math.max(a[i],max);
		    }
		    System.out.println(sum+max);
		}
	}
}
