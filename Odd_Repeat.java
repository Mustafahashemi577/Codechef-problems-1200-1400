import java.util.*;
import java.lang.*;
import java.io.*;

class Odd_Repeat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int s = scan.nextInt();
		    System.out.println((s-n*n)/(k-1));
		}

	}
}
