import java.util.*;
import java.lang.*;
import java.io.*;

class New_Piece
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int p = scan.nextInt();
	        int q = scan.nextInt();
	        if(a==p && b==q)
	        System.out.println(0);
	        else if (((a+b)%2)!=((p+q)%2))
	        System.out.println(1);
	        else if (((a+b)%2)==((p+q)%2))
	        System.out.println(2);
	    }
	}
}
