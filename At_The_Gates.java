import java.util.*;
import java.lang.*;
import java.io.*;

class At_The_Gates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    char c [] = new char[n];
		    for(int i = 0;i<n;i++) c[i]=scan.next().charAt(0);
		    for(int i=n-1;i>=n-k;i--){
		        if(c[i]=='H')
		        flip(c);
		    }
		    int heads=0;
		    for(int i = 0;i<n-k;i++){
		        if(c[i]=='H')
		            heads++;
		    }
		    System.out.println(heads);
		    
		}
	}
	public static char[] flip(char c[]){
	    for(int i = 0;i<c.length;i++){
	        if(c[i]=='H')
	            c[i]='T';
	        else
	        c[i]='H';
	    }
	    return c;
	}
}
