import java.util.*;
import java.lang.*;
import java.io.*;

class Pusha
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long h[] = new long[n];
		    long maxh=0,count=0;
		    h = new long[n];
		    for(int j = 0; j < n; j++){
		        h[j] = scan.nextLong();
		    }
		    Arrays.sort(h);
		   if(n == 1){
		       System.out.println(h[0]);
		   }
		   else{
		       for(int k = n - 1; k > 1; k--){
		           if(h[k] == h[k - 1]){
		               count++;
		           }
		           else{
		               if(maxh < h[k] + count){
		                   maxh = h[k] + count;
		               }     
		                   count = 0;
		           }
		       }
		       System.out.println(maxh);
		   }
		}
	}
}

