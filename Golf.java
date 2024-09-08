import java.util.*;
import java.lang.*;
import java.io.*;

class Golf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int k = scan.nextInt();
            if(x%k==0 && x>=k || x%k==(n+1)%k)
            System.out.println("YES");
            else
            System.out.println("NO");
		} 
	}
}
