import java.util.*;
import java.lang.*;
import java.io.*;

class Exact_Marks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    long n = scan.nextLong();
		    long x = scan.nextLong();
		    long div = x/3;
		    if(x%3 != 0){
		         div++;
		    }
		    long solved = div;
		    long wrong = Math.abs(x - 3*solved);
		    long uns = Math.abs(n - wrong - solved);
		    long ans = 3*solved - wrong;
		    if(solved + wrong + uns > n || ans != x){
		        System.out.println("NO");
		    } else {
		        System.out.println("YES");
		        System.out.println(solved + " " + wrong +" " + uns);
		    }
		}
	}
}
