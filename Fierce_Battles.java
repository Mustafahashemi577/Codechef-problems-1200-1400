import java.util.*;
import java.lang.*;
import java.io.*;

class Fierce_Battles
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t-- > 0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int x = m+n;
		    int a[] = new int[101];
		    int b[] = new int[101];
		    for(int i = 0; i < n; i++){
		       int p = scan.nextInt();
		       int l = scan.nextInt();
		       a[l] += p;
		    }
		     for(int i = 0; i < m; i++){
		       int p = scan.nextInt();
		       int l = scan.nextInt();
		       b[l] += p;
		    }
		    int sum = 0;
		   
		    for(int i = 0; i < 101; i++){
		        if((b[i] - a[i]) > 0){
		            sum += b[i] - a[i];
		           
		        }
		    }
		    System.out.println(sum);
		} 
	}
}
