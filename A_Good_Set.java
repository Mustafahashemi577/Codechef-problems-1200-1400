import java.util.*;
import java.lang.*;
import java.io.*;

class A_Good_Set
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		     int sum = 1;
		    for(int i=1; i<=n; i++){
		        System.out.print(sum + " ");
		        sum = sum + 2;
		    }
		    System.out.println();
		}
	}
}
