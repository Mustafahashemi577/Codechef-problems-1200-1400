import java.util.*;
import java.lang.*;
import java.io.*;

class ORST
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int b [] = new int [m];
		    int a [] =new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    for(int i = 0;i<m;i++) b[i]=scan.nextInt();
		    Arrays.sort(b);
		    int d = a.length-b[b.length-1];
		    Arrays.sort(a,d,a.length);
		    for(int temp : a)
		       System.out.print(temp+" ");
		    System.out.println();
		}
	}
}
