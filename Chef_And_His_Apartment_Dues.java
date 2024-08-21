import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_His_Apartment_Dues
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int sum = 0;
		    int ones = 0;
		    int index = -1;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(index==-1 && a[i]==0)
		        index=i;
		        if(a[i]==1)
		        ones++;
		        else 
		        sum+=1000;
		    }
		    if(index!=-1)
		    sum+=((n-index)*100);
		    System.out.println(sum);
		}
	}
}
