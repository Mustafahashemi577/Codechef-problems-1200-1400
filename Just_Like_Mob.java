import java.util.*;
import java.lang.*;
import java.io.*;

class Just_Like_Mob
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int k = scan.nextInt();
		    int x = scan.nextInt();
		    int temp = (x%(m+(k*n)));
		    if (temp>(n*(k-1))||temp==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
