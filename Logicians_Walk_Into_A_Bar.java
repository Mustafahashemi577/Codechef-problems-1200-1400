import java.util.*;
import java.lang.*;
import java.io.*;

class Logicians_Walk_Into_A_Bar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    boolean prevoiusZero = false;
		    for(int i = 0;i<n-1;i++){
		        if(prevoiusZero)
		        System.out.println("NO");
		        else if(s.charAt(i)=='0'){
		            prevoiusZero = true;
		            System.out.println("NO");
		        }
		        else
		        System.out.println("IDK");
		    }
		    if(s.charAt(n-1)=='1'&& prevoiusZero==false)
		        System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
