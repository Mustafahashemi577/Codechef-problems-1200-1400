import java.util.*;
import java.lang.*;
import java.io.*;

class Vaccine_Distribution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int d = scan.nextInt();
		    int [] a = new int [n];
		    int risky =0;
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        if(a[i]>=80 || a[i]<=9)
		        risky++;
		    }
		    int days1 = (n-risky)%d==0 ? (n-risky)/d : ((n-risky)/d)+1;
		    int days2 = (risky)%d==0 ? (risky)/d : ((risky)/d)+1;
		    System.out.println(days1+days2);
	    }

	}
}
