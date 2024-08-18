import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Or_Maximum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0 ){
		    int n = scan.nextInt();
		    int a[] = new int[n];
		    for (int i = 0 ; i < n ; i++ ) a[i] = scan.nextInt();
		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    boolean flag = true;
		    for( int i = 0 ; i < n ; i++ ){
		        if( a[i] > max ){
		            max = a[i];
		        }
		        if( a[i] < min ){
		            min = a[i];
		        }
		        if( a[i] != min && a[i] != max ){
		            flag = false;
		        }
		    }
		    if(flag ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
