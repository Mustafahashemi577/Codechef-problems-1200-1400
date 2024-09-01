import java.util.*;
import java.lang.*;
import java.io.*;

class Breaking_Bricks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int s = scan.nextInt();
		    int w1 = scan.nextInt();
		    int w2 = scan.nextInt();
		    int w3 = scan.nextInt();
	       if(w1+w2+w3<=s)
	          System.out.println(1);
	       else if(w1+w2<=s||w3+w2<=s)
	          System.out.println(2);
	       else
	          System.out.println(3);
		}
	}
}
