import java.util.*;
import java.lang.*;
import java.io.*;

class Cool_Name
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char c [] = scan.next().toCharArray();
		    int a [] = new int [c.length];
		    long sum = 0;
		    for(int i = 0;i<c.length;i++){
		        a[i]=((int)c[i]-96);
		    }
		    Arrays.sort(a);
		    for(int i = 0;i<a.length;i++){
		        sum+=((i+1)*(a[i]));
		    }
		    System.out.println(sum);
		    
		}
	}
}
