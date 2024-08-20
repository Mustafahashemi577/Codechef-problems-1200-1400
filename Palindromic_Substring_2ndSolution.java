import java.util.*;
import java.lang.*;
import java.io.*;

class Palindromic_Substring_2ndSolution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String a = scan.next();
		    String b = scan.next();
		    boolean result = false;
		    for(int i = 0;i<a.length();i++){
		        String temp = a.substring(i,i+1);
		        if(b.contains(temp)){
		            result = true;
		            break;
		        }
		    }
		    System.out.println(result==true?"Yes":"No");
		}
	}
}
