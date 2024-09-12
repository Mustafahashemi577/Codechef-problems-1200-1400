import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Deletions
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
		    int gcd=gcd(a[0],a[1]);
        	for(int j=2;j<n;j++) {
        		gcd=gcd(gcd,a[j]);
        	}
        	if(gcd==1) {
        		System.out.println(0);
        	}
        	else {
        		System.out.println(-1);
        	}
        }
	}
    private static int gcd(int a, int b) {
	if(a==0) {
		return b;
	}
	return gcd(b%a,a);
}
}
