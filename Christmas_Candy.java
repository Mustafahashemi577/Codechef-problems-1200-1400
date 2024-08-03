import java.util.*;
import java.lang.*;
import java.io.*;

class Christmas_Candy
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
		    int count = 0;
		    int max = a[0];
		    for(int i =1;i<n;i++){
		        if(max>a[i])
		        count++;
		        else 
		        max=a[i];
		    }
		    System.out.println(count);
		}
	}
}
