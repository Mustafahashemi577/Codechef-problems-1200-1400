import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Subset
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a,b,c,d;
		     a=scan.nextInt();
		     b=scan.nextInt();
		     c=scan.nextInt();
		     d=scan.nextInt();
		     if(a==0||b==0||c==0||d==0||a+b==0||a+c==0||a+d==0||a+b+c==0||a+b+d==0||a+c+d==0||a+b+c+d==0||b+c==0||b+d==0||b+c+d==0||c+d==0)
                System.out.println("Yes");
             
             else
                System.out.println("No");
		}

	}
}
