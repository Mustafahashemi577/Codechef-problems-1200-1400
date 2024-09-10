import java.util.*;
import java.lang.*;
import java.io.*;

class Little_Elephant_And_Permutation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    int inversion = 0;
		    int localInversion = 0;
		    for(int i = 0;i<n;i++){
		        for(int j = i+1;j<n;j++)
		        if(a[i]>a[j])
		        inversion++;
		    }
		    for(int i = 0;i<n-1;i++)
		        if(a[i]>a[i+1])
		        localInversion++;
		    System.out.println(localInversion==inversion?"YES":"NO");
		}
	}
}
