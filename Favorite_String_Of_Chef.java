import java.util.*;
import java.lang.*;
import java.io.*;

class Favorite_String_Of_Chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while (t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    boolean result = false;
		    
		    for(int i = 0;i<s.length()-3;i++){
		        if(s.charAt(i)=='c' && s.charAt(i+1)=='o'&& s.charAt(i+2)=='d' && s.charAt(i+3)=='e'){
		            String sb = s.substring(i+4);
		            String sb1 = s.substring(0,i);
		            if(sb.contains("chef") && !sb1.contains("chef")){
		                result=true;
		                break;
		            }
		        }    
		    }
		    System.out.println(result==true?"AC":"WA");
		} 
	}
}
