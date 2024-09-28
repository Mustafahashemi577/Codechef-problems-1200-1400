import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_His_Characters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		 String s = scan.next();
		 StringBuilder sb = new StringBuilder(s);
		 int count = 0;
		     for(int i = 0;i+3<s.length();i++){
		         String temp = s.substring(i,i+4);
		         if(temp.contains("c")&&temp.contains("h")&&temp.contains("e")&&temp.contains("f"))
		            count++;
		     }
		     System.out.println( count == 0?"normal":"lovely "+count);
		}
	}
}
