import java.util.*;
import java.lang.*;
import java.io.*;

class Single_Operation_Part_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n = scan.nextInt();
		    String s= scan.next();
		    int count=0;

		    for(int i=0; i<s.length(); i++)
		    {
		        if(s.charAt(i)=='1')
		        {
		            count++;
		        }
		        else
		        {
		            break;
		        }
		    }
		    
		    System.out.println(count);
		}

	}
}
