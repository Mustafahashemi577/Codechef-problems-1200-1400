import java.util.*;
import java.lang.*;
import java.io.*;

class Distinct_Substring
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    if(n == 1)
		    {
		        if(k==1)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else{
		        if(n<(k*(k+1)/2)+(k-1))
		        System.out.println("NO");
		        else
		        System.out.println("YES");
		    }
		}

	}
}
