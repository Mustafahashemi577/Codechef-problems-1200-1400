import java.util.*;
import java.lang.*;
import java.io.*;

class Take_It_Easy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int s = 0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        s+=a[i];
		    }
		    int b = s/n;
		    if(b*n!=s){
		        System.out.println("No");
		    }
		    else{
		        int count = 0;
		        for(int temp : a){
		            if((Math.abs(temp-b))%2==0)
		            count++;
		            else
		            count--;
		        }
		        System.out.println(count==n?"Yes":"No");
		    }
		}
	}
}
