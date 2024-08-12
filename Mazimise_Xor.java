import java.util.*;
import java.lang.*;
import java.io.*;

class Mazimise_Xor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String a = scan.next();
		    String b = scan.next();
		    int ones = 0;
		    for(int i = 0;i<a.length();i++){
		        if(a.charAt(i)=='1') ones++;
		        if(b.charAt(i)=='1') ones++;
		    }
		    StringBuilder result = new StringBuilder(a.length());
		    if(ones<=a.length())
		    {
		        for(int i = 0;i<a.length();i++){
		            if(i<ones)
		            result.append('1');
		            else
		            result.append('0');
		        }
		        System.out.println(result);
		    }
		    else{
		        ones-=a.length();
		        for(int i =a.length();i>0;i--){
		            if(i>ones)
		            result.append('1');
		            else
		            result.append('0');
		        }
		        System.out.println(result);
		    }
		    
		}

	}
}
