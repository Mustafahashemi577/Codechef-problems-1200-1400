import java.util.*;
import java.lang.*;
import java.io.*;

class Transfusion_Chain
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =  new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a=0,b=0,ab=0,o=0;
		    for(int i = 0;i<n;i++){
		        String s = scan.next();
		        if(s.equals("A"))
		        a++;
		        else if (s.equals("B"))
		        b++;
		        else if (s.equals("AB"))
		        ab++;
		        else
		        o++;
		    }
		    int max = Math.max(a,b);
		    max+=ab+o;
		    System.out.println(max);
		}

	}
}
