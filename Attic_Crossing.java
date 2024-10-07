import java.util.*;
import java.lang.*;
import java.io.*;

class Attic_Crossing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String p = scan.next();
		    long days = 0;
		    int max = 0;
		    int dots = 0;
		    for(int i = 0;i<p.length();i++){
		        if(p.charAt(i)=='.'){
		            int j = i;
		            while(p.charAt(j)=='.'){
		                dots++;
		                j++;
		            }
		            if(dots>max){
		                days++;
		                max=dots;
		            }
		            i=j;
		            dots=0;
		        }
		        else{
		            dots=0;
		        }
		    }
		    System.out.println(days);
		}
	}
}
