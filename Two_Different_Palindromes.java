import java.util.*;
import java.lang.*;
import java.io.*;

class Two_Different_Palindromes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    String possible = "Yes";
		    if(a==1 || b==1 || (a%2!=0 && b%2!=0)){
		        possible = "No";
		    }
		    System.out.println(possible);
		}

	}
}
