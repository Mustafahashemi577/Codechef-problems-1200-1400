import java.util.*;
import java.lang.*;
import java.io.*;

class Possible_GCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t  = scan.nextInt();
		while(t-->0){
		    int first = scan.nextInt();
		    int second = scan.nextInt();
		    int absolute = Math.abs(first-second);
		    int count = 0;
		    for(int i = 1;i*i<=absolute;i++){
		        if(absolute%i==0){
		                count++;
		            if(i!=absolute/i)
		                count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
