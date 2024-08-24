import java.util.*;
import java.lang.*;
import java.io.*;

class Doubled_Distances
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
		    int n = scan.nextInt();
		    int[] a = new int[n];
		    for(int i=0;i<n;i++) a[i]=scan.nextInt();
		    Arrays.sort(a);
		    int left=0;
		    int right=0;
		    boolean flag = true;
		    for(int i=1;i<n-1;i++)
		    {
		        left = a[i]-a[i-1];
		        right = a[i+1]-a[i];
		        if((left*2)!=right && (right*2)!=left)
		        {
		            flag = false;
		            break;
		        }
		    }
            System.out.println(flag?"Yes":"No");
		}

	}
}
