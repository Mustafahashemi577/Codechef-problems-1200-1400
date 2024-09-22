import java.util.*;
import java.lang.*;
import java.io.*;

class Beat_The_Average
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int x = scan.nextInt();
		    System.out.println(x==m?0:n*x/(x+1));   
		}
	}
}
