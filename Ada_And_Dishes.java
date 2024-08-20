import java.util.*;
import java.lang.*;
import java.io.*;

class Ada_And_Dishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    int stove1=0;
		    int stove2=0;
		    
		    Arrays.sort(a);
		    
		    for(int i=a.length-1;i>=0;i--){
		         if(stove1<=stove2)
		           stove1+=a[i];
		         else
		           stove2+=a[i];
		    }
		    System.out.println(stove1>stove2?stove1:stove2);
		}

	}
}
