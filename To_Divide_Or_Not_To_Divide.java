import java.util.*;
import java.lang.*;
import java.io.*;

class To_Divide_Or_Not_To_Divide
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		   Long a=scan.nextLong();
		   Long b=scan.nextLong();
		   Long n=scan.nextLong();
		   if(a%b==0){
		       System.out.println(-1);
		       continue;
		   }
		   
		  long s=n-(n%a);
		  if(n%a!=0){
		  s+=a;
		  }
		  if(s%b==0)
		  s+=a;
		      System.out.println(s);
		      }

	}
}
