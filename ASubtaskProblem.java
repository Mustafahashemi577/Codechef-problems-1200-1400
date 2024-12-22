import java.util.*;
import java.lang.*;
import java.io.*;

class ASubtaskProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    int count = 0;
		    for(;count<n;count++){
		        if(a[count]==0)
		        break;
		    }
		    if(n==count)
		    System.out.println("100");
		    else if (count>=m)
		    System.out.println(k);
		    else
		    System.out.println(0);
		}

	}
}
