import java.util.*;
import java.lang.*;
import java.io.*;

class Lift_Requests
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int q = scan.nextInt();
		    int f [] = new int [q];
		    int d [] = new int [q];
		    for(int i = 0;i<q;i++){
		        f[i]=scan.nextInt();
		        d[i]=scan.nextInt();
		    }
		    long sum = 0;
		    for(int i = 0;i<q;i++){
		        if(i==0){
		            sum+=Math.abs(sum-f[i]);
		            sum+=Math.abs(f[i]-d[i]);
		        }
		        else{
		            sum+=Math.abs(d[i-1]-f[i]);
		            sum+=Math.abs(f[i]-d[i]);
		        }
		    }
		    System.out.println(sum);
		} 
	}
}
