import java.util.*;
import java.lang.*;
import java.io.*;

class Plus_Multiply
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] =  new int [n];
		    int count2 = 0;
		    int count0 = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(a[i]==0)
		        count0++;
		        if(a[i]==2)
		        count2++;
		    }
		    int r=(int)(count2*(count2-1)/2+count0*(count0-1)/2);
		    System.out.println(r);
		}
	}
}
