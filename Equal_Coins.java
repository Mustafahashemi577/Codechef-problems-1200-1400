import java.util.*;
import java.lang.*;
import java.io.*;

class Equal_Coins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    
		    if((x+2*y)%2!=0 || (y%2!=0 && x<2))
		  {
		      System.out.println("NO");
		  }else{
		      System.out.println("YES");
		  }    
		}
	}
}
