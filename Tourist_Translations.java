import java.util.*;
import java.lang.*;
import java.io.*;

class Tourist_Translations
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String m = scan.next();
		while(t-->0){
		    String input = scan.next();
		    StringBuffer result = new StringBuffer();
		    for(int i =0;i<input.length();i++){
		        int temp = input.charAt(i);
		        if(temp==95)
		            result.append(" ");
		        else if (temp>=65 && temp<=90)
		        {
		            int d = Math.abs(temp-65);
		            char a = Character.toUpperCase(m.charAt(d));
		            result.append(a);
		        }
		        else if (temp>=97 && temp<=122){
		            int d = Math.abs(temp-97);
		            char a = m.charAt(d);
		            result.append(a);
		        }
		        else{
		            result.append(input.charAt(i));
		        }
		    }
		    System.out.println(result.toString());
		}
	}
}
