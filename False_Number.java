import java.util.*;
import java.lang.*;
import java.io.*;

class False_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    if(s.charAt(0)=='2' || s.charAt(0)=='3' || s.charAt(0)=='4' || s.charAt(0)=='5' || s.charAt(0)=='6' || s.charAt(0)=='7' || s.charAt(0)=='8' ||s.charAt(0)=='9'){
		        s="1"+s;
		    }
		    else if(s.charAt(0)=='1'){
		        StringBuilder sb = new StringBuilder(s);
		        sb.insert(1,'0');
		        s=sb.toString();
		    }
		    System.out.println(s);
		}
	}
}
