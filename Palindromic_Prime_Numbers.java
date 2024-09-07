import java.util.*;
import java.lang.*;
import java.io.*;

class Palindromic_Prime_Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    if(n > 4){
		        System.out.println(1 + " " + (n-1));
		    } else {
		        System.out.println(0 + " " + n);
		    }
		} 
	}
}
