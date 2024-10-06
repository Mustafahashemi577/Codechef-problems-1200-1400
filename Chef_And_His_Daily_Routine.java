import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_His_Daily_Routine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t  = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    if(s.contains("EC") || s.contains("SC")||s.contains("SE"))
		        System.out.println("no");
		    else
		        System.out.println("yes");
		}
	}
}
