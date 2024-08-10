import java.util.*;
import java.lang.*;
import java.io.*;

class EVM_Hacking
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int p = scan.nextInt();
		    int q = scan.nextInt();
		    int r = scan.nextInt();
		    
		    double half = (p+q+r)/2.0;
		    if((a+q+c)>half || (p+b+c)>half || (a+b+r)>half)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
