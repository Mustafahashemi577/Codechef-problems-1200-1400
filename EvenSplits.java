import java.util.*;
import java.lang.*;
import java.io.*;

class EvenSplits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    int ones = 0,zeros=0;
		    for(int i = 0;i<n;i++){
		        if(s.charAt(i)=='1')
		            ones++;
		        else
		            zeros++;
		    }
		    if(n<=2){
		        System.out.println(s);
		    }
		    else{
		        StringBuilder sb = new StringBuilder();
		        for(int i=0;i<n;i++){
		            if(zeros>0){
		                sb.append("0");
		                zeros--;
		            }
		            else{
		                sb.append("1");
		            }
		        }
		        System.out.println(sb);
		    }
		    
		}

	}
}

