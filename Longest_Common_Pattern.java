import java.util.*;
import java.lang.*;
import java.io.*;

class Longest_Common_Pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while (t-->0){
	        String str1 = scan.next();
	        String str2 = scan.next();
	        int count = 0;
	        for(int i = 0;i<str1.length()&&str2.length()>0;i++){
	            var temp = str1.substring(i,i+1);
	            if(str2.contains(temp)){
	                count++;
	                var index = str2.indexOf(str1.charAt(i));
	                var s = str2;
	                str2=s.substring(0,index)+s.substring(index+1,str2.length());
	                
	            }
	        }
	        System.out.println(count);
	    } 
	}
}
