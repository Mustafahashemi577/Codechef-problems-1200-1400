import java.util.*;
import java.lang.*;
import java.io.*;

class Bear_And_Milky_Cookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    boolean result = true;
		    String s [] = new String[n];
		    for(int i = 0;i<n;i++){
		        s[i]=scan.next();
		    }
		    if (s[n-1].equals("cookie"))
		    result=false;
		    else{
		    for(int i=0;i<n-1;i+=2)
		        if(s[i].equals("cookie") && s[i+1].equals(s[i])){
		            result=false;
		            break;
		            }
		    }
		    System.out.println(result==true?"YES":"NO");
		}
	}
}
