import java.util.*;
import java.lang.*;
import java.io.*;

class Santa_And_Chocolates
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int k = scan.nextInt();
	        int a[]=new int [n];
	        long sum = 0;
	        for(int i = 0;i<n;i++){a[i]=scan.nextInt(); sum+=a[i];}
	            if(k==0 || sum<n){
                 if(sum%n!=0  || sum<n)
                     System.out.println("NO");
                 else
                     System.out.println("YES");
             }
             else
                System.out.println("YES"); 
	    }
	}
}
