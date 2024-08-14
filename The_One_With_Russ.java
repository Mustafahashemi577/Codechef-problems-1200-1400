import java.util.*;
import java.lang.*;
import java.io.*;

class The_One_With_Russ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    int b [] = new int [n];
		    for(int i = 0;i<n;i++) a[i]=scan.nextInt();
		    for(int i = 0;i<n;i++) b[i]=scan.nextInt();
            int counter =0;
		    for(int i = 0;i<n;i++){
		        if(Math.abs(a[i]-b[i])<=k){
		        counter++;
		        }
		    }
		    if(counter>=x)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		}

	}
}
