import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Street_Food
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    long maxProfit = 0;
		    for(int i = 0;i<n;i++){
		        int s = scan.nextInt();
		        int p = scan.nextInt();
		        int v = scan.nextInt();
		        int temp = (p/(s+1))*v;
		        maxProfit = Math.max(temp, maxProfit);
		    }
		    System.out.println(maxProfit);
		}
	}
}
