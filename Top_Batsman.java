import java.util.*;
import java.lang.*;
import java.io.*;

class Top_Batsman
{
    static int[] fact = new int[]{1,1,2,6,24,120,720,5040,40320,362880,3628800,39916800};
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int ts = scan.nextInt();
		for(int t=0;t<ts;t++) {
		    int[] players = new int[11];
		    for(int i=0;i<11;i++) players[i] = scan.nextInt();
		    int k = scan.nextInt();
		    Arrays.sort(players);
		    int n = 0;
		    int m = 0;
		    for(int i=10;i>=0;i--) {
		        if(players[i]==players[11-k]) {
		            if(i<11-k) m++;
		            n++;
		        }
		    }
		    System.out.println(comb(n,m));
		}
	}
	
	public static int comb(int n, int m) {
	    int num = fact[n];
	    int den = fact[m] * fact[n-m];
	    return num/den;

	}
}
