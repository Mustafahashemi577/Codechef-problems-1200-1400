import java.util.*;
import java.lang.*;
import java.io.*;

class Palindromic_Substrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String a = scan.next();
		    String b = scan.next();
		    boolean result = false;
		    if(a.length() <= b.length()){
		        for (int i=0; i<a.length() ; i++){
		            if(b.indexOf((a.substring(i, i+1))) != -1){
		                result = true;
		                break;
		            } 
		        } 
		    }else{
		        for (int i=0; i<b.length() ; i++){
		            if(a.indexOf((b.substring(i, i+1))) != -1){
		                result = true;
		                break;
		            } 
		        } 
		    }
		    if(result)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
